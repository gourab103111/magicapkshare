// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cn.iwgang.countdownview.CountdownView;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MarvelFeaturedAdsDefaultBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CountdownView cvCountdownView;

  @NonNull
  public final TextView date;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RelativeLayout linearLayoutCardView;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final LinearLayout ll12;

  @NonNull
  public final RelativeLayout ll122;

  @NonNull
  public final TextView location;

  @NonNull
  public final TextView prices;

  @NonNull
  public final ImageView textView4;

  @NonNull
  public final TextView textViewCatName;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewPriceType;

  private MarvelFeaturedAdsDefaultBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull CountdownView cvCountdownView, @NonNull TextView date, @NonNull ImageView imageView,
      @NonNull RelativeLayout linearLayoutCardView, @NonNull LinearLayout ll1,
      @NonNull LinearLayout ll12, @NonNull RelativeLayout ll122, @NonNull TextView location,
      @NonNull TextView prices, @NonNull ImageView textView4, @NonNull TextView textViewCatName,
      @NonNull TextView textViewName, @NonNull TextView textViewPriceType) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.cvCountdownView = cvCountdownView;
    this.date = date;
    this.imageView = imageView;
    this.linearLayoutCardView = linearLayoutCardView;
    this.ll1 = ll1;
    this.ll12 = ll12;
    this.ll122 = ll122;
    this.location = location;
    this.prices = prices;
    this.textView4 = textView4;
    this.textViewCatName = textViewCatName;
    this.textViewName = textViewName;
    this.textViewPriceType = textViewPriceType;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static MarvelFeaturedAdsDefaultBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MarvelFeaturedAdsDefaultBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.marvel_featured_ads_default, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MarvelFeaturedAdsDefaultBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.cv_countdownView;
      CountdownView cvCountdownView = ViewBindings.findChildViewById(rootView, id);
      if (cvCountdownView == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      RelativeLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      id = R.id.ll1;
      LinearLayout ll1 = ViewBindings.findChildViewById(rootView, id);
      if (ll1 == null) {
        break missingId;
      }

      id = R.id.ll12;
      LinearLayout ll12 = ViewBindings.findChildViewById(rootView, id);
      if (ll12 == null) {
        break missingId;
      }

      id = R.id.ll122;
      RelativeLayout ll122 = ViewBindings.findChildViewById(rootView, id);
      if (ll122 == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.prices;
      TextView prices = ViewBindings.findChildViewById(rootView, id);
      if (prices == null) {
        break missingId;
      }

      id = R.id.textView4;
      ImageView textView4 = ViewBindings.findChildViewById(rootView, id);
      if (textView4 == null) {
        break missingId;
      }

      id = R.id.text_view_cat_name;
      TextView textViewCatName = ViewBindings.findChildViewById(rootView, id);
      if (textViewCatName == null) {
        break missingId;
      }

      id = R.id.text_view_name;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.text_view_priceType;
      TextView textViewPriceType = ViewBindings.findChildViewById(rootView, id);
      if (textViewPriceType == null) {
        break missingId;
      }

      return new MarvelFeaturedAdsDefaultBinding((CardView) rootView, cardView, cvCountdownView,
          date, imageView, linearLayoutCardView, ll1, ll12, ll122, location, prices, textView4,
          textViewCatName, textViewName, textViewPriceType);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
