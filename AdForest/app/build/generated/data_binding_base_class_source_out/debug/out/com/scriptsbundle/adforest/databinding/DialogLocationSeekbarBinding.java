// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import com.xw.repo.BubbleSeekBar;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogLocationSeekbarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button cancelButton;

  @NonNull
  public final AutoCompleteTextView etLocation;

  @NonNull
  public final AutoCompleteTextView etLocationMapBox;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final TextView locationText;

  @NonNull
  public final BubbleSeekBar seakBar;

  @NonNull
  public final Button sendButton;

  @NonNull
  public final ImageView textView3;

  private DialogLocationSeekbarBinding(@NonNull RelativeLayout rootView,
      @NonNull Button cancelButton, @NonNull AutoCompleteTextView etLocation,
      @NonNull AutoCompleteTextView etLocationMapBox, @NonNull ImageView imageView4,
      @NonNull LinearLayout linearLayout5, @NonNull TextView locationText,
      @NonNull BubbleSeekBar seakBar, @NonNull Button sendButton, @NonNull ImageView textView3) {
    this.rootView = rootView;
    this.cancelButton = cancelButton;
    this.etLocation = etLocation;
    this.etLocationMapBox = etLocationMapBox;
    this.imageView4 = imageView4;
    this.linearLayout5 = linearLayout5;
    this.locationText = locationText;
    this.seakBar = seakBar;
    this.sendButton = sendButton;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogLocationSeekbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogLocationSeekbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_location_seekbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogLocationSeekbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cancel_button;
      Button cancelButton = ViewBindings.findChildViewById(rootView, id);
      if (cancelButton == null) {
        break missingId;
      }

      id = R.id.et_location;
      AutoCompleteTextView etLocation = ViewBindings.findChildViewById(rootView, id);
      if (etLocation == null) {
        break missingId;
      }

      id = R.id.et_location_mapBox;
      AutoCompleteTextView etLocationMapBox = ViewBindings.findChildViewById(rootView, id);
      if (etLocationMapBox == null) {
        break missingId;
      }

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

      id = R.id.locationText;
      TextView locationText = ViewBindings.findChildViewById(rootView, id);
      if (locationText == null) {
        break missingId;
      }

      id = R.id.seakBar;
      BubbleSeekBar seakBar = ViewBindings.findChildViewById(rootView, id);
      if (seakBar == null) {
        break missingId;
      }

      id = R.id.send_button;
      Button sendButton = ViewBindings.findChildViewById(rootView, id);
      if (sendButton == null) {
        break missingId;
      }

      id = R.id.textView3;
      ImageView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new DialogLocationSeekbarBinding((RelativeLayout) rootView, cancelButton, etLocation,
          etLocationMapBox, imageView4, linearLayout5, locationText, seakBar, sendButton,
          textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}