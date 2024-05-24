// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class PopupSavedJobsSuccessBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ImageView imgClose;

  @NonNull
  public final TextView txtSuccess;

  @NonNull
  public final TextView txtSuccessData;

  private PopupSavedJobsSuccessBinding(@NonNull CardView rootView, @NonNull ImageView imgClose,
      @NonNull TextView txtSuccess, @NonNull TextView txtSuccessData) {
    this.rootView = rootView;
    this.imgClose = imgClose;
    this.txtSuccess = txtSuccess;
    this.txtSuccessData = txtSuccessData;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static PopupSavedJobsSuccessBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static PopupSavedJobsSuccessBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.popup_saved_jobs_success, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static PopupSavedJobsSuccessBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_close;
      ImageView imgClose = ViewBindings.findChildViewById(rootView, id);
      if (imgClose == null) {
        break missingId;
      }

      id = R.id.txt_success;
      TextView txtSuccess = ViewBindings.findChildViewById(rootView, id);
      if (txtSuccess == null) {
        break missingId;
      }

      id = R.id.txt_success_data;
      TextView txtSuccessData = ViewBindings.findChildViewById(rootView, id);
      if (txtSuccessData == null) {
        break missingId;
      }

      return new PopupSavedJobsSuccessBinding((CardView) rootView, imgClose, txtSuccess,
          txtSuccessData);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
