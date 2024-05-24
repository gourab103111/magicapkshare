package com.scriptsbundle.adforest.helper;

import android.view.View;

import org.json.JSONException;

import com.scriptsbundle.adforest.modelsList.myAdsModel;

public interface MyAdsOnclicklinstener {

    void onItemClick(myAdsModel item);

    void delViewOnClick(View v, int position);

    void editViewOnClick(View v, int position);

    void onImgMoreItemClick(myAdsModel item,View v) throws JSONException;

}
