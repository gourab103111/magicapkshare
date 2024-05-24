// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAdRatingBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final RecyclerView loadMoreRecyclerView;

  @NonNull
  public final NestedScrollView mainScrollView;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final LinearLayout ratingLoadLayout;

  @NonNull
  public final TextView ratingLoadMoreButton;

  @NonNull
  public final ImageView textView3;

  @NonNull
  public final TextView titleRating;

  private FragmentAdRatingBinding(@NonNull NestedScrollView rootView, @NonNull ImageView imageView4,
      @NonNull LinearLayout linearLayout5, @NonNull RecyclerView loadMoreRecyclerView,
      @NonNull NestedScrollView mainScrollView, @NonNull ProgressBar progressBar,
      @NonNull LinearLayout ratingLoadLayout, @NonNull TextView ratingLoadMoreButton,
      @NonNull ImageView textView3, @NonNull TextView titleRating) {
    this.rootView = rootView;
    this.imageView4 = imageView4;
    this.linearLayout5 = linearLayout5;
    this.loadMoreRecyclerView = loadMoreRecyclerView;
    this.mainScrollView = mainScrollView;
    this.progressBar = progressBar;
    this.ratingLoadLayout = ratingLoadLayout;
    this.ratingLoadMoreButton = ratingLoadMoreButton;
    this.textView3 = textView3;
    this.titleRating = titleRating;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdRatingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdRatingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ad_rating, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdRatingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.loadMoreRecyclerView;
      RecyclerView loadMoreRecyclerView = ViewBindings.findChildViewById(rootView, id);
      if (loadMoreRecyclerView == null) {
        break missingId;
      }

      NestedScrollView mainScrollView = (NestedScrollView) rootView;

      id = R.id.progress_bar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.ratingLoadLayout;
      LinearLayout ratingLoadLayout = ViewBindings.findChildViewById(rootView, id);
      if (ratingLoadLayout == null) {
        break missingId;
      }

      id = R.id.ratingLoadMoreButton;
      TextView ratingLoadMoreButton = ViewBindings.findChildViewById(rootView, id);
      if (ratingLoadMoreButton == null) {
        break missingId;
      }

      id = R.id.textView3;
      ImageView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      id = R.id.titleRating;
      TextView titleRating = ViewBindings.findChildViewById(rootView, id);
      if (titleRating == null) {
        break missingId;
      }

      return new FragmentAdRatingBinding((NestedScrollView) rootView, imageView4, linearLayout5,
          loadMoreRecyclerView, mainScrollView, progressBar, ratingLoadLayout, ratingLoadMoreButton,
          textView3, titleRating);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
