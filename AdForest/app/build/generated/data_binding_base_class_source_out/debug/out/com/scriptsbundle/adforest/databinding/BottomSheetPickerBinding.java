// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetPickerBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView fileIcon;

  @NonNull
  public final LinearLayout filesLayout;

  @NonNull
  public final TextView filesText;

  @NonNull
  public final TextView heading;

  @NonNull
  public final ImageView imageIcon;

  @NonNull
  public final TextView imageText;

  @NonNull
  public final LinearLayout imagesLayout;

  @NonNull
  public final ImageView mapIcon;

  @NonNull
  public final LinearLayout mapLayout;

  @NonNull
  public final TextView mapText;

  @NonNull
  public final View view;

  private BottomSheetPickerBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView fileIcon,
      @NonNull LinearLayout filesLayout, @NonNull TextView filesText, @NonNull TextView heading,
      @NonNull ImageView imageIcon, @NonNull TextView imageText, @NonNull LinearLayout imagesLayout,
      @NonNull ImageView mapIcon, @NonNull LinearLayout mapLayout, @NonNull TextView mapText,
      @NonNull View view) {
    this.rootView = rootView;
    this.fileIcon = fileIcon;
    this.filesLayout = filesLayout;
    this.filesText = filesText;
    this.heading = heading;
    this.imageIcon = imageIcon;
    this.imageText = imageText;
    this.imagesLayout = imagesLayout;
    this.mapIcon = mapIcon;
    this.mapLayout = mapLayout;
    this.mapText = mapText;
    this.view = view;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetPickerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetPickerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_picker, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetPickerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fileIcon;
      ImageView fileIcon = ViewBindings.findChildViewById(rootView, id);
      if (fileIcon == null) {
        break missingId;
      }

      id = R.id.filesLayout;
      LinearLayout filesLayout = ViewBindings.findChildViewById(rootView, id);
      if (filesLayout == null) {
        break missingId;
      }

      id = R.id.filesText;
      TextView filesText = ViewBindings.findChildViewById(rootView, id);
      if (filesText == null) {
        break missingId;
      }

      id = R.id.heading;
      TextView heading = ViewBindings.findChildViewById(rootView, id);
      if (heading == null) {
        break missingId;
      }

      id = R.id.imageIcon;
      ImageView imageIcon = ViewBindings.findChildViewById(rootView, id);
      if (imageIcon == null) {
        break missingId;
      }

      id = R.id.imageText;
      TextView imageText = ViewBindings.findChildViewById(rootView, id);
      if (imageText == null) {
        break missingId;
      }

      id = R.id.imagesLayout;
      LinearLayout imagesLayout = ViewBindings.findChildViewById(rootView, id);
      if (imagesLayout == null) {
        break missingId;
      }

      id = R.id.mapIcon;
      ImageView mapIcon = ViewBindings.findChildViewById(rootView, id);
      if (mapIcon == null) {
        break missingId;
      }

      id = R.id.mapLayout;
      LinearLayout mapLayout = ViewBindings.findChildViewById(rootView, id);
      if (mapLayout == null) {
        break missingId;
      }

      id = R.id.mapText;
      TextView mapText = ViewBindings.findChildViewById(rootView, id);
      if (mapText == null) {
        break missingId;
      }

      id = R.id.view;
      View view = ViewBindings.findChildViewById(rootView, id);
      if (view == null) {
        break missingId;
      }

      return new BottomSheetPickerBinding((ConstraintLayout) rootView, fileIcon, filesLayout,
          filesText, heading, imageIcon, imageText, imagesLayout, mapIcon, mapLayout, mapText,
          view);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}