// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentBidListBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView bidBtn;

  @NonNull
  public final RecyclerView cardView;

  @NonNull
  public final EditText editText3;

  @NonNull
  public final EditText editText4;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView18;

  private FragmentBidListBinding(@NonNull NestedScrollView rootView, @NonNull TextView bidBtn,
      @NonNull RecyclerView cardView, @NonNull EditText editText3, @NonNull EditText editText4,
      @NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout5,
      @NonNull TextView textView14, @NonNull TextView textView18) {
    this.rootView = rootView;
    this.bidBtn = bidBtn;
    this.cardView = cardView;
    this.editText3 = editText3;
    this.editText4 = editText4;
    this.linearLayout = linearLayout;
    this.linearLayout5 = linearLayout5;
    this.textView14 = textView14;
    this.textView18 = textView18;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentBidListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentBidListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_bid_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentBidListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bidBtn;
      TextView bidBtn = ViewBindings.findChildViewById(rootView, id);
      if (bidBtn == null) {
        break missingId;
      }

      id = R.id.cardView;
      RecyclerView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.editText3;
      EditText editText3 = ViewBindings.findChildViewById(rootView, id);
      if (editText3 == null) {
        break missingId;
      }

      id = R.id.editText4;
      EditText editText4 = ViewBindings.findChildViewById(rootView, id);
      if (editText4 == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView18;
      TextView textView18 = ViewBindings.findChildViewById(rootView, id);
      if (textView18 == null) {
        break missingId;
      }

      return new FragmentBidListBinding((NestedScrollView) rootView, bidBtn, cardView, editText3,
          editText4, linearLayout, linearLayout5, textView14, textView18);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}