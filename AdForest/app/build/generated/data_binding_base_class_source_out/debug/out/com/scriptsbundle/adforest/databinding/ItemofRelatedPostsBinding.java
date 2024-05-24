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
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemofRelatedPostsBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final TextView date;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout lastrow;

  @NonNull
  public final LinearLayout linearLayoutCardView;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final TextView location;

  @NonNull
  public final TextView prices;

  @NonNull
  public final TextView textViewName;

  private ItemofRelatedPostsBinding(@NonNull CardView rootView, @NonNull CardView cardView,
      @NonNull TextView date, @NonNull ImageView imageView, @NonNull LinearLayout lastrow,
      @NonNull LinearLayout linearLayoutCardView, @NonNull LinearLayout ll1,
      @NonNull TextView location, @NonNull TextView prices, @NonNull TextView textViewName) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.date = date;
    this.imageView = imageView;
    this.lastrow = lastrow;
    this.linearLayoutCardView = linearLayoutCardView;
    this.ll1 = ll1;
    this.location = location;
    this.prices = prices;
    this.textViewName = textViewName;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemofRelatedPostsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemofRelatedPostsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.itemof_related_posts, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemofRelatedPostsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      CardView cardView = (CardView) rootView;

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.lastrow;
      LinearLayout lastrow = ViewBindings.findChildViewById(rootView, id);
      if (lastrow == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      LinearLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      id = R.id.ll1;
      LinearLayout ll1 = ViewBindings.findChildViewById(rootView, id);
      if (ll1 == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.prices;
      TextView prices = ViewBindings.findChildViewById(rootView, id);
      if (prices == null) {
        break missingId;
      }

      id = R.id.text_view_name;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      return new ItemofRelatedPostsBinding((CardView) rootView, cardView, date, imageView, lastrow,
          linearLayoutCardView, ll1, location, prices, textViewName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}