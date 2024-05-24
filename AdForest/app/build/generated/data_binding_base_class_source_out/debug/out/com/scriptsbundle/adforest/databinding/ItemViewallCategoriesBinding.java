// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

public final class ItemViewallCategoriesBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final RelativeLayout layoutCategories;

  @NonNull
  public final TextView tvCatValue;

  private ItemViewallCategoriesBinding(@NonNull RelativeLayout rootView,
      @NonNull ImageView imageView, @NonNull RelativeLayout layoutCategories,
      @NonNull TextView tvCatValue) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.layoutCategories = layoutCategories;
    this.tvCatValue = tvCatValue;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemViewallCategoriesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemViewallCategoriesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_viewall_categories, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemViewallCategoriesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      RelativeLayout layoutCategories = (RelativeLayout) rootView;

      id = R.id.tv_cat_value;
      TextView tvCatValue = ViewBindings.findChildViewById(rootView, id);
      if (tvCatValue == null) {
        break missingId;
      }

      return new ItemViewallCategoriesBinding((RelativeLayout) rootView, imageView,
          layoutCategories, tvCatValue);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
