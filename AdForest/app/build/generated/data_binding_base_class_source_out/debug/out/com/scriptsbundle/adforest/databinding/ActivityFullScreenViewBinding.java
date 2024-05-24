// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.rd.PageIndicatorView;
import com.scriptsbundle.adforest.R;
import com.scriptsbundle.adforest.ad_detail.full_screen_image.photoview.HackyViewPager;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFullScreenViewBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final PageIndicatorView pageIndicatorView;

  @NonNull
  public final HackyViewPager viewPager;

  private ActivityFullScreenViewBinding(@NonNull RelativeLayout rootView,
      @NonNull PageIndicatorView pageIndicatorView, @NonNull HackyViewPager viewPager) {
    this.rootView = rootView;
    this.pageIndicatorView = pageIndicatorView;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFullScreenViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFullScreenViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_full_screen_view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFullScreenViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.pageIndicatorView;
      PageIndicatorView pageIndicatorView = ViewBindings.findChildViewById(rootView, id);
      if (pageIndicatorView == null) {
        break missingId;
      }

      id = R.id.viewPager;
      HackyViewPager viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityFullScreenViewBinding((RelativeLayout) rootView, pageIndicatorView,
          viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}