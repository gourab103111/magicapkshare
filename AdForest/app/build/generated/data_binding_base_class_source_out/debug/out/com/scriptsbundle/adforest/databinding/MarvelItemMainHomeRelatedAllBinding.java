// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class MarvelItemMainHomeRelatedAllBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView btnViewAll;

  @NonNull
  public final LinearLayout iner1;

  @NonNull
  public final RecyclerView sublist;

  @NonNull
  public final TextView title;

  private MarvelItemMainHomeRelatedAllBinding(@NonNull RelativeLayout rootView,
      @NonNull TextView btnViewAll, @NonNull LinearLayout iner1, @NonNull RecyclerView sublist,
      @NonNull TextView title) {
    this.rootView = rootView;
    this.btnViewAll = btnViewAll;
    this.iner1 = iner1;
    this.sublist = sublist;
    this.title = title;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static MarvelItemMainHomeRelatedAllBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static MarvelItemMainHomeRelatedAllBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.marvel_item_main_home_related_all, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static MarvelItemMainHomeRelatedAllBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnViewAll;
      TextView btnViewAll = ViewBindings.findChildViewById(rootView, id);
      if (btnViewAll == null) {
        break missingId;
      }

      id = R.id.iner1;
      LinearLayout iner1 = ViewBindings.findChildViewById(rootView, id);
      if (iner1 == null) {
        break missingId;
      }

      id = R.id.sublist;
      RecyclerView sublist = ViewBindings.findChildViewById(rootView, id);
      if (sublist == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new MarvelItemMainHomeRelatedAllBinding((RelativeLayout) rootView, btnViewAll, iner1,
          sublist, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
