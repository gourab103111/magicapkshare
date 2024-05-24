// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMainHomeBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayout HomeCustomLayout;

  @NonNull
  public final RelativeLayout activityMain;

  @NonNull
  public final ImageView backgroundImage;

  @NonNull
  public final Button buttonAllCat;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView etLocation;

  @NonNull
  public final EditText etSearch;

  @NonNull
  public final LinearLayout featureAboveLayoutBelow;

  @NonNull
  public final LinearLayout featureAboveLayoyut;

  @NonNull
  public final LinearLayout featureLayoutMid;

  @NonNull
  public final RecyclerView featuredRecylerViewBelow;

  @NonNull
  public final RecyclerView featuredRecylerViewMid;

  @NonNull
  public final RelativeLayout homeTopLayout;

  @NonNull
  public final ImageButton imgBtnSearch;

  @NonNull
  public final LinearLayout linear1;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RecyclerView recyclerView2;

  @NonNull
  public final RecyclerView recyclerView3;

  @NonNull
  public final RelativeLayout searchLayout;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final View simpleView;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textView7;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView tvSearchSubTitle;

  @NonNull
  public final TextView tvSearchTitle;

  @NonNull
  public final View viw;

  private FragmentMainHomeBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayout HomeCustomLayout, @NonNull RelativeLayout activityMain,
      @NonNull ImageView backgroundImage, @NonNull Button buttonAllCat, @NonNull CardView cardView,
      @NonNull TextView etLocation, @NonNull EditText etSearch,
      @NonNull LinearLayout featureAboveLayoutBelow, @NonNull LinearLayout featureAboveLayoyut,
      @NonNull LinearLayout featureLayoutMid, @NonNull RecyclerView featuredRecylerViewBelow,
      @NonNull RecyclerView featuredRecylerViewMid, @NonNull RelativeLayout homeTopLayout,
      @NonNull ImageButton imgBtnSearch, @NonNull LinearLayout linear1,
      @NonNull RecyclerView recyclerView, @NonNull RecyclerView recyclerView2,
      @NonNull RecyclerView recyclerView3, @NonNull RelativeLayout searchLayout,
      @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull LinearLayout shimmerMain,
      @NonNull View simpleView, @NonNull TextView textView6, @NonNull TextView textView7,
      @NonNull TextView textView8, @NonNull TextView tvSearchSubTitle,
      @NonNull TextView tvSearchTitle, @NonNull View viw) {
    this.rootView = rootView;
    this.HomeCustomLayout = HomeCustomLayout;
    this.activityMain = activityMain;
    this.backgroundImage = backgroundImage;
    this.buttonAllCat = buttonAllCat;
    this.cardView = cardView;
    this.etLocation = etLocation;
    this.etSearch = etSearch;
    this.featureAboveLayoutBelow = featureAboveLayoutBelow;
    this.featureAboveLayoyut = featureAboveLayoyut;
    this.featureLayoutMid = featureLayoutMid;
    this.featuredRecylerViewBelow = featuredRecylerViewBelow;
    this.featuredRecylerViewMid = featuredRecylerViewMid;
    this.homeTopLayout = homeTopLayout;
    this.imgBtnSearch = imgBtnSearch;
    this.linear1 = linear1;
    this.recyclerView = recyclerView;
    this.recyclerView2 = recyclerView2;
    this.recyclerView3 = recyclerView3;
    this.searchLayout = searchLayout;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.shimmerMain = shimmerMain;
    this.simpleView = simpleView;
    this.textView6 = textView6;
    this.textView7 = textView7;
    this.textView8 = textView8;
    this.tvSearchSubTitle = tvSearchSubTitle;
    this.tvSearchTitle = tvSearchTitle;
    this.viw = viw;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMainHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMainHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMainHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.HomeCustomLayout;
      LinearLayout HomeCustomLayout = ViewBindings.findChildViewById(rootView, id);
      if (HomeCustomLayout == null) {
        break missingId;
      }

      id = R.id.activity_main;
      RelativeLayout activityMain = ViewBindings.findChildViewById(rootView, id);
      if (activityMain == null) {
        break missingId;
      }

      id = R.id.backgroundImage;
      ImageView backgroundImage = ViewBindings.findChildViewById(rootView, id);
      if (backgroundImage == null) {
        break missingId;
      }

      id = R.id.buttonAllCat;
      Button buttonAllCat = ViewBindings.findChildViewById(rootView, id);
      if (buttonAllCat == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.et_location;
      TextView etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
        break missingId;
      }

      id = R.id.et_search;
      EditText etSearch = ViewBindings.findChildViewById(rootView, id);
      if (etSearch == null) {
        break missingId;
      }

      id = R.id.featureAboveLayoutBelow;
      LinearLayout featureAboveLayoutBelow = ViewBindings.findChildViewById(rootView, id);
      if (featureAboveLayoutBelow == null) {
        break missingId;
      }

      id = R.id.featureAboveLayoyut;
      LinearLayout featureAboveLayoyut = ViewBindings.findChildViewById(rootView, id);
      if (featureAboveLayoyut == null) {
        break missingId;
      }

      id = R.id.featureLayoutMid;
      LinearLayout featureLayoutMid = ViewBindings.findChildViewById(rootView, id);
      if (featureLayoutMid == null) {
        break missingId;
      }

      id = R.id.featuredRecylerViewBelow;
      RecyclerView featuredRecylerViewBelow = ViewBindings.findChildViewById(rootView, id);
      if (featuredRecylerViewBelow == null) {
        break missingId;
      }

      id = R.id.featuredRecylerViewMid;
      RecyclerView featuredRecylerViewMid = ViewBindings.findChildViewById(rootView, id);
      if (featuredRecylerViewMid == null) {
        break missingId;
      }

      id = R.id.homeTopLayout;
      RelativeLayout homeTopLayout = ViewBindings.findChildViewById(rootView, id);
      if (homeTopLayout == null) {
        break missingId;
      }

      id = R.id.img_btn_search;
      ImageButton imgBtnSearch = ViewBindings.findChildViewById(rootView, id);
      if (imgBtnSearch == null) {
        break missingId;
      }

      id = R.id.linear1;
      LinearLayout linear1 = ViewBindings.findChildViewById(rootView, id);
      if (linear1 == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.recycler_view2;
      RecyclerView recyclerView2 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView2 == null) {
        break missingId;
      }

      id = R.id.recycler_view3;
      RecyclerView recyclerView3 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView3 == null) {
        break missingId;
      }

      id = R.id.searchLayout;
      RelativeLayout searchLayout = ViewBindings.findChildViewById(rootView, id);
      if (searchLayout == null) {
        break missingId;
      }

      id = R.id.shimmerFrameLayout;
      ShimmerFrameLayout shimmerFrameLayout = ViewBindings.findChildViewById(rootView, id);
      if (shimmerFrameLayout == null) {
        break missingId;
      }

      id = R.id.shimmerMain;
      LinearLayout shimmerMain = ViewBindings.findChildViewById(rootView, id);
      if (shimmerMain == null) {
        break missingId;
      }

      id = R.id.simpleView;
      View simpleView = ViewBindings.findChildViewById(rootView, id);
      if (simpleView == null) {
        break missingId;
      }

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textView7;
      TextView textView7 = ViewBindings.findChildViewById(rootView, id);
      if (textView7 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.tv_search_subTitle;
      TextView tvSearchSubTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSearchSubTitle == null) {
        break missingId;
      }

      id = R.id.tv_search_title;
      TextView tvSearchTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvSearchTitle == null) {
        break missingId;
      }

      id = R.id.viw;
      View viw = ViewBindings.findChildViewById(rootView, id);
      if (viw == null) {
        break missingId;
      }

      return new FragmentMainHomeBinding((NestedScrollView) rootView, HomeCustomLayout,
          activityMain, backgroundImage, buttonAllCat, cardView, etLocation, etSearch,
          featureAboveLayoutBelow, featureAboveLayoyut, featureLayoutMid, featuredRecylerViewBelow,
          featuredRecylerViewMid, homeTopLayout, imgBtnSearch, linear1, recyclerView, recyclerView2,
          recyclerView3, searchLayout, shimmerFrameLayout, shimmerMain, simpleView, textView6,
          textView7, textView8, tvSearchSubTitle, tvSearchTitle, viw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
