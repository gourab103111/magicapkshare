package com.scriptsbundle.adforest.utills;

import android.content.Context;
import android.text.TextUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import okhttp3.Cache;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.scriptsbundle.adforest.utills.Network.AuthenticationInterceptor;


public class UrlController {

    public static boolean loading = false;
    private static final long CACHE_SIZE = 1000L * 1024 * 1024; // 1000 MB
    private static  long cacheSize = 100 * 1024 * 1024; //100MB
    private static OkHttpClient createOkHttpClient(Context context) {
        Cache myCache = new Cache(context.getCacheDir(), cacheSize);

        return new OkHttpClient.Builder()
                .connectTimeout(60, TimeUnit.MINUTES)
                .writeTimeout(60, TimeUnit.MINUTES)
                .readTimeout(60, TimeUnit.MINUTES)
                .retryOnConnectionFailure(true)
                .callTimeout(60, TimeUnit.MINUTES)
                .addInterceptor(chain -> {
                    Request request = chain.request();
                    if (SettingsMain.isConnectingToInternet(context)) {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-age=180")

//                                .header("Cache-Control", "public, max-age=" + 5)
                                .build();
                    } else {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                                .build();
                    }
                    Response response = chain.proceed(request);
                    if (response.code() == 504 && !SettingsMain.isConnectingToInternet(context)) {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                                .build();
                        response = chain.proceed(request);
                    }
                    return response;
                })
                .cache(myCache)
                .build();
    }


    // Warning for STRING_TOO_LARGE Please ignore it it wil not effect the project functionality.
    // Very very important check the every detial carefully before uploading app to google play store.
    public static String IP_ADDRESS = "http://www.mojakoja.pl/";//Enter You Ip_Address here here
    public static String Purchase_code = "63b7ae73-b19f-47a1-b912-52dd0fb3d0d1";//Enter the purchase code here
    public static String Custom_Security = "762r3476";//Enter the Custom Security code here





    //LinkedIn Configuration
    public static final String LINKEDIN_CLIENT_ID = "773c3k1llcvs0q";//Enter Your LINKEDIN_CLIENT_ID here
    public static final String LINKEDIN_CLIENT_SECRET = "9CYoMTh8UdShi6gV";//Enter Your LINKEDIN_CLIENT_SECRET here
    public static final String LINKEDIN_REDIRECT_URL = "https://www.mojakoja.pl/";//Enter Your LINKEDIN_REDIRECT_URL here

    public static final String Base_URL = IP_ADDRESS + "wp-json/adforest/v1/";
    private static final Retrofit.Builder builder = new Retrofit.Builder()
            .baseUrl(Base_URL)
            .addConverterFactory(GsonConverterFactory.create());

    private static Retrofit retrofit = builder.build();

    public static <S> S createService(Class<S> serviceClass, Context context) {
        Cache myCache = new Cache(context.getCacheDir(), cacheSize);

        OkHttpClient okHttpClient = createOkHttpClient(context);

        okHttpClient.newBuilder().connectTimeout(30, TimeUnit.MINUTES);
        okHttpClient.newBuilder().readTimeout(30, TimeUnit.SECONDS);
        okHttpClient.newBuilder().writeTimeout(30, TimeUnit.SECONDS);
        okHttpClient.newBuilder() .addInterceptor(chain -> {
            Request request = chain.request();
            if (SettingsMain.isConnectingToInternet(context)) {
                request = request.newBuilder()
                        .header("Cache-Control", "public, max-age=60")
//                        .header("Cache-Control", "public, max-age=" + 5)
                        .build();
            } else {
                request = request.newBuilder()
                        .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                        .build();
            }
            Response response = chain.proceed(request);
            if (response.code() == 504 && !SettingsMain.isConnectingToInternet(context)) {
                request = request.newBuilder()
                        .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                        .build();
                response = chain.proceed(request);
            }
            return response;
        });
        okHttpClient.newBuilder() .cache(myCache);

        Retrofit.Builder retrofitBuilder = builder.client(okHttpClient);
        retrofit = retrofitBuilder.build();

        return retrofit.create(serviceClass);
    }

