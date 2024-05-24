package com.scriptsbundle.adforest.LinkedIn;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class LinkedInApiHelper {

    public interface OnUserInfoListener {
        void onUserInfoReceived(String userInfo);

        void onError(String error);
    }

    public static void getUserInfo(String accessToken, OnUserInfoListener listener) {
        new UserInfoAsyncTask(listener).execute(accessToken);
    }

    private static class UserInfoAsyncTask extends AsyncTask<String, Void, String> {
        private final OnUserInfoListener listener;

        public UserInfoAsyncTask(OnUserInfoListener listener) {
            this.listener = listener;
        }

        @Override
        protected String doInBackground(String... params) {
            try {
                String accessToken = params[0];
                String apiUrl = "https://api.linkedin.com/v2/userinfo";
                URL url = new URL(apiUrl);
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();
                connection.setRequestMethod("GET");
                connection.setRequestProperty("Authorization", "Bearer " + accessToken);

                int responseCode = connection.getResponseCode();

                if (responseCode == HttpURLConnection.HTTP_OK) {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    StringBuilder response = new StringBuilder();
                    String line;

                    while ((line = reader.readLine()) != null) {
                        response.append(line);
                    }

                    reader.close();
                    return response.toString();
                } else {
                    return "Error: " + responseCode;
                }

            } catch (IOException e) {
                e.printStackTrace();
                return "Error: " + e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            if (result.startsWith("Error")) {
                listener.onError(result);
            } else {
                listener.onUserInfoReceived(result);
            }
        }
    }
}
