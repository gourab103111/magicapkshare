// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogforcatBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView a;

  @NonNull
  public final Button btnDialog;

  @NonNull
  public final TextView textDialog;

  private DialogforcatBinding(@NonNull RelativeLayout rootView, @NonNull ImageView a,
      @NonNull Button btnDialog, @NonNull TextView textDialog) {
    this.rootView = rootView;
    this.a = a;
    this.btnDialog = btnDialog;
    this.textDialog = textDialog;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogforcatBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogforcatBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialogforcat, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogforcatBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.a;
      ImageView a = ViewBindings.findChildViewById(rootView, id);
      if (a == null) {
        break missingId;
      }

      id = R.id.btn_dialog;
      Button btnDialog = ViewBindings.findChildViewById(rootView, id);
      if (btnDialog == null) {
        break missingId;
      }

      id = R.id.text_dialog;
      TextView textDialog = ViewBindings.findChildViewById(rootView, id);
      if (textDialog == null) {
        break missingId;
      }

      return new DialogforcatBinding((RelativeLayout) rootView, a, btnDialog, textDialog);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}