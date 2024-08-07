// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemofEditImageBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView delAdd;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RelativeLayout linearLayoutCardView;

  private ItemofEditImageBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull ImageView delAdd, @NonNull ImageView imageView,
      @NonNull RelativeLayout linearLayoutCardView) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.delAdd = delAdd;
    this.imageView = imageView;
    this.linearLayoutCardView = linearLayoutCardView;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemofEditImageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemofEditImageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.itemof_edit_image, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemofEditImageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.delAdd;
      ImageView delAdd = ViewBindings.findChildViewById(rootView, id);
      if (delAdd == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      RelativeLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      return new ItemofEditImageBinding((CardView) rootView, cardView, delAdd, imageView,
          linearLayoutCardView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
