package com.scriptsbundle.adforest.home.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.scriptsbundle.adforest.R;
import com.scriptsbundle.adforest.ad_detail.Ad_detail_activity;
import com.scriptsbundle.adforest.adapters.MarvelItemMainHomeRelatedAdapter;
import com.scriptsbundle.adforest.helper.MyAdsOnclicklinstener;
import com.scriptsbundle.adforest.helper.OnItemClickListener2;
import com.scriptsbundle.adforest.modelsList.catSubCatlistModel;
import com.scriptsbundle.adforest.modelsList.homeCatRelatedList;
import com.scriptsbundle.adforest.utills.CustomBorderDrawable;
import com.scriptsbundle.adforest.utills.SettingsMain;

public class MarvelItemMainCAT_Related_All extends RecyclerView.Adapter<MarvelItemMainCAT_Related_All.MyViewHolder> {
    private ArrayList<homeCatRelatedList> list;
    private MyAdsOnclicklinstener onItemClickListener;
    private Context mContext;
    private SettingsMain settingsMain;
    private boolean verticalNew = false;
    private boolean horizontalVertiNew = false;
    private String horizontelAd;
    private String sliderAds;

    public void setHorizontelAd(String isHorizontelAd) {
        horizontelAd = isHorizontelAd;
    }

    public MarvelItemMainCAT_Related_All(Context context, ArrayList<homeCatRelatedList> Data) {
        this.list = Data;
        this.mContext = context;
        settingsMain = new SettingsMain(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.marvel_item_main_home_related_all, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {

        final homeCatRelatedList feedItem = list.get(position);

        holder.btnViewAll.setTag(feedItem.getCatId());
        holder.btnViewAll.setText(feedItem.getViewAllBtnText());
        holder.textViewTitle.setText(feedItem.getTitle());
//        try {
//            Drawable mDrawable = ContextCompat.getDrawable(mContext, R.drawable.viewallbtn);
//            mDrawable.setColorFilter(new PorterDuffColorFilter(ContextCompat.getColor(mContext, Integer.parseInt(SettingsMain.getMainColor())), PorterDuff.Mode.SRC_IN));
//            holder.btnViewAll.setBackground(mDrawable);
//        } catch (NumberFormatException e) {
//            e.printStackTrace();
//        }

        holder.btnViewAll.setBackground(CustomBorderDrawable.customButton(0, 0, 0, 0, settingsMain.getMainColor(), settingsMain.getMainColor(), settingsMain.getMainColor(), 3));
        holder.recyclerView.setHasFixedSize(true);

        GridLayoutManager MyLayoutManager2 = null;
        sliderAds = settingsMain.getSliderAdsLayout();
        //"horizental";
        //settingsMain.gethorizontal();
        if (sliderAds.equals("vertical")) {
            MyLayoutManager2 = new GridLayoutManager(mContext, 2);
            MyLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        } else if (sliderAds.equals("default")) {
            MyLayoutManager2 = new GridLayoutManager(mContext, 1);
            MyLayoutManager2.setOrientation(LinearLayoutManager.HORIZONTAL);
        }
        if (sliderAds.equals("horizental")) {
            MyLayoutManager2 = new GridLayoutManager(mContext, 1);
            MyLayoutManager2.setOrientation(LinearLayoutManager.VERTICAL);
        }
        holder.recyclerView.setLayoutManager(MyLayoutManager2);
        holder.recyclerView.setNestedScrollingEnabled(false);

        MarvelItemMainHomeRelatedAdapter itemMainHomeRelatedAdapter = new MarvelItemMainHomeRelatedAdapter(mContext, feedItem.getArrayList());
        itemMainHomeRelatedAdapter.setHorizontelAd(horizontelAd);
        itemMainHomeRelatedAdapter.fromSlider = true;
        itemMainHomeRelatedAdapter.checkAdsType = "slider";
//        itemMainHomeRelatedAdapter.setMultiLine(false);
        holder.recyclerView.setAdapter(itemMainHomeRelatedAdapter);

        itemMainHomeRelatedAdapter.setOnItemClickListener(new OnItemClickListener2() {
            @Override
            public void onItemClick(catSubCatlistModel item) {

                Intent intent = new Intent(mContext, Ad_detail_activity.class);
                intent.putExtra("adId", item.getId());
                mContext.startActivity(intent);
            }
        });

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemClickListener.delViewOnClick(v, position);
            }
        };

        holder.btnViewAll.setOnClickListener(listener2);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public void setOnItemClickListener(MyAdsOnclicklinstener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textViewTitle, btnViewAll;
        RecyclerView recyclerView;

        MyViewHolder(View v) {
            super(v);

            textViewTitle = v.findViewById(R.id.title);
            btnViewAll = v.findViewById(R.id.btnViewAll);
            recyclerView = v.findViewById(R.id.sublist);
            recyclerView.setNestedScrollingEnabled(false);
            ViewCompat.setNestedScrollingEnabled(recyclerView, false);

        }
    }
}
