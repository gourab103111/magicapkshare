// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileEditBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final TextView addfav;

  @NonNull
  public final CardView cardView;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final TextView deleteAccount;

  @NonNull
  public final LinearLayout editProfileCustomLayout;

  @NonNull
  public final AutoCompleteTextView editTexLocation;

  @NonNull
  public final EditText editTextName;

  @NonNull
  public final EditText editTextPhone;

  @NonNull
  public final EditText etLocationMapBox;

  @NonNull
  public final TextView expired;

  @NonNull
  public final ImageView imageSelected;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final LinearLayout line4;

  @NonNull
  public final LinearLayout linearLayoutCardView;

  @NonNull
  public final LinearLayout ll11;

  @NonNull
  public final TextView loginTime;

  @NonNull
  public final RelativeLayout mainRelative;

  @NonNull
  public final TextView numberOfRate;

  @NonNull
  public final LinearLayout publicProfileCustomIcons;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView report;

  @NonNull
  public final TextView share;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final EditText textAreaInformation;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textViewAccountType;

  @NonNull
  public final TextView textViewCancel;

  @NonNull
  public final TextView textViewChangePwd;

  @NonNull
  public final TextView textViewEmailKey;

  @NonNull
  public final EditText textViewEmailValue;

  @NonNull
  public final TextView textViewIntroduction;

  @NonNull
  public final TextView textViewLocation;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewName1;

  @NonNull
  public final TextView textViewPhone;

  @NonNull
  public final TextView textViewSend;

  @NonNull
  public final TextView textViewSetImage;

  @NonNull
  public final TextView verified;

  private FragmentProfileEditBinding(@NonNull NestedScrollView rootView, @NonNull TextView addfav,
      @NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView deleteAccount,
      @NonNull LinearLayout editProfileCustomLayout, @NonNull AutoCompleteTextView editTexLocation,
      @NonNull EditText editTextName, @NonNull EditText editTextPhone,
      @NonNull EditText etLocationMapBox, @NonNull TextView expired,
      @NonNull ImageView imageSelected, @NonNull ImageView imageView, @NonNull LinearLayout line4,
      @NonNull LinearLayout linearLayoutCardView, @NonNull LinearLayout ll11,
      @NonNull TextView loginTime, @NonNull RelativeLayout mainRelative,
      @NonNull TextView numberOfRate, @NonNull LinearLayout publicProfileCustomIcons,
      @NonNull RatingBar ratingBar, @NonNull TextView report, @NonNull TextView share,
      @NonNull ShimmerFrameLayout shimmerFrameLayout, @NonNull LinearLayout shimmerMain,
      @NonNull Spinner spinner, @NonNull EditText textAreaInformation, @NonNull TextView textView,
      @NonNull TextView textViewAccountType, @NonNull TextView textViewCancel,
      @NonNull TextView textViewChangePwd, @NonNull TextView textViewEmailKey,
      @NonNull EditText textViewEmailValue, @NonNull TextView textViewIntroduction,
      @NonNull TextView textViewLocation, @NonNull TextView textViewName,
      @NonNull TextView textViewName1, @NonNull TextView textViewPhone,
      @NonNull TextView textViewSend, @NonNull TextView textViewSetImage,
      @NonNull TextView verified) {
    this.rootView = rootView;
    this.addfav = addfav;
    this.cardView = cardView;
    this.cardView2 = cardView2;
    this.deleteAccount = deleteAccount;
    this.editProfileCustomLayout = editProfileCustomLayout;
    this.editTexLocation = editTexLocation;
    this.editTextName = editTextName;
    this.editTextPhone = editTextPhone;
    this.etLocationMapBox = etLocationMapBox;
    this.expired = expired;
    this.imageSelected = imageSelected;
    this.imageView = imageView;
    this.line4 = line4;
    this.linearLayoutCardView = linearLayoutCardView;
    this.ll11 = ll11;
    this.loginTime = loginTime;
    this.mainRelative = mainRelative;
    this.numberOfRate = numberOfRate;
    this.publicProfileCustomIcons = publicProfileCustomIcons;
    this.ratingBar = ratingBar;
    this.report = report;
    this.share = share;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.shimmerMain = shimmerMain;
    this.spinner = spinner;
    this.textAreaInformation = textAreaInformation;
    this.textView = textView;
    this.textViewAccountType = textViewAccountType;
    this.textViewCancel = textViewCancel;
    this.textViewChangePwd = textViewChangePwd;
    this.textViewEmailKey = textViewEmailKey;
    this.textViewEmailValue = textViewEmailValue;
    this.textViewIntroduction = textViewIntroduction;
    this.textViewLocation = textViewLocation;
    this.textViewName = textViewName;
    this.textViewName1 = textViewName1;
    this.textViewPhone = textViewPhone;
    this.textViewSend = textViewSend;
    this.textViewSetImage = textViewSetImage;
    this.verified = verified;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileEditBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile_edit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileEditBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addfav;
      TextView addfav = ViewBindings.findChildViewById(rootView, id);
      if (addfav == null) {
        break missingId;
      }

      id = R.id.card_view;
      CardView cardView = ViewBindings.findChildViewById(rootView, id);
      if (cardView == null) {
        break missingId;
      }

      id = R.id.card_view2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.deleteAccount;
      TextView deleteAccount = ViewBindings.findChildViewById(rootView, id);
      if (deleteAccount == null) {
        break missingId;
      }

      id = R.id.editProfileCustomLayout;
      LinearLayout editProfileCustomLayout = ViewBindings.findChildViewById(rootView, id);
      if (editProfileCustomLayout == null) {
        break missingId;
      }

      id = R.id.editTexLocation;
      AutoCompleteTextView editTexLocation = ViewBindings.findChildViewById(rootView, id);
      if (editTexLocation == null) {
        break missingId;
      }

      id = R.id.editTextName;
      EditText editTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextName == null) {
        break missingId;
      }

      id = R.id.editTextPhone;
      EditText editTextPhone = ViewBindings.findChildViewById(rootView, id);
      if (editTextPhone == null) {
        break missingId;
      }

      id = R.id.et_location_mapBox;
      EditText etLocationMapBox = ViewBindings.findChildViewById(rootView, id);
      if (etLocationMapBox == null) {
        break missingId;
      }

      id = R.id.expired;
      TextView expired = ViewBindings.findChildViewById(rootView, id);
      if (expired == null) {
        break missingId;
      }

      id = R.id.imageSelected;
      ImageView imageSelected = ViewBindings.findChildViewById(rootView, id);
      if (imageSelected == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.line4;
      LinearLayout line4 = ViewBindings.findChildViewById(rootView, id);
      if (line4 == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view;
      LinearLayout linearLayoutCardView = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView == null) {
        break missingId;
      }

      id = R.id.ll11;
      LinearLayout ll11 = ViewBindings.findChildViewById(rootView, id);
      if (ll11 == null) {
        break missingId;
      }

      id = R.id.loginTime;
      TextView loginTime = ViewBindings.findChildViewById(rootView, id);
      if (loginTime == null) {
        break missingId;
      }

      id = R.id.mainRelative;
      RelativeLayout mainRelative = ViewBindings.findChildViewById(rootView, id);
      if (mainRelative == null) {
        break missingId;
      }

      id = R.id.numberOfRate;
      TextView numberOfRate = ViewBindings.findChildViewById(rootView, id);
      if (numberOfRate == null) {
        break missingId;
      }

      id = R.id.publicProfileCustomIcons;
      LinearLayout publicProfileCustomIcons = ViewBindings.findChildViewById(rootView, id);
      if (publicProfileCustomIcons == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.report;
      TextView report = ViewBindings.findChildViewById(rootView, id);
      if (report == null) {
        break missingId;
      }

      id = R.id.share;
      TextView share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      id = R.id.shimmerFrameLayout;
      ShimmerFrameLayout shimmerFrameLayout = ViewBindings.findChildViewById(rootView, id);
      if (shimmerFrameLayout == null) {
        break missingId;
      }

      id = R.id.shimmerMain;
      LinearLayout shimmerMain = ViewBindings.findChildViewById(rootView, id);
      if (shimmerMain == null) {
        break missingId;
      }

      id = R.id.spinner;
      Spinner spinner = ViewBindings.findChildViewById(rootView, id);
      if (spinner == null) {
        break missingId;
      }

      id = R.id.textArea_information;
      EditText textAreaInformation = ViewBindings.findChildViewById(rootView, id);
      if (textAreaInformation == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textViewAccount_type;
      TextView textViewAccountType = ViewBindings.findChildViewById(rootView, id);
      if (textViewAccountType == null) {
        break missingId;
      }

      id = R.id.textViewCancel;
      TextView textViewCancel = ViewBindings.findChildViewById(rootView, id);
      if (textViewCancel == null) {
        break missingId;
      }

      id = R.id.textViewChangePwd;
      TextView textViewChangePwd = ViewBindings.findChildViewById(rootView, id);
      if (textViewChangePwd == null) {
        break missingId;
      }

      id = R.id.textViewEmailKey;
      TextView textViewEmailKey = ViewBindings.findChildViewById(rootView, id);
      if (textViewEmailKey == null) {
        break missingId;
      }

      id = R.id.textViewEmailValue;
      EditText textViewEmailValue = ViewBindings.findChildViewById(rootView, id);
      if (textViewEmailValue == null) {
        break missingId;
      }

      id = R.id.textViewIntroduction;
      TextView textViewIntroduction = ViewBindings.findChildViewById(rootView, id);
      if (textViewIntroduction == null) {
        break missingId;
      }

      id = R.id.textViewLocation;
      TextView textViewLocation = ViewBindings.findChildViewById(rootView, id);
      if (textViewLocation == null) {
        break missingId;
      }

      id = R.id.text_viewName;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.textViewName;
      TextView textViewName1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewName1 == null) {
        break missingId;
      }

      id = R.id.textViewPhone;
      TextView textViewPhone = ViewBindings.findChildViewById(rootView, id);
      if (textViewPhone == null) {
        break missingId;
      }

      id = R.id.textViewSend;
      TextView textViewSend = ViewBindings.findChildViewById(rootView, id);
      if (textViewSend == null) {
        break missingId;
      }

      id = R.id.textViewSetImage;
      TextView textViewSetImage = ViewBindings.findChildViewById(rootView, id);
      if (textViewSetImage == null) {
        break missingId;
      }

      id = R.id.verified;
      TextView verified = ViewBindings.findChildViewById(rootView, id);
      if (verified == null) {
        break missingId;
      }

      return new FragmentProfileEditBinding((NestedScrollView) rootView, addfav, cardView,
          cardView2, deleteAccount, editProfileCustomLayout, editTexLocation, editTextName,
          editTextPhone, etLocationMapBox, expired, imageSelected, imageView, line4,
          linearLayoutCardView, ll11, loginTime, mainRelative, numberOfRate,
          publicProfileCustomIcons, ratingBar, report, share, shimmerFrameLayout, shimmerMain,
          spinner, textAreaInformation, textView, textViewAccountType, textViewCancel,
          textViewChangePwd, textViewEmailKey, textViewEmailValue, textViewIntroduction,
          textViewLocation, textViewName, textViewName1, textViewPhone, textViewSend,
          textViewSetImage, verified);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