    public static <S> S createService(Class<S> serviceClass, String username, String password, Context context) {
        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
            String authToken = Credentials.basic(username, password);
            return createService(serviceClass, authToken, context);
        } else {
            return createService(serviceClass, context);
        }
    }

    public static <S> S createServiceNoTimeout(Class<S> serviceClass, String authToken, Context context) {
        OkHttpClient okHttpClient = createOkHttpClient(context);

        Retrofit.Builder retrofitBuilder = builder.client(okHttpClient);
        retrofit = retrofitBuilder.build();

        if (!TextUtils.isEmpty(authToken)) {
            AuthenticationInterceptor interceptor = new AuthenticationInterceptor(authToken, context);
            OkHttpClient.Builder httpClient = okHttpClient.newBuilder();

            if (!httpClient.interceptors().contains(interceptor)) {
                httpClient.addInterceptor(interceptor);
                retrofitBuilder.client(httpClient.build());
                retrofit = retrofitBuilder.build();
            }
        }

        return retrofit.create(serviceClass);
    }

    public static <S> S createServiceNoTimeoutUP(Class<S> serviceClass, String username, String password, Context context) {
        if (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) {
            String authToken = Credentials.basic(username, password);
            return createServiceNoTimeout(serviceClass, authToken, context);
        }

        return createService(serviceClass, context);
    }

    public static <S> S createService(Class<S> serviceClass, final String authToken, Context context) {
        OkHttpClient okHttpClient = createOkHttpClient(context);
        Cache myCache = new Cache(context.getCacheDir(), cacheSize);

        Retrofit.Builder retrofitBuilder = builder.client(okHttpClient);
        retrofit = retrofitBuilder.build();

        if (!TextUtils.isEmpty(authToken)) {
            AuthenticationInterceptor interceptor = new AuthenticationInterceptor(authToken, context);
            OkHttpClient.Builder httpClient = okHttpClient.newBuilder();

            if (!httpClient.interceptors().contains(interceptor)) {
                httpClient.addInterceptor(interceptor);
                httpClient.addInterceptor(chain -> {
                    Request request = chain.request();
                    if (SettingsMain.isConnectingToInternet(context)) {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-age=60")
//                                .header("Cache-Control", "public, max-age=" + 5)
                                .build();
                    } else {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                                .build();
                    }
                    Response response = chain.proceed(request);
                    if (response.code() == 504 && !SettingsMain.isConnectingToInternet(context)) {
                        request = request.newBuilder()
                                .header("Cache-Control", "public, max-stale=" + 60 * 60 * 24 * 7)
                                .build();
                        response = chain.proceed(request);
                    }
                    return response;
                });
                httpClient.cache(myCache);

                retrofitBuilder.client(httpClient.build());
                retrofit = retrofitBuilder.build();
            }
        }

        return retrofit.create(serviceClass);
    }

    public static Map<String, String> AddHeaders(Context context) {
        Map<String, String> map = new HashMap<>();
        if (SettingsMain.isSocial(context))
            map.put("AdForest-Login-Type", "social");
        if (SettingsMain.isOTP(context))
            map.put("AdForest-Login-Type", "otp");
        map.put("Purchase-Code", Purchase_code);
        map.put("custom-security", Custom_Security);
        map.put("Adforest-Lang-Locale", SettingsMain.getLanguageCode());
        map.put("Adforest-Request-From", "android");
        map.put("Content-Type", "application/json");
        map.put("Cache-Control", "max-age=640000");
        map.put("Adforest-Location-Id", SettingsMain.getlocationId());
        return map;
    }

    public static Map<String, String> UploadImageAddHeaders(Context context) {
        Map<String, String> map = new HashMap<>();
        if (SettingsMain.isSocial(context)) {
            map.put("AdForest-Login-Type", "social");
        }
        if (SettingsMain.isOTP(context))
            map.put("AdForest-Login-Type", "otp");
        map.put("Purchase-Code", Purchase_code);
        map.put("custom-security", Custom_Security);
        map.put("Adforest-Lang-Locale", SettingsMain.getLanguageCode());
        map.put("Adforest-Request-From", "android");
        map.put("Cache-Control", "max-age=640000");

        return map;
    }
}
