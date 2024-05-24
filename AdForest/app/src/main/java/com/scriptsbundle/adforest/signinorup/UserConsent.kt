package com.scriptsbundle.adforest.signinorup

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.SharedPreferences
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Typeface
import android.graphics.drawable.ColorDrawable
import android.net.http.SslError
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.view.View
import android.webkit.SslErrorHandler
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.*
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import androidx.core.widget.NestedScrollView
import com.facebook.shimmer.ShimmerFrameLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.gson.JsonObject
import com.squareup.picasso.Picasso
import okhttp3.ResponseBody
import org.json.JSONException
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import com.scriptsbundle.adforest.R
import com.scriptsbundle.adforest.home.HomeActivity
import com.scriptsbundle.adforest.utills.Network.RestService
import com.scriptsbundle.adforest.utills.SettingsMain
import com.scriptsbundle.adforest.utills.UrlController
import java.io.IOException
import java.net.SocketTimeoutException
import java.util.concurrent.TimeoutException


class UserConsent : AppCompatActivity() {
    lateinit var textViewTitle: TextView
    lateinit var imgLogo: ImageView
    lateinit var txtUpdateDate: TextView
    lateinit var webiewTC: WebView
    lateinit var webVIewPR: WebView
    lateinit var restService: RestService
    lateinit var settingsMain: SettingsMain
    lateinit var txtPrivacyPolicy: TextView
    lateinit var txtTermsCondition: TextView
    lateinit var txtAgreePrivacyPolicy: TextView
    lateinit var txtAgreeTermsCondition: TextView
    lateinit var termConditionCheckBox: CheckBox
    lateinit var privacyPolicyCheckBox: CheckBox
    lateinit var linearLayoutMain: LinearLayout
    lateinit var shimmerFrameLayout: ShimmerFrameLayout
    lateinit var loadingLayout: LinearLayout
    lateinit var btnDecline: Button
    lateinit var btnAccept: Button
    lateinit var nestedScroll: NestedScrollView
    lateinit var fab: FloatingActionButton
    var termsCheckBoxValue: Boolean = false
    var privacyPolicyValue: Boolean = false
    var back_pressed: Boolean = false
    var privacyPageId: String = ""
    var termspageId: String = ""
    var termsDec :String = ""
    @RequiresApi(Build.VERSION_CODES.P)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.kt_user_consent)
        settingsMain = SettingsMain(applicationContext)
        restService = UrlController.createService(RestService::class.java,applicationContext)
        nestedScroll = findViewById(R.id.nestedScroll)
        linearLayoutMain = findViewById(R.id.mainLinear)
        shimmerFrameLayout = findViewById(R.id.shimmerFrameLayout)
        loadingLayout = findViewById(R.id.shimmerMain)
        fab = findViewById(R.id.fab)
        textViewTitle = findViewById(R.id.txt_title);
        txtUpdateDate = findViewById(R.id.txt_update_date)
        txtPrivacyPolicy = findViewById(R.id.txt_Privacy_heading)
        txtTermsCondition = findViewById(R.id.txt_termsCondition_heading)
        txtAgreeTermsCondition = findViewById(R.id.agree_termsCOndition)
        txtAgreePrivacyPolicy = findViewById(R.id.agree_privacyPolicy)
        termConditionCheckBox = findViewById(R.id.ch_termsCondition)
        privacyPolicyCheckBox = findViewById(R.id.ch_privacyPolicy)
        imgLogo = findViewById(R.id.logo)
        webiewTC = findViewById(R.id.terms_conditions_webView)
        webVIewPR = findViewById(R.id.privacy_policy_webView)
        btnAccept = findViewById(R.id.btnAccept)
        btnDecline = findViewById(R.id.btnDecline)


        txtPrivacyPolicy.setBackgroundColor(Color.parseColor(SettingsMain.getMainColor()))
        txtTermsCondition.setBackgroundColor(Color.parseColor(SettingsMain.getMainColor()))
        fab.backgroundTintList =
            ColorStateList.valueOf(Color.parseColor(SettingsMain.getMainColor()))
        textViewTitle.setTextColor(Color.parseColor(SettingsMain.getMainColor()))
        txtUpdateDate.setTextColor(Color.parseColor(SettingsMain.getMainColor()))
        txtPrivacyPolicy.setTextColor(Color.WHITE)
        txtTermsCondition.setTextColor(Color.WHITE)

        txtTermsCondition.setPadding(15)
        txtPrivacyPolicy.setPadding(15)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) {

            textViewTitle.typeface = Typeface.create(null, 700, false)
            txtUpdateDate.typeface = Typeface.create(null, 500, false)
            txtPrivacyPolicy.typeface = Typeface.create(null, 700, false)
            txtTermsCondition.typeface = Typeface.create(null, 700, false)
        }
        if (supportActionBar != null) {
            supportActionBar!!.setDisplayHomeAsUpEnabled(false)
            supportActionBar!!.setDisplayShowHomeEnabled(false)
            supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor(SettingsMain.getMainColor())))
        }

        fab.setOnClickListener {
            nestedScroll.fullScroll(ScrollView.FOCUS_DOWN)
        }
        val screentitle: String = getString(R.string.app_name)
        title = screentitle


        termConditionCheckBox.setOnClickListener {
            termsCheckBoxValue = !termsCheckBoxValue
            termConditionCheckBox.isChecked = termsCheckBoxValue
        }

        privacyPolicyCheckBox.setOnClickListener {
            privacyPolicyValue = !privacyPolicyValue
            privacyPolicyCheckBox.isChecked = privacyPolicyValue
        }


        btnAccept.setBackgroundColor(Color.parseColor(SettingsMain.getMainColor()))
        btnAccept.setTextColor(Color.WHITE)

        btnDecline.setBackgroundColor(Color.parseColor(SettingsMain.getMainColor()))
        btnDecline.setTextColor(Color.WHITE)

        /*  Buttons  CLick Listeners */
        btnAccept.setOnClickListener {
            if (termsCheckBoxValue && privacyPolicyValue) {
                settingsMain.privacyPolicyBool = true
                loadingLayout.visibility = View.VISIBLE
                shimmerFrameLayout.visibility = View.VISIBLE
                shimmerFrameLayout.startShimmer()
                linearLayoutMain.visibility = View.GONE
                val mHandler = Handler()
                mHandler.postDelayed({
                    val intent = Intent(this@UserConsent, HomeActivity::class.java)
                    startActivity(intent)
                    val editor: SharedPreferences.Editor = applicationContext.getSharedPreferences(
                        "com.adforest", Context.MODE_PRIVATE
                    ).edit()
                    editor.putString("isSocial", "false")
                    editor.apply()
                    this.overridePendingTransition(R.anim.right_enter, R.anim.left_out)
                    this.finish()
                    settingsMain.userEmail = ""
                    settingsMain.userImage = ""
                }, 1000L)
            } else {
                Toast.makeText(applicationContext, termsDec, Toast.LENGTH_SHORT)
                    .show()
            }
        }
        btnDecline.setOnClickListener {
            if (!back_pressed) {
                Toast.makeText(
                    applicationContext, settingsMain.getExitApp("exit"), Toast.LENGTH_SHORT
                ).show()
                back_pressed = true
                val mHandler = Handler()
                mHandler.postDelayed({ back_pressed = false }, 2000L)
            } else {
                val alert = androidx.appcompat.app.AlertDialog.Builder(this@UserConsent)
                alert.setTitle(settingsMain.getAlertDialogTitle("info"))
                alert.setCancelable(false)
                alert.setMessage(settingsMain.getExitApp("exit"))
                alert.setPositiveButton(
                    settingsMain.alertOkText
                ) { dialog: DialogInterface, which: Int ->
                    finishAffinity()
                    dialog.dismiss()
                    overridePendingTransition(R.anim.right_enter, R.anim.left_out)
                }
                alert.setNegativeButton(
                    settingsMain.alertCancelText
                ) { dialogInterface: DialogInterface, i: Int -> dialogInterface.dismiss() }
                alert.show()
            }
        }
        adforest_getRegisterViews();


    }

    override fun onBackPressed() {
        if (!back_pressed) {
            Toast.makeText(applicationContext, settingsMain.getExitApp("exit"), Toast.LENGTH_SHORT)
                .show()
            back_pressed = true
            val mHandler = Handler()
            mHandler.postDelayed({ back_pressed = false }, 2000L)
        } else {
            val alert = androidx.appcompat.app.AlertDialog.Builder(this@UserConsent)
            alert.setTitle(settingsMain.getAlertDialogTitle("info"))
            alert.setCancelable(false)
            alert.setMessage(settingsMain.getExitApp("exit"))
            alert.setPositiveButton(
                settingsMain.alertOkText
            ) { dialog: DialogInterface, which: Int ->
                finishAffinity()
                dialog.dismiss()
                overridePendingTransition(R.anim.right_enter, R.anim.left_out)
            }
            alert.setNegativeButton(
                settingsMain.alertCancelText
            ) { dialogInterface: DialogInterface, i: Int -> dialogInterface.dismiss() }
            alert.show()
        }
    }


    //GetRegister Data
    fun adforest_getRegisterViews() {
        loadingLayout.visibility = View.VISIBLE
        shimmerFrameLayout.visibility = View.VISIBLE
        shimmerFrameLayout.startShimmer()
        val myCall = restService.getRegisterView(UrlController.AddHeaders(applicationContext))
        myCall.enqueue(object : Callback<ResponseBody> {
            override fun onResponse(call: Call<ResponseBody>, responseObj: Response<ResponseBody>) {
                try {
                    if (responseObj.isSuccessful) {
                        Log.d("info Register Responce", "" + responseObj.toString())
                        val response = JSONObject(responseObj.body()!!.string())
                        if (response.getBoolean("success")) {
                            shimmerFrameLayout.stopShimmer()
                            shimmerFrameLayout.visibility = View.GONE
                            loadingLayout.visibility = View.GONE
                            Log.d("info Register object", "" + response.getJSONObject("data"))
                            Picasso.get().load(response.getJSONObject("data").getString("logo"))
                                .into(imgLogo)
                            textViewTitle.text =
                                response.getJSONObject("data").getString("terms_text")
                            txtUpdateDate.text =
                                response.getJSONObject("data").getString("privacy_text")
                            txtTermsCondition.text =
                                response.getJSONObject("data").getString("terms_text")
                            txtPrivacyPolicy.text =
                                response.getJSONObject("data").getString("privacy_text")
                            termspageId = response.getJSONObject("data").getString("term_page_id")
                            privacyPageId =
                                response.getJSONObject("data").getString("privacy_page_id")
                            txtAgreeTermsCondition.text =
                                response.getJSONObject("data").getString("terms_text")
                            txtAgreePrivacyPolicy.text =
                                response.getJSONObject("data").getString("privacy_text")
                            btnAccept.text = response.getJSONObject("data").getString("accept")
                            btnDecline.text = response.getJSONObject("data").getString("decline")
                            termsDec = response.getJSONObject("data").getString("term_desc")
                            webVIewPR.webViewClient = object : WebViewClient() {
                                override fun onReceivedSslError(
                                    view: WebView, handler: SslErrorHandler, error: SslError
                                ) {
                                    val builder = AlertDialog.Builder(applicationContext)
                                    builder.setMessage("SSL certificate is not safe!")
                                    builder.setPositiveButton(
                                        "continue"
                                    ) { dialog, which -> handler.proceed() }
                                    builder.setNegativeButton(
                                        "cancel"
                                    ) { dialog, which -> handler.cancel() }
                                    val dialog = builder.create()
                                    dialog.show()
                                }
                            }
                            webVIewPR.isScrollContainer = false
                            val webSettings = webVIewPR.settings
                            webSettings.textSize = WebSettings.TextSize.SMALLER

                            if (SettingsMain.isConnectingToInternet(applicationContext)) {
                                linearLayoutMain.visibility = View.GONE
                                loadingLayout.visibility = View.VISIBLE
                                shimmerFrameLayout.visibility = View.VISIBLE
                                shimmerFrameLayout.startShimmer()
                                val params = JsonObject()
                                params.addProperty("page_id", privacyPageId)
                                Log.d("info Send terms id =", "" + params.toString())
                                val myCall: Call<ResponseBody> = restService.postGetCustomePages(
                                    params, UrlController.AddHeaders(applicationContext)
                                )
                                myCall.enqueue(object : Callback<ResponseBody> {
                                    override fun onResponse(
                                        call: Call<ResponseBody>,
                                        responseObj: Response<ResponseBody>
                                    ) {
                                        try {
                                            if (responseObj.isSuccessful) {
                                                Log.d(
                                                    "info terms responce ",
                                                    "" + responseObj.toString()
                                                )
                                                val response = JSONObject(
                                                    responseObj.body()!!.string()
                                                )
                                                if (response.getBoolean("success")) {
                                                    linearLayoutMain.visibility = View.VISIBLE
                                                    shimmerFrameLayout.stopShimmer()
                                                    shimmerFrameLayout.visibility = View.GONE
                                                    loadingLayout.visibility = View.GONE
                                                    Log.d(
                                                        "info terms object",
                                                        "" + response.getJSONObject("data")
                                                    )
                                                    webVIewPR.loadDataWithBaseURL(
                                                        null,
                                                        response.getJSONObject("data")
                                                            .getString("page_content"),
                                                        "text/html",
                                                        "UTF-8",
                                                        null
                                                    )
//                                dialog.show()
                                                } else {
                                                    linearLayoutMain.visibility = View.VISIBLE
                                                    shimmerFrameLayout.stopShimmer()
                                                    shimmerFrameLayout.visibility = View.GONE
                                                    loadingLayout.visibility = View.GONE
                                                    Toast.makeText(
                                                        applicationContext,
                                                        response.getString("message").toString(),
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            }
                                        } catch (e: JSONException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            e.printStackTrace()
                                        } catch (e: IOException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            e.printStackTrace()
                                        }
                                    }

                                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                                        if (t is TimeoutException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Toast.makeText(
                                                applicationContext, "failed", Toast.LENGTH_SHORT
                                            ).show()

                                        }
                                        if (t is SocketTimeoutException || t is NullPointerException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Toast.makeText(
                                                applicationContext,
                                                settingsMain.getAlertDialogMessage("internetMessage"),
                                                Toast.LENGTH_SHORT
                                            ).show()

                                        }
                                        if (t is NullPointerException || t is UnknownError || t is NumberFormatException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Log.d(
                                                "info CustomPages ",
                                                "NullPointert Exception" + t.localizedMessage
                                            )
                                        } else {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Log.d("info  err", t.toString())
                                            Log.d(
                                                "info  err",
                                                t.message + t.cause + t.fillInStackTrace()
                                            )
                                        }
                                    }
                                })
                            } else {
                                linearLayoutMain.visibility = View.VISIBLE
                                shimmerFrameLayout.stopShimmer()
                                shimmerFrameLayout.visibility = View.GONE
                                loadingLayout.visibility = View.GONE
                                Toast.makeText(
                                    applicationContext,
                                    settingsMain.getAlertDialogMessage("internetMessage"),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }

                            webiewTC.webViewClient = object : WebViewClient() {
                                override fun onReceivedSslError(
                                    view: WebView, handler: SslErrorHandler, error: SslError
                                ) {
                                    val builder = AlertDialog.Builder(applicationContext)
                                    builder.setMessage("SSL certificate is not safe!")
                                    builder.setPositiveButton(
                                        "continue"
                                    ) { dialog, which -> handler.proceed() }
                                    builder.setNegativeButton(
                                        "cancel"
                                    ) { dialog, which -> handler.cancel() }
                                    val dialog = builder.create()
                                    dialog.show()
                                }
                            }
                            webiewTC.isScrollContainer = false
                            val webSettingsTC = webiewTC.settings
                            webSettingsTC.textSize = WebSettings.TextSize.SMALLER
                            if (SettingsMain.isConnectingToInternet(applicationContext)) {
                                linearLayoutMain.visibility = View.GONE
                                loadingLayout.visibility = View.VISIBLE
                                shimmerFrameLayout.visibility = View.VISIBLE
                                shimmerFrameLayout.startShimmer()
                                val params = JsonObject()
                                params.addProperty("page_id", termspageId)
                                Log.d("info Send terms id =", "" + params.toString())
                                val myCall: Call<ResponseBody> = restService.postGetCustomePages(
                                    params, UrlController.AddHeaders(applicationContext)
                                )
                                myCall.enqueue(object : Callback<ResponseBody> {
                                    override fun onResponse(
                                        call: Call<ResponseBody>,
                                        responseObj: Response<ResponseBody>
                                    ) {
                                        try {
                                            if (responseObj.isSuccessful) {
                                                linearLayoutMain.visibility = View.VISIBLE
                                                shimmerFrameLayout.stopShimmer()
                                                shimmerFrameLayout.visibility = View.GONE
                                                loadingLayout.visibility = View.GONE
                                                Log.d(
                                                    "info terms responce ",
                                                    "" + responseObj.toString()
                                                )
                                                val response = JSONObject(
                                                    responseObj.body()!!.string()
                                                )
                                                if (response.getBoolean("success")) {
                                                    Log.d(
                                                        "info terms object",
                                                        "" + response.getJSONObject("data")
                                                    )

                                                    webiewTC.loadDataWithBaseURL(
                                                        null,
                                                        response.getJSONObject("data")
                                                            .getString("page_content"),
                                                        "text/html",
                                                        "UTF-8",
                                                        null
                                                    )
                                                } else {
                                                    linearLayoutMain.visibility = View.VISIBLE
                                                    shimmerFrameLayout.stopShimmer()
                                                    shimmerFrameLayout.visibility = View.GONE
                                                    loadingLayout.visibility = View.GONE
                                                    Toast.makeText(
                                                        applicationContext,
                                                        response.getString("message").toString(),
                                                        Toast.LENGTH_SHORT
                                                    ).show()
                                                }
                                            }
                                        } catch (e: JSONException) {
                                            e.printStackTrace()
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                        } catch (e: IOException) {
                                            e.printStackTrace()
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                        }
                                    }

                                    override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                                        if (t is TimeoutException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Toast.makeText(
                                                applicationContext, "failed", Toast.LENGTH_SHORT
                                            ).show()

                                        }
                                        if (t is SocketTimeoutException || t is NullPointerException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Toast.makeText(
                                                applicationContext,
                                                settingsMain.getAlertDialogMessage("internetMessage"),
                                                Toast.LENGTH_SHORT
                                            ).show()

                                        }
                                        if (t is NullPointerException || t is UnknownError || t is NumberFormatException) {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Log.d(
                                                "info CustomPages ",
                                                "NullPointert Exception" + t.localizedMessage
                                            )
                                        } else {
                                            linearLayoutMain.visibility = View.VISIBLE
                                            shimmerFrameLayout.stopShimmer()
                                            shimmerFrameLayout.visibility = View.GONE
                                            loadingLayout.visibility = View.GONE
                                            Log.d("info CustomPages err", t.toString())
                                            Log.d(
                                                "info CustomPages err",
                                                t.message + t.cause + t.fillInStackTrace()
                                            )
                                        }
                                    }
                                })
                            } else {
                                linearLayoutMain.visibility = View.VISIBLE
                                shimmerFrameLayout.stopShimmer()
                                shimmerFrameLayout.visibility = View.GONE
                                loadingLayout.visibility = View.GONE
                                Toast.makeText(
                                    applicationContext,
                                    settingsMain.getAlertDialogMessage("internetMessage"),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        } else {
                            linearLayoutMain.visibility = View.VISIBLE
                            shimmerFrameLayout.stopShimmer()
                            shimmerFrameLayout.visibility = View.GONE
                            loadingLayout.visibility = View.GONE
                            Toast.makeText(
                                applicationContext,
                                response.getString("message").toString(),
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                    linearLayoutMain.visibility = View.VISIBLE
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
                    loadingLayout.visibility = View.GONE
                } catch (e: IOException) {
                    e.printStackTrace()
                    linearLayoutMain.visibility = View.VISIBLE
                    shimmerFrameLayout.stopShimmer()
                    shimmerFrameLayout.visibility = View.GONE
                    loadingLayout.visibility = View.GONE
                }
            }

            override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                linearLayoutMain.visibility = View.VISIBLE
                shimmerFrameLayout.stopShimmer()
                shimmerFrameLayout.visibility = View.GONE
                loadingLayout.visibility = View.GONE
                Log.d("info Register error", t.toString())
                Log.d("info Register error", t.message + t.cause + t.fillInStackTrace())
            }
        })
    }


}