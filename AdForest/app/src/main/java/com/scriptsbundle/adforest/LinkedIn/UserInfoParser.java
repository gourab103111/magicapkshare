package com.scriptsbundle.adforest.LinkedIn;

import com.google.gson.Gson;

public class UserInfoParser {

    public static class UserInfo {
        private String sub;
        private boolean emailVerified;
        private String name;
        private String givenName;
        private String familyName;
        private String email;
        private String picture;

        // Getter methods for accessing the variables
        public String getSub() {
            return sub;
        }

        public boolean isEmailVerified() {
            return emailVerified;
        }

        public String getName() {
            return name;
        }

        public String getGivenName() {
            return givenName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public String getEmail() {
            return email;
        }

        public String getPicture() {
            return picture;
        }
    }

    public static UserInfo parseUserInfo(String jsonStr) {
        Gson gson = new Gson();
        return gson.fromJson(jsonStr, UserInfo.class);
    }

//    public static void main(String[] args) {
//        // Replace this with the actual JSON string received from the server
//        String jsonStr = "{\"sub\":\"7Lyre57Zfl\",\"email_verified\":true,\"name\":\"Usman Abid\",\"locale\":{\"country\":\"US\",\"language\":\"en\"},\"given_name\":\"Usman\",\"family_name\":\"Abid\",\"email\":\"usmanabid228@gmail.com\",\"picture\":\"https://media.licdn.com/dms/image/D4D03AQERioqrbZf4cw/profile-displayphoto-shrink_100_100/0/1701424339740?e=1709164800&v=beta&t=nRMlBywWAaeETky1pTrN-OZXMS7UyINijDpHXoIjQZk\"}";
//
//        // Parse the JSON string
//        UserInfo userInfo = parseUserInfo(jsonStr);
//
//        // Access the values using the getter methods
//        if (userInfo != null) {
//            System.out.println("Sub: " + userInfo.getSub());
//            System.out.println("Email Verified: " + userInfo.isEmailVerified());
//            System.out.println("Name: " + userInfo.getName());
//            System.out.println("Given Name: " + userInfo.getGivenName());
//            System.out.println("Family Name: " + userInfo.getFamilyName());
//            System.out.println("Email: " + userInfo.getEmail());
//            System.out.println("Picture: " + userInfo.getPicture());
//        } else {
//            System.out.println("Failed to parse JSON");
//        }
//    }
}

