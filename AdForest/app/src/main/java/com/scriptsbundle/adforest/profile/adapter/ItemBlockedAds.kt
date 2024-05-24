package com.scriptsbundle.adforest.profile.adapter

import android.content.Context
import android.graphics.Color
import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.JsonObject
import com.squareup.picasso.Picasso
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.scriptsbundle.adforest.R
import com.scriptsbundle.adforest.helper.MyAdsOnclicklinstener
import com.scriptsbundle.adforest.home.HomeActivity
import com.scriptsbundle.adforest.modelsList.myAdsModel
import com.scriptsbundle.adforest.utills.Network.RestService
import com.scriptsbundle.adforest.utills.SettingsMain
import com.scriptsbundle.adforest.utills.UrlController
import java.io.IOException
 class ItemBlockedAds(
    private val mContext: Context,
    private val list: ArrayList<myAdsModel>
) :
    RecyclerView.Adapter<ItemBlockedAds.MyViewHolder?>() {
    var restService: RestService
    private var onItemClickListener: MyAdsOnclicklinstener? = null
    private val settingsMain: SettingsMain
    private var temp: ArrayList<String>? = null

    init {
        settingsMain = SettingsMain(mContext)
        restService = UrlController.createService(
            RestService::class.java, settingsMain.userEmail, settingsMain.userPassword, mContext
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemof_public_profile, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val feedItem = list[position]
        holder.name.text = list[position].name
        if (!TextUtils.isEmpty(feedItem.image)) {
            Picasso.get().load(feedItem.image)
                .resize(270, 270).centerCrop()
                .error(R.drawable.placeholder)
                .placeholder(R.drawable.placeholder)
                .into(holder.mainImage)
        }
        holder.priceTV.text = list[position].price
        holder.linearLayout.tag = list[position].adId

        val listener = View.OnClickListener { onItemClickListener!!.onItemClick(feedItem) }
        holder.linearLayout.setOnClickListener(listener)
        holder.img_more.setOnClickListener(View.OnClickListener { v ->
            onItemClickListener!!.onImgMoreItemClick(
                feedItem,
                v
            )
        })
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun setOnItemClickListener(onItemClickListener: MyAdsOnclicklinstener?) {
        this.onItemClickListener = onItemClickListener
    }


    private fun update(adId: String, adStatus: String) {
        if (SettingsMain.isConnectingToInternet(mContext)) {
            HomeActivity.shimmerFrameLayout.startShimmer()
            HomeActivity.loadingLayout.visibility = View.VISIBLE
            HomeActivity.shimmerFrameLayout.visibility = View.VISIBLE
            val params = JsonObject()
            params.addProperty("ad_id", adId)
            params.addProperty("ad_status", adStatus)
            Log.d("info Send AdChngStatus", params.toString())
            val myCall = restService.postUpdateAdStatus(params, UrlController.AddHeaders(mContext))
            myCall.enqueue(object : Callback<ResponseBody> {
                override fun onResponse(
                    call: Call<ResponseBody>,
                    responseObj: Response<ResponseBody>
                ) {
                    try {
                        if (responseObj.isSuccessful) {
                            Log.d("info AdStatus Resp", "" + responseObj.toString())
                            val response = JSONObject(
                                responseObj.body()!!.string()
                            )
                            if (response.getBoolean("success")) {
                                Log.d("info AdsStatus Change", "" + response["message"].toString())
                                Toast.makeText(
                                    mContext,
                                    response["message"].toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                                SettingsMain.reload(mContext, "MyAdsExpire")
                            } else {
                                Toast.makeText(
                                    mContext,
                                    response["message"].toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                            HomeActivity.shimmerFrameLayout.stopShimmer()
                            HomeActivity.shimmerFrameLayout.visibility = View.GONE
                            HomeActivity.loadingLayout.visibility = View.GONE
                        }
                    } catch (e: JSONException) {
                        HomeActivity.shimmerFrameLayout.stopShimmer()
                        HomeActivity.shimmerFrameLayout.visibility = View.GONE
                        HomeActivity.loadingLayout.visibility = View.GONE
                        e.printStackTrace()
                    } catch (e: IOException) {
                        HomeActivity.shimmerFrameLayout.stopShimmer()
                        HomeActivity.shimmerFrameLayout.visibility = View.GONE
                        HomeActivity.loadingLayout.visibility = View.GONE
                        e.printStackTrace()
                    }
                    HomeActivity.shimmerFrameLayout.stopShimmer()
                    HomeActivity.shimmerFrameLayout.visibility = View.GONE
                    HomeActivity.loadingLayout.visibility = View.GONE
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    HomeActivity.shimmerFrameLayout.stopShimmer()
                    HomeActivity.shimmerFrameLayout.visibility = View.GONE
                    HomeActivity.loadingLayout.visibility = View.GONE
                    Log.d("info AdStatus error", t.toString())
                    Log.d(
                        "info AdStatus error",
                        t.message + t.cause + t.fillInStackTrace()
                    )
                }
            })
        } else {
            HomeActivity.shimmerFrameLayout.stopShimmer()
            HomeActivity.shimmerFrameLayout.visibility = View.GONE
            HomeActivity.loadingLayout.visibility = View.GONE
            Toast.makeText(mContext, "Internet error", Toast.LENGTH_SHORT).show()
        }
    }

    inner class MyViewHolder(v: View) : RecyclerView.ViewHolder(v) {
        var name: TextView
        var priceTV: TextView
        var mainImage: ImageView
        var img_more: ImageView
        var linearLayout: RelativeLayout


        init {
            name = v.findViewById(R.id.text_view_name)
            priceTV = v.findViewById(R.id.prices)
            priceTV.setTextColor(Color.parseColor(SettingsMain.getMainColor()))
            img_more = v.findViewById(R.id.img_more)
            mainImage = v.findViewById(R.id.image_view)
            linearLayout = v.findViewById(R.id.linear_layout_card_view)

        }
    }
}