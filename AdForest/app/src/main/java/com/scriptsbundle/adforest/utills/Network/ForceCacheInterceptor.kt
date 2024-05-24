package com.scriptsbundle.adforest.utills.Network

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build
import android.util.Log
import okhttp3.CacheControl
import okhttp3.Interceptor
import okhttp3.Request
import okhttp3.Response
import java.util.Random

class ForceCacheInterceptor : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val builder: Request.Builder = chain.request().newBuilder()
        if (!isInternetAvailable()) {
            builder.cacheControl(CacheControl.FORCE_CACHE);
        }
        else{
//            val random = Random().nextBoolean()
//            if (random) {
//                Log.d("doMagic", "Requesting data from cache")
//                builder.cacheControl(CacheControl.FORCE_CACHE)
//            } else {
                Log.d("doMagic", "Requesting data from network")
                builder.cacheControl(CacheControl.FORCE_NETWORK)
//            }

        }
        return chain.proceed(builder.build());
    }


    fun isInternetAvailable(): Boolean {
        val context = getAppContext()
        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            val networkCapabilities = connectivityManager.activeNetwork ?: return false
            val activeNetwork =
                connectivityManager.getNetworkCapabilities(networkCapabilities) ?: return false

            return when {
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true
                activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET) -> true
                else -> false
            }
        } else {
            val networkInfo = connectivityManager.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
    }

    private fun getAppContext(): Context {
        var context: Context? = null
        try {
            context = Class.forName("android.app.ActivityThread").getMethod("currentApplication")
                .invoke(null) as Context
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return context!!
    }
}
