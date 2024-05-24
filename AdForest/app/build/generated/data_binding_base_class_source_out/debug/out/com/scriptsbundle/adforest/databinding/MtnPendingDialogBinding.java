// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

public final class MtnPendingDialogBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button dialogOkBtn;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView textView1;

  @NonNull
  public final TextView textView2;

  private MtnPendingDialogBinding(@NonNull ConstraintLayout rootView, @NonNull Button dialogOkBtn,
      @NonNull ImageView imageView3, @NonNull TextView textView1, @NonNull TextView textView2) {
    this.rootView = rootView;
    this.dialogOkBtn = dialogOkBtn;
    this.imageView3 = imageView3;
    this.textView1 = textView1;
    this.textView2 = textView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MtnPendingDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MtnPendingDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.mtn_pending_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MtnPendingDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.dialog_ok_btn;
      Button dialogOkBtn = ViewBindings.findChildViewById(rootView, id);
      if (dialogOkBtn == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.textView1;
      TextView textView1 = ViewBindings.findChildViewById(rootView, id);
      if (textView1 == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      return new MtnPendingDialogBinding((ConstraintLayout) rootView, dialogOkBtn, imageView3,
          textView1, textView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
