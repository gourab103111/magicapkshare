// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
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

public final class FragmentMyaddBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView addfav;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final RecyclerView cardView1;

  @NonNull
  public final TextView editProfile;

  @NonNull
  public final TextView expired;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout linearLayoutCardView;

  @NonNull
  public final LinearLayout ll11;

  @NonNull
  public final TextView loginTime;

  @NonNull
  public final RelativeLayout mainRelative;

  @NonNull
  public final NestedScrollView mainScrollView;

  @NonNull
  public final TextView numberOfRate;

  @NonNull
  public final ProgressBar progressBar4;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView report;

  @NonNull
  public final TextView share;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView5;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView verified;

  private FragmentMyaddBinding(@NonNull NestedScrollView rootView, @NonNull TextView addfav,
      @NonNull CardView cardView, @NonNull RecyclerView cardView1, @NonNull TextView editProfile,
      @NonNull TextView expired, @NonNull ImageView imageView,
      @NonNull LinearLayout linearLayoutCardView, @NonNull LinearLayout ll11,
      @NonNull TextView loginTime, @NonNull RelativeLayout mainRelative,
      @NonNull NestedScrollView mainScrollView, @NonNull TextView numberOfRate,
      @NonNull ProgressBar progressBar4, @NonNull RatingBar ratingBar, @NonNull TextView report,
      @NonNull TextView share, @NonNull ShimmerFrameLayout shimmerFrameLayout,
      @NonNull LinearLayout shimmerMain, @NonNull TextView textView19, @NonNull TextView textView5,
      @NonNull TextView textViewName, @NonNull TextView verified) {
    this.rootView = rootView;
    this.addfav = addfav;
    this.cardView = cardView;
    this.cardView1 = cardView1;
    this.editProfile = editProfile;
    this.expired = expired;
    this.imageView = imageView;
    this.linearLayoutCardView = linearLayoutCardView;
    this.ll11 = ll11;
    this.loginTime = loginTime;
    this.mainRelative = mainRelative;
    this.mainScrollView = mainScrollView;
    this.numberOfRate = numberOfRate;
    this.progressBar4 = progressBar4;
    this.ratingBar = ratingBar;
    this.report = report;
    this.share = share;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.shimmerMain = shimmerMain;
    this.textView19 = textView19;
    this.textView5 = textView5;
    this.textViewName = textViewName;
    this.verified = verified;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMyaddBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMyaddBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_myadd, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMyaddBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addfav;
      TextView addfav = ViewBindings.findChildViewById(rootView, id);
      if (addfav == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.cardView;
      RecyclerView cardView1 = ViewBindings.findChildViewById(rootView, id);
      if (cardView1 == null) {
        break missingId;
      }

      id = R.id.editProfile;
      TextView editProfile = ViewBindings.findChildViewById(rootView, id);
      if (editProfile == null) {
        break missingId;
      }

      id = R.id.expired;
      TextView expired = ViewBindings.findChildViewById(rootView, id);
      if (expired == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      LinearLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      id = R.id.ll11;
      LinearLayout ll11 = ViewBindings.findChildViewById(rootView, id);
      if (ll11 == null) {
        break missingId;
      }

      id = R.id.loginTime;
      TextView loginTime = ViewBindings.findChildViewById(rootView, id);
      if (loginTime == null) {
        break missingId;
      }

      id = R.id.mainRelative;
      RelativeLayout mainRelative = ViewBindings.findChildViewById(rootView, id);
      if (mainRelative == null) {
        break missingId;
      }

      NestedScrollView mainScrollView = (NestedScrollView) rootView;

      id = R.id.numberOfRate;
      TextView numberOfRate = ViewBindings.findChildViewById(rootView, id);
      if (numberOfRate == null) {
        break missingId;
      }

      id = R.id.progressBar4;
      ProgressBar progressBar4 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar4 == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.report;
      TextView report = ViewBindings.findChildViewById(rootView, id);
      if (report == null) {
        break missingId;
      }

      id = R.id.share;
      TextView share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
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

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView5;
      TextView textView5 = ViewBindings.findChildViewById(rootView, id);
      if (textView5 == null) {
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

      return new FragmentMyaddBinding((NestedScrollView) rootView, addfav, cardView, cardView1,
          editProfile, expired, imageView, linearLayoutCardView, ll11, loginTime, mainRelative,
          mainScrollView, numberOfRate, progressBar4, ratingBar, report, share, shimmerFrameLayout,
          shimmerMain, textView19, textView5, textViewName, verified);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
