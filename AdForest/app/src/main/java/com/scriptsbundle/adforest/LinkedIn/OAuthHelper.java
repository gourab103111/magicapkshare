package com.scriptsbundle.adforest.LinkedIn;


import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import com.scriptsbundle.adforest.utills.UrlController;

public class OAuthHelper {
    private final Context context;

    public OAuthHelper(Context context) {
        this.context = context;
    }
    private static final String CLIENT_ID = UrlController.LINKEDIN_CLIENT_ID;
    private static final String REDIRECT_URI = UrlController.LINKEDIN_REDIRECT_URL;
    private static final String AUTHORIZATION_URL =
            "https://www.linkedin.com/oauth/v2/authorization";
    private static final String ACCESS_TOKEN_URL =
            "https://www.linkedin.com/oauth/v2/accessToken";
    private static final String STATE = "state"; //"your_state_value";
//    private static final String SCOPE = "r_liteprofile%20r_emailaddress&";// "r_liteprofile%20r_emailaddress%20w_member_social";
//private static final String SCOPE = "r_liteprofile%20r_emailaddress%20openid%20profile%20email";

    private static final String SCOPE = "openid profile email";

    public static String buildAuthorizationUrl() {
        return AUTHORIZATION_URL +
                "?response_type=code" +
                "&client_id=" + CLIENT_ID +
                "&redirect_uri=" + REDIRECT_URI +
                "&state=" + STATE +
                "&scope=" + SCOPE;
    }


    public static void requestAccessToken(String authorizationCode, Context context, Response.Listener<String> successListener, Response.ErrorListener errorListener) {
        String url = ACCESS_TOKEN_URL +
                "?grant_type=authorization_code" +
                "&code=" + authorizationCode +
                "&redirect_uri=" + REDIRECT_URI +
                "&client_id=" + CLIENT_ID +
                "&client_secret=" + UrlController.LINKEDIN_CLIENT_SECRET;

        RequestQueue queue = Volley.newRequestQueue(context);

        // Create the StringRequest
        StringRequest request = new StringRequest(Request.Method.POST, url, successListener, errorListener);

        // Add the request to the queue
        queue.add(request);
    }

}
