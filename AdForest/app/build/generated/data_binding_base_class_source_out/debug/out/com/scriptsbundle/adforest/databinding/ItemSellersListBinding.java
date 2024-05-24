// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
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

public final class ItemSellersListBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final ImageView profileImage;

  @NonNull
  public final LinearLayout sellersSoicalIcons;

  @NonNull
  public final TextView tvAuthorLocation;

  @NonNull
  public final TextView tvAuthorName;

  @NonNull
  public final RatingBar tvAuthorRating;

  @NonNull
  public final View viw;

  private ItemSellersListBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull ImageView profileImage, @NonNull LinearLayout sellersSoicalIcons,
      @NonNull TextView tvAuthorLocation, @NonNull TextView tvAuthorName,
      @NonNull RatingBar tvAuthorRating, @NonNull View viw) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.profileImage = profileImage;
    this.sellersSoicalIcons = sellersSoicalIcons;
    this.tvAuthorLocation = tvAuthorLocation;
    this.tvAuthorName = tvAuthorName;
    this.tvAuthorRating = tvAuthorRating;
    this.viw = viw;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemSellersListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemSellersListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_sellers_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemSellersListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.profileImage;
      ImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.sellersSoicalIcons;
      LinearLayout sellersSoicalIcons = ViewBindings.findChildViewById(rootView, id);
      if (sellersSoicalIcons == null) {
        break missingId;
      }

      id = R.id.tv_author_location;
      TextView tvAuthorLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthorLocation == null) {
        break missingId;
      }

      id = R.id.tv_author_name;
      TextView tvAuthorName = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthorName == null) {
        break missingId;
      }

      id = R.id.tv_author_rating;
      RatingBar tvAuthorRating = ViewBindings.findChildViewById(rootView, id);
      if (tvAuthorRating == null) {
        break missingId;
      }

      id = R.id.viw;
      View viw = ViewBindings.findChildViewById(rootView, id);
      if (viw == null) {
        break missingId;
      }

      return new ItemSellersListBinding((CardView) rootView, cardView, profileImage,
          sellersSoicalIcons, tvAuthorLocation, tvAuthorName, tvAuthorRating, viw);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}