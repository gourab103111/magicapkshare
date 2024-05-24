// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import com.smarteist.autoimageslider.SliderView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class CarouselLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView carouselLayout;

  @NonNull
  public final SliderView imageSlider;

  private CarouselLayoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull CardView carouselLayout, @NonNull SliderView imageSlider) {
    this.rootView = rootView;
    this.carouselLayout = carouselLayout;
    this.imageSlider = imageSlider;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CarouselLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CarouselLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.carousel_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CarouselLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.carouselLayout;
      CardView carouselLayout = ViewBindings.findChildViewById(rootView, id);
      if (carouselLayout == null) {
        break missingId;
      }

      id = R.id.imageSlider;
      SliderView imageSlider = ViewBindings.findChildViewById(rootView, id);
      if (imageSlider == null) {
        break missingId;
      }

      return new CarouselLayoutBinding((ConstraintLayout) rootView, carouselLayout, imageSlider);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}