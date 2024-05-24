// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMomoVerificationBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView amount;

  @NonNull
  public final TextView currency;

  @NonNull
  public final TextView message;

  @NonNull
  public final TextView mtnHeading;

  @NonNull
  public final ImageView mtnIcon;

  @NonNull
  public final TextView note;

  @NonNull
  public final TextView partyId;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final Button verify;

  @NonNull
  public final View view1;

  @NonNull
  public final View view2;

  @NonNull
  public final View view3;

  @NonNull
  public final View view4;

  @NonNull
  public final View view5;

  private ActivityMomoVerificationBinding(@NonNull ConstraintLayout rootView,
      @NonNull TextView amount, @NonNull TextView currency, @NonNull TextView message,
      @NonNull TextView mtnHeading, @NonNull ImageView mtnIcon, @NonNull TextView note,
      @NonNull TextView partyId, @NonNull ProgressBar progressBar, @NonNull Toolbar toolbar,
      @NonNull Button verify, @NonNull View view1, @NonNull View view2, @NonNull View view3,
      @NonNull View view4, @NonNull View view5) {
    this.rootView = rootView;
    this.amount = amount;
    this.currency = currency;
    this.message = message;
    this.mtnHeading = mtnHeading;
    this.mtnIcon = mtnIcon;
    this.note = note;
    this.partyId = partyId;
    this.progressBar = progressBar;
    this.toolbar = toolbar;
    this.verify = verify;
    this.view1 = view1;
    this.view2 = view2;
    this.view3 = view3;
    this.view4 = view4;
    this.view5 = view5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMomoVerificationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMomoVerificationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_momo_verification, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMomoVerificationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.amount;
      TextView amount = ViewBindings.findChildViewById(rootView, id);
      if (amount == null) {
        break missingId;
      }

      id = R.id.currency;
      TextView currency = ViewBindings.findChildViewById(rootView, id);
      if (currency == null) {
        break missingId;
      }

      id = R.id.message;
      TextView message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.mtn_heading;
      TextView mtnHeading = ViewBindings.findChildViewById(rootView, id);
      if (mtnHeading == null) {
        break missingId;
      }

      id = R.id.mtn_icon;
      ImageView mtnIcon = ViewBindings.findChildViewById(rootView, id);
      if (mtnIcon == null) {
        break missingId;
      }

      id = R.id.note;
      TextView note = ViewBindings.findChildViewById(rootView, id);
      if (note == null) {
        break missingId;
      }

      id = R.id.party_id;
      TextView partyId = ViewBindings.findChildViewById(rootView, id);
      if (partyId == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.verify;
      Button verify = ViewBindings.findChildViewById(rootView, id);
      if (verify == null) {
        break missingId;
      }

      id = R.id.view1;
      View view1 = ViewBindings.findChildViewById(rootView, id);
      if (view1 == null) {
        break missingId;
      }

      id = R.id.view2;
      View view2 = ViewBindings.findChildViewById(rootView, id);
      if (view2 == null) {
        break missingId;
      }

      id = R.id.view3;
      View view3 = ViewBindings.findChildViewById(rootView, id);
      if (view3 == null) {
        break missingId;
      }

      id = R.id.view4;
      View view4 = ViewBindings.findChildViewById(rootView, id);
      if (view4 == null) {
        break missingId;
      }

      id = R.id.view5;
      View view5 = ViewBindings.findChildViewById(rootView, id);
      if (view5 == null) {
        break missingId;
      }

      return new ActivityMomoVerificationBinding((ConstraintLayout) rootView, amount, currency,
          message, mtnHeading, mtnIcon, note, partyId, progressBar, toolbar, verify, view1, view2,
          view3, view4, view5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}