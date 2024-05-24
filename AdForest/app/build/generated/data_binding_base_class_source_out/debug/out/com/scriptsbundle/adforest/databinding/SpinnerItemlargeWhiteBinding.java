// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;

public final class SpinnerItemlargeWhiteBinding implements ViewBinding {
  @NonNull
  private final TextView rootView;

  @NonNull
  public final TextView textViewName;

  private SpinnerItemlargeWhiteBinding(@NonNull TextView rootView, @NonNull TextView textViewName) {
    this.rootView = rootView;
    this.textViewName = textViewName;
  }

  @Override
  @NonNull
  public TextView getRoot() {
    return rootView;
  }

  @NonNull
  public static SpinnerItemlargeWhiteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SpinnerItemlargeWhiteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.spinner_itemlarge_white, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SpinnerItemlargeWhiteBinding bind(@NonNull View rootView) {
    if (rootView == null) {
      throw new NullPointerException("rootView");
    }

    TextView textViewName = (TextView) rootView;

    return new SpinnerItemlargeWhiteBinding((TextView) rootView, textViewName);
  }
}