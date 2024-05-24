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
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPayStackBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnMakePayment;

  @NonNull
  public final TextInputEditText cardExpiry;

  @NonNull
  public final TextInputEditText cardNumber;

  @NonNull
  public final TextInputEditText cvv;

  @NonNull
  public final TextView errorTextView;

  @NonNull
  public final ImageView payStackIcon;

  @NonNull
  public final ProgressBar progressBar3;

  @NonNull
  public final TextInputLayout tilCardCvv;

  @NonNull
  public final TextInputLayout tilCardExpiry;

  @NonNull
  public final TextInputLayout tilCardNumber;

  private ActivityPayStackBinding(@NonNull ConstraintLayout rootView,
      @NonNull Button btnMakePayment, @NonNull TextInputEditText cardExpiry,
      @NonNull TextInputEditText cardNumber, @NonNull TextInputEditText cvv,
      @NonNull TextView errorTextView, @NonNull ImageView payStackIcon,
      @NonNull ProgressBar progressBar3, @NonNull TextInputLayout tilCardCvv,
      @NonNull TextInputLayout tilCardExpiry, @NonNull TextInputLayout tilCardNumber) {
    this.rootView = rootView;
    this.btnMakePayment = btnMakePayment;
    this.cardExpiry = cardExpiry;
    this.cardNumber = cardNumber;
    this.cvv = cvv;
    this.errorTextView = errorTextView;
    this.payStackIcon = payStackIcon;
    this.progressBar3 = progressBar3;
    this.tilCardCvv = tilCardCvv;
    this.tilCardExpiry = tilCardExpiry;
    this.tilCardNumber = tilCardNumber;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPayStackBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPayStackBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_pay_stack, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPayStackBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_make_payment;
      Button btnMakePayment = ViewBindings.findChildViewById(rootView, id);
      if (btnMakePayment == null) {
        break missingId;
      }

      id = R.id.card_expiry;
      TextInputEditText cardExpiry = ViewBindings.findChildViewById(rootView, id);
      if (cardExpiry == null) {
        break missingId;
      }

      id = R.id.card_number;
      TextInputEditText cardNumber = ViewBindings.findChildViewById(rootView, id);
      if (cardNumber == null) {
        break missingId;
      }

      id = R.id.cvv;
      TextInputEditText cvv = ViewBindings.findChildViewById(rootView, id);
      if (cvv == null) {
        break missingId;
      }

      id = R.id.error_text_view;
      TextView errorTextView = ViewBindings.findChildViewById(rootView, id);
      if (errorTextView == null) {
        break missingId;
      }

      id = R.id.payStackIcon;
      ImageView payStackIcon = ViewBindings.findChildViewById(rootView, id);
      if (payStackIcon == null) {
        break missingId;
      }

      id = R.id.progressBar3;
      ProgressBar progressBar3 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar3 == null) {
        break missingId;
      }

      id = R.id.til_card_cvv;
      TextInputLayout tilCardCvv = ViewBindings.findChildViewById(rootView, id);
      if (tilCardCvv == null) {
        break missingId;
      }

      id = R.id.til_card_expiry;
      TextInputLayout tilCardExpiry = ViewBindings.findChildViewById(rootView, id);
      if (tilCardExpiry == null) {
        break missingId;
      }

      id = R.id.til_card_number;
      TextInputLayout tilCardNumber = ViewBindings.findChildViewById(rootView, id);
      if (tilCardNumber == null) {
        break missingId;
      }

      return new ActivityPayStackBinding((ConstraintLayout) rootView, btnMakePayment, cardExpiry,
          cardNumber, cvv, errorTextView, payStackIcon, progressBar3, tilCardCvv, tilCardExpiry,
          tilCardNumber);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}