// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class UserRatingBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout cardView;

  @NonNull
  public final CircleImageView imageView;

  @NonNull
  public final LinearLayout iner1;

  @NonNull
  public final LinearLayout iner2;

  @NonNull
  public final LinearLayout iner3;

  @NonNull
  public final LinearLayout linearLayoutCardView;

  @NonNull
  public final TextView loginTime;

  @NonNull
  public final TextView prices;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final View separator;

  @NonNull
  public final RecyclerView sublist;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView verified;

  private UserRatingBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout cardView,
      @NonNull CircleImageView imageView, @NonNull LinearLayout iner1, @NonNull LinearLayout iner2,
      @NonNull LinearLayout iner3, @NonNull LinearLayout linearLayoutCardView,
      @NonNull TextView loginTime, @NonNull TextView prices, @NonNull RatingBar ratingBar,
      @NonNull View separator, @NonNull RecyclerView sublist, @NonNull TextView textViewName,
      @NonNull TextView verified) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.imageView = imageView;
    this.iner1 = iner1;
    this.iner2 = iner2;
    this.iner3 = iner3;
    this.linearLayoutCardView = linearLayoutCardView;
    this.loginTime = loginTime;
    this.prices = prices;
    this.ratingBar = ratingBar;
    this.separator = separator;
    this.sublist = sublist;
    this.textViewName = textViewName;
    this.verified = verified;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static UserRatingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static UserRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.user_rating, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static UserRatingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardView;
      RelativeLayout cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.image_view;
      CircleImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.iner1;
      LinearLayout iner1 = ViewBindings.findChildViewById(rootView, id);
      if (iner1 == null) {
        break missingId;
      }

      id = R.id.iner2;
      LinearLayout iner2 = ViewBindings.findChildViewById(rootView, id);
      if (iner2 == null) {
        break missingId;
      }

      id = R.id.iner3;
      LinearLayout iner3 = ViewBindings.findChildViewById(rootView, id);
      if (iner3 == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      LinearLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      id = R.id.loginTime;
      TextView loginTime = ViewBindings.findChildViewById(rootView, id);
      if (loginTime == null) {
        break missingId;
      }

      id = R.id.prices;
      TextView prices = ViewBindings.findChildViewById(rootView, id);
      if (prices == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.separator;
      View separator = ViewBindings.findChildViewById(rootView, id);
      if (separator == null) {
        break missingId;
      }

      id = R.id.sublist;
      RecyclerView sublist = ViewBindings.findChildViewById(rootView, id);
      if (sublist == null) {
        break missingId;
      }

      id = R.id.text_viewName;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.verified;
      TextView verified = ViewBindings.findChildViewById(rootView, id);
      if (verified == null) {
        break missingId;
      }

      return new UserRatingBinding((RelativeLayout) rootView, cardView, imageView, iner1, iner2,
          iner3, linearLayoutCardView, loginTime, prices, ratingBar, separator, sublist,
          textViewName, verified);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
