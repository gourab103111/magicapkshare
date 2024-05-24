package com.scriptsbundle.adforest.profile

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.gson.JsonObject
import com.squareup.picasso.Picasso
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.scriptsbundle.adforest.R
import com.scriptsbundle.adforest.ad_detail.Ad_detail_activity
import com.scriptsbundle.adforest.helper.MyAdsOnclicklinstener
import com.scriptsbundle.adforest.home.HomeActivity
import com.scriptsbundle.adforest.modelsList.myAdsModel
import com.scriptsbundle.adforest.profile.adapter.ItemBlockedAds
import com.scriptsbundle.adforest.public_profile.social_icons
import com.scriptsbundle.adforest.utills.CustomBorderDrawable
import com.scriptsbundle.adforest.utills.NestedScroll
import com.scriptsbundle.adforest.utills.Network.RestService
import com.scriptsbundle.adforest.utills.SettingsMain
import com.scriptsbundle.adforest.utills.UrlController
import java.io.IOException
import java.net.SocketTimeoutException
import java.util.concurrent.TimeoutException

class BlockedAds : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var mainRelative: RelativeLayout
    lateinit var shimmerLinear: LinearLayout
    lateinit var shimmerFrameLayout: ShimmerFrameLayout
    lateinit var cardView: CardView
    lateinit var linearLayoutCardView: LinearLayout
    lateinit var imageViewProfile: ImageView
    lateinit var txtViewName: TextView
    lateinit var txtViewVerified: TextView
    lateinit var imgMmore: ImageView
    lateinit var rlMore: RelativeLayout
    lateinit var txtloginTime: TextView
    lateinit var ratingBar: RatingBar
    lateinit var txtRatingNum: TextView
    lateinit var introductionLinearLayout: LinearLayout
    lateinit var txtIntro: TextView
    lateinit var adsStats: LinearLayout
    lateinit var txtSold: TextView
    lateinit var txtActive: TextView
    lateinit var txtInactive: TextView
    lateinit var noDataTxt: TextView
    lateinit var progressBar: ProgressBar
    lateinit var restService: RestService
    lateinit var settingsMain: SettingsMain
    lateinit var adapter: ItemBlockedAds
    lateinit var publicProfileCustomIcons: LinearLayout
    var nextPage = 1
    var loading = true
    var hasNextPage: Boolean = false
    lateinit var nestedScrollView: NestedScrollView
    private val list = java.util.ArrayList<myAdsModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blocked_ads)
        settingsMain = SettingsMain(applicationContext)
        restService = UrlController.createService<RestService>(
            RestService::class.java,
            settingsMain.userEmail,
            settingsMain.userPassword,
            applicationContext
        )
        progressBar = findViewById (R.id.progressBar4)
        nestedScrollView = findViewById(R.id.mainScrollView)
        progressBar.visibility = View.GONE
        mainRelative = findViewById(R.id.mainRelative)
        shimmerLinear = findViewById(R.id.shimmerMain)
        shimmerFrameLayout = findViewById(R.id.shimmerFrameLayout)
        cardView = findViewById(R.id.card_view)
        linearLayoutCardView = findViewById(R.id.linear_layout_card_view)
        imageViewProfile = findViewById(R.id.image_view)
        txtViewName = findViewById(R.id.text_viewName)
        txtViewVerified = findViewById(R.id.verified)
        imgMmore = findViewById(R.id.img_more)
        rlMore = findViewById(R.id.rlMore)
        rlMore.visibility = View.GONE
        txtloginTime = findViewById(R.id.loginTime)
        ratingBar = findViewById(R.id.ratingBar)
        txtRatingNum = findViewById(R.id.numberOfRate)
        introductionLinearLayout = findViewById(R.id.introduction)
        txtIntro = findViewById(R.id.textIntroduction)
        introductionLinearLayout.visibility = View.GONE
        txtIntro.visibility = View.GONE
        adsStats = findViewById(R.id.ll11)
        txtSold = findViewById(R.id.share)
        txtActive = findViewById(R.id.addfav)
        txtInactive = findViewById(R.id.report)
        recyclerView = findViewById(R.id.cardView)
        noDataTxt = findViewById(R.id.textView5)
        publicProfileCustomIcons = findViewById(R.id.publicProfileCustomIcons)
        publicProfileCustomIcons.visibility = View.GONE

        val MyLayoutManager = GridLayoutManager(applicationContext, 2)
        MyLayoutManager.orientation = RecyclerView.VERTICAL
        recyclerView.layoutManager = MyLayoutManager

        // This will pass the ArrayList to our Adapter
        val adapter = ItemBlockedAds(this, list)
        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.isNestedScrollingEnabled = false
        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        actionBar?.setBackgroundDrawable(ColorDrawable(Color.parseColor(SettingsMain.getMainColor())))
        adforest_getBlockedAds();
        nestedScrollView.setOnScrollChangeListener(object : NestedScroll() {
            override fun onScroll() {
                if (loading) {
                    loading = false
                    Log.d("info data object", "sdfasdfadsasdfasdfasdf")
                    if (hasNextPage) {
                        progressBar.visibility = View.VISIBLE
                        adforest_loadMore(nextPage)
                    }
                }
            }
        })
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    fun adforest_getBlockedAds() {
        shimmerLinear.visibility = View.VISIBLE
        shimmerFrameLayout.visibility = View.VISIBLE
        shimmerFrameLayout.startShimmer()
        mainRelative.visibility = View.GONE
        val params = JsonObject()
        params.addProperty("page_number", "1")
        Log.d("info Send Param =", "" + params.toString())
        val myCall: Call<ResponseBody> = restService.postBlockedAds(
            params, UrlController.AddHeaders(applicationContext)
        )
        myCall.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, responseObj: Response<ResponseBody>) {
                try {
                    if (responseObj.isSuccessful) {
                        Log.d("info Blocked Responce", "" + responseObj.toString())
                        val response = JSONObject(responseObj.body()!!.string())
                        if (response.getBoolean("success")) {
                            Log.d("info Blocked Api", "" + response)
                            shimmerLinear.visibility = View.GONE
                            shimmerFrameLayout.visibility = View.GONE
                            shimmerFrameLayout.stopShimmer()
                            mainRelative.visibility = View.VISIBLE
//                            applicationContext.setTitle(
//                                response.getJSONObject("data").getString("page_title")
//                            )

                            // Get the action bar and set the title
                            val actionBar = supportActionBar
                            actionBar?.setTitle(
                                response.getJSONObject("data").getString("page_title")
                            )
                            txtloginTime.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("last_login")
                            )
                            txtViewName.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("display_name")
                            )
                            settingsMain.userImage =
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("profile_img")

                            Picasso.get().load(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("profile_img")
                            )
                                .error(R.drawable.placeholder)
                                .placeholder(R.drawable.placeholder)
                                .into(imageViewProfile)
                            txtSold.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("ads_sold")
                            )
                            txtActive.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("ads_total")
                            )
                            txtInactive.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getString("ads_inactive")
                            )
                            txtViewVerified.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getJSONObject("verify_buton").getString("text")
                            )
                            txtViewVerified.setBackground(
                                CustomBorderDrawable.customButton(
                                    0, 0, 0, 0,
                                    response.getJSONObject("data").getJSONObject("profile_extra")
                                        .getJSONObject("verify_buton").getString("color"),
                                    response.getJSONObject("data").getJSONObject("profile_extra")
                                        .getJSONObject("verify_buton").getString("color"),
                                    response.getJSONObject("data").getJSONObject("profile_extra")
                                        .getJSONObject("verify_buton").getString("color"), 3
                                )
                            )
                            if (response.getJSONObject("data").getJSONObject("introduction")
                                    .getString("value") != ""
                            ) {
                                txtIntro.setVisibility(View.VISIBLE)
                                introductionLinearLayout.visibility = View.VISIBLE
                                txtIntro.setText(
                                    response.getJSONObject("data").getJSONObject("introduction")
                                        .getString("value")
                                )
                            }
                            val jsonObjectPagination =
                                response.getJSONObject("data").getJSONObject("pagination")

                            nextPage = jsonObjectPagination.getInt("next_page")
                            hasNextPage = jsonObjectPagination.getBoolean("has_next_page")

                            if (response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getBoolean("is_show_social")
                            ) {
                                Log.d("Info custom", "====Add all===")
                                social_icons.adforest_setViewsForCustom(
                                    response.getJSONObject("data").getJSONObject("profile_extra"),
                                    publicProfileCustomIcons,
                                    applicationContext
                                )
                            }
                            ratingBar.numStars = 5
                            ratingBar.rating =
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getJSONObject("rate_bar")
                                    .getString("number").toFloat()
                            txtRatingNum.setText(
                                response.getJSONObject("data").getJSONObject("profile_extra")
                                    .getJSONObject("rate_bar")
                                    .getString("text")
                            )

                            makeList(
                                response.getJSONObject("data")
                            )
                            HomeActivity.loadingScreen = false

                            if (list.size > 0) {
                                adapter = ItemBlockedAds(applicationContext, list)
                                recyclerView.adapter = adapter
                                adapter.setOnItemClickListener(object : MyAdsOnclicklinstener {
                                    override fun onItemClick(item: myAdsModel) {
                                        val intent = Intent(
                                            applicationContext, Ad_detail_activity::class.java
                                        )
                                        intent.putExtra("adId", item.adId)
                                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                                        applicationContext.startActivity(intent)
//                                        getActivity().overridePendingTransition(
//                                            R.anim.right_enter,
//                                            R.anim.left_out
//                                        )
                                    }

                                    override fun delViewOnClick(v: View, position: Int) {

                                    }

                                    override fun editViewOnClick(v: View, position: Int) {

                                    }

                                    override fun onImgMoreItemClick(item: myAdsModel, v: View) {
                                        // Inflate the menu layout

                                        // Inflate the menu layout
                                        val popupMenu = PopupMenu(applicationContext, v)
                                        popupMenu.menuInflater.inflate(
                                            R.menu.item_more, popupMenu.menu
                                        )

                                        val textView_block =
                                            popupMenu.menu.findItem(R.id.txt_block) as MenuItem
                                        val textView_report =
                                            popupMenu.menu.findItem(R.id.txt_report) as MenuItem

                                        textView_block.title =
                                            response.getJSONObject("data").getString("unblock")
                                        textView_report.title = ""
                                        textView_report.isVisible = false
                                        // Set a click listener on the menu items

                                        // Set a click listener on the menu items
                                        popupMenu.setOnMenuItemClickListener { menuItem ->
                                            // Handle menu item clicks here
                                            when (menuItem.itemId) {
                                                R.id.txt_report -> {
                                                    // Do something for menu item 1
                                                    Toast.makeText(
                                                        applicationContext,
                                                        "Reported",
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                    true
                                                }
                                                R.id.txt_block -> {
                                                    // Do something for menu item 2
                                                    adforest_unblockAd(item.adId)
//                                                    Toast.makeText(
//                                                        applicationContext,
//                                                        "Blocked" + item.getAdId(),
//                                                        Toast.LENGTH_SHORT
//                                                    ).show();
                                                    true
                                                }
                                                else -> false
                                            }
                                        }

                                        // Show the menu

                                        // Show the menu
                                        popupMenu.show()
                                    }
                                })
                            } else {
//                                textViewEmptyData.setVisibility(View.VISIBLE)
//                                textViewEmptyData.setText(response["message"].toString())
                            }
//                            shimmerFrameLayout.stopShimmer()
//                            shimmerFrameLayout.visibility = View.GONE
//                            loadingLayout.visibility = View.GONE
                        } else {
//                            linearLayoutMain.visibility = View.VISIBLE
//                            shimmerFrameLayout.stopShimmer()
//                            shimmerFrameLayout.visibility = View.GONE
//                            loadingLayout.visibility = View.GONE
                            Toast.makeText(
                                applicationContext,
                                response.getString("message").toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
//                    linearLayoutMain.visibility = View.VISIBLE
//                    shimmerFrameLayout.stopShimmer()
//                    shimmerFrameLayout.visibility = View.GONE
//                    loadingLayout.visibility = View.GONE
                } catch (e: IOException) {
                    e.printStackTrace()
//                    linearLayoutMain.visibility = View.VISIBLE
//                    shimmerFrameLayout.stopShimmer()
//                    shimmerFrameLayout.visibility = View.GONE
//                    loadingLayout.visibility = View.GONE
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                linearLayoutMain.visibility = View.VISIBLE
//                shimmerFrameLayout.stopShimmer()
//                shimmerFrameLayout.visibility = View.GONE
//                loadingLayout.visibility = View.GONE
                Log.d("info Register error", t.toString())
                Log.d("info Register error", t.message + t.cause + t.fillInStackTrace())
            }
        })
    }

    fun adforest_unblockAd(adId: String?) {
        if (SettingsMain.isConnectingToInternet(applicationContext)) {
//            loadingLayout.setVisibility(View.VISIBLE)
            shimmerFrameLayout.visibility = View.VISIBLE
            shimmerFrameLayout.startShimmer()
            val params = JsonObject()
            params.addProperty("ad_id", adId)
            Log.d("info sendblockAd", params.toString())
            val myCall =
                restService.postUnBlockAd(params, UrlController.AddHeaders(applicationContext))
            myCall.enqueue(object : Callback<ResponseBody> {
                override fun onResponse(
                    call: Call<ResponseBody>,
                    responseObj: Response<ResponseBody>
                ) {
                    try {
                        if (responseObj.isSuccessful) {
                            //   Log.d("info BlockAd Resp", "" + responseObj.toString());
                            val response = JSONObject(responseObj.body()!!.string())
                            if (response.getBoolean("success")) {
                                Log.d("info BlockAd ", "" + response)
                                shimmerFrameLayout.stopShimmer()
                                shimmerFrameLayout.visibility = View.GONE
//                                loadingLayout.setVisibility(View.GONE)
                                mainRelative.visibility = View.VISIBLE
                                Toast.makeText(
                                    applicationContext,
                                    response["message"].toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                                adforest_getBlockedAds()
                                adapter.notifyDataSetChanged()
                            } else {
                                Toast.makeText(
                                    applicationContext,
                                    response["message"].toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                    } catch (e: JSONException) {
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                        e.printStackTrace()
                    } catch (e: IOException) {
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                        e.printStackTrace()
                    }
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
//                    loadingLayout.setVisibility(View.GONE)
                    mainRelative.visibility = View.VISIBLE
                    Log.d("info FeaturedAds error", t.toString())
                    Log.d(
                        "info FeaturedAds error",
                        t.message + t.cause + t.fillInStackTrace()
                    )
                }
            })
        } else {
            shimmerFrameLayout.stopShimmer()
            shimmerFrameLayout.visibility = View.GONE
//            loadingLayout.setVisibility(View.GONE)
            mainRelative.visibility = View.VISIBLE
            Toast.makeText(applicationContext, "Internet error", Toast.LENGTH_SHORT).show()
        }
    }

    fun makeList(data: JSONObject) {
        list.clear()
        try {
            val jsonArray = data.getJSONArray("ads")
            Log.d("jsonaarry is = ", jsonArray.toString())
            if (jsonArray.length() > 0) for (i in 0 until jsonArray.length()) {
                val item = myAdsModel()
                val `object` = jsonArray.getJSONObject(i)
                item.adId = `object`.getString("ad_id")
                item.name = `object`.getString("ad_title")
                item.adStatus = `object`.getJSONObject("ad_status").getString("status")
                item.adStatusValue = `object`.getJSONObject("ad_status").getString("status_text")
                item.price = `object`.getJSONObject("ad_price").getString("price")
                item.image = `object`.getJSONArray("images").getJSONObject(0).getString("thumb")

                list.add(item)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

    private fun adforest_loadMore(nextPag: Int) {
        if (SettingsMain.isConnectingToInternet(applicationContext)) {
            val params = JsonObject()
            params.addProperty("page_number", nextPag)
            Log.d("info sendPublic Load", params.toString())
            val myCall =
                restService.postBlockedAds(
                    params,
                    UrlController.AddHeaders(applicationContext)
                )
            myCall.enqueue(object : Callback<ResponseBody> {
                override fun onResponse(
                    call: Call<ResponseBody>,
                    responseObj: Response<ResponseBody>
                ) {
                    try {
                        if (responseObj.isSuccessful) {
                            Log.d("info PublicPrMore Resp", "" + responseObj.toString())
                            val response = JSONObject(
                                responseObj.body()!!.string()
                            )
                            if (response.getBoolean("success")) {
                                Log.d("info PublicProfile obj", "" + response.getJSONObject("data"))
                                Log.d(
                                    "info Public Profile",
                                    "" + response.getJSONObject("data")
                                        .getJSONObject("profile_extra")
                                )
                                val jsonObjectPagination =
                                    response.getJSONObject("data").getJSONObject("pagination")
                                nextPage = jsonObjectPagination.getInt("next_page")
                                hasNextPage = jsonObjectPagination.getBoolean("has_next_page")
                                loadMoreList(
                                    response.getJSONObject("data")
                                )
                                loading = true
                                adapter.notifyDataSetChanged()
                            } else {
                                Toast.makeText(
                                    applicationContext,
                                    response["message"].toString(),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                    } catch (e: JSONException) {
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                        e.printStackTrace()
                    } catch (e: IOException) {
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                        e.printStackTrace()
                    }
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
//                    loadingLayout.setVisibility(View.GONE)
                    mainRelative.visibility = View.VISIBLE
                    progressBar.visibility = View.GONE
                }

                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    if (t is TimeoutException) {
                        Toast.makeText(
                            applicationContext,
                            settingsMain.getAlertDialogMessage("internetMessage"),
                            Toast.LENGTH_SHORT
                        ).show()
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                    }
                    if (t is SocketTimeoutException || t is NullPointerException) {
                        Toast.makeText(
                            applicationContext,
                            settingsMain.getAlertDialogMessage("internetMessage"),
                            Toast.LENGTH_SHORT
                        ).show()
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                    }
                    if (t is NullPointerException || t is UnknownError || t is NumberFormatException) {
                        Log.d("info FeaturedMore ", "NullPointert Exception" + t.localizedMessage)
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                    } else {
                        shimmerFrameLayout.stopShimmer()
                        shimmerFrameLayout.visibility = View.GONE
//                        loadingLayout.setVisibility(View.GONE)
                        mainRelative.visibility = View.VISIBLE
                        Log.d("info FeaturedMore err", t.toString())
                        Log.d(
                            "info FeaturedMore err",
                            t.message + t.cause + t.fillInStackTrace()
                        )
                    }
                }
            })
        } else {
            shimmerFrameLayout.stopShimmer()
            shimmerFrameLayout.visibility = View.GONE
//            loadingLayout.setVisibility(View.GONE)
            mainRelative.visibility = View.VISIBLE
            Toast.makeText(applicationContext, "Internet error", Toast.LENGTH_SHORT).show()
        }
    }

    fun loadMoreList(data: JSONObject,) {
        try {
            val jsonArray = data.getJSONArray("ads")
            Log.d("jsonaarry is = ", jsonArray.toString())
            if (jsonArray.length() > 0) for (i in 0 until jsonArray.length()) {
                val item = myAdsModel()
                val `object` = jsonArray.getJSONObject(i)
                item.adId = `object`.getString("ad_id")
                item.name = `object`.getString("ad_title")
                item.adStatus = `object`.getJSONObject("ad_status").getString("status")
                item.adStatusValue = `object`.getJSONObject("ad_status").getString("status_text")
                item.price = `object`.getJSONObject("ad_price").getString("price")
                item.image = `object`.getJSONArray("images").getJSONObject(0).getString("thumb")

                list.add(item)
            }
        } catch (e: JSONException) {
            e.printStackTrace()
        }
    }

}