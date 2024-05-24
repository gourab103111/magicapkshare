// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LoginLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout btnL;

  @NonNull
  public final LinearLayout btnLL;

  @NonNull
  public final TextView createAccount;

  @NonNull
  public final Button fbLogin;

  @NonNull
  public final TextView forgotPassword;

  @NonNull
  public final Button gmailLogin;

  @NonNull
  public final LinearLayout guestLayout;

  @NonNull
  public final View line;

  @NonNull
  public final Button linkedin;

  @NonNull
  public final Button loginBtn;

  @NonNull
  public final EditText loginEmailid;

  @NonNull
  public final LinearLayout loginLayout;

  @NonNull
  public final EditText loginPassword;

  @NonNull
  public final LinearLayout logo;

  @NonNull
  public final ImageView logoimage;

  @NonNull
  public final NestedScrollView nestedScroll;

  @NonNull
  public final TextView or;

  @NonNull
  public final LinearLayout passwordLayout;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final ImageView showPwd;

  @NonNull
  public final Button startExplore;

  @NonNull
  public final TextView welcomeTV;

  private LoginLayoutBinding(@NonNull RelativeLayout rootView, @NonNull RelativeLayout btnL,
      @NonNull LinearLayout btnLL, @NonNull TextView createAccount, @NonNull Button fbLogin,
      @NonNull TextView forgotPassword, @NonNull Button gmailLogin,
      @NonNull LinearLayout guestLayout, @NonNull View line, @NonNull Button linkedin,
      @NonNull Button loginBtn, @NonNull EditText loginEmailid, @NonNull LinearLayout loginLayout,
      @NonNull EditText loginPassword, @NonNull LinearLayout logo, @NonNull ImageView logoimage,
      @NonNull NestedScrollView nestedScroll, @NonNull TextView or,
      @NonNull LinearLayout passwordLayout, @NonNull ShimmerFrameLayout shimmerFrameLayout,
      @NonNull LinearLayout shimmerMain, @NonNull ImageView showPwd, @NonNull Button startExplore,
      @NonNull TextView welcomeTV) {
    this.rootView = rootView;
    this.btnL = btnL;
    this.btnLL = btnLL;
    this.createAccount = createAccount;
    this.fbLogin = fbLogin;
    this.forgotPassword = forgotPassword;
    this.gmailLogin = gmailLogin;
    this.guestLayout = guestLayout;
    this.line = line;
    this.linkedin = linkedin;
    this.loginBtn = loginBtn;
    this.loginEmailid = loginEmailid;
    this.loginLayout = loginLayout;
    this.loginPassword = loginPassword;
    this.logo = logo;
    this.logoimage = logoimage;
    this.nestedScroll = nestedScroll;
    this.or = or;
    this.passwordLayout = passwordLayout;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.shimmerMain = shimmerMain;
    this.showPwd = showPwd;
    this.startExplore = startExplore;
    this.welcomeTV = welcomeTV;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LoginLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LoginLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.login_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LoginLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnL;
      RelativeLayout btnL = ViewBindings.findChildViewById(rootView, id);
      if (btnL == null) {
        break missingId;
      }

      id = R.id.btnLL;
      LinearLayout btnLL = ViewBindings.findChildViewById(rootView, id);
      if (btnLL == null) {
        break missingId;
      }

      id = R.id.createAccount;
      TextView createAccount = ViewBindings.findChildViewById(rootView, id);
      if (createAccount == null) {
        break missingId;
      }

      id = R.id.fbLogin;
      Button fbLogin = ViewBindings.findChildViewById(rootView, id);
      if (fbLogin == null) {
        break missingId;
      }

      id = R.id.forgot_password;
      TextView forgotPassword = ViewBindings.findChildViewById(rootView, id);
      if (forgotPassword == null) {
        break missingId;
      }

      id = R.id.gmailLogin;
      Button gmailLogin = ViewBindings.findChildViewById(rootView, id);
      if (gmailLogin == null) {
        break missingId;
      }

      id = R.id.guestLayout;
      LinearLayout guestLayout = ViewBindings.findChildViewById(rootView, id);
      if (guestLayout == null) {
        break missingId;
      }

      id = R.id.line;
      View line = ViewBindings.findChildViewById(rootView, id);
      if (line == null) {
        break missingId;
      }

      id = R.id.linkedin;
      Button linkedin = ViewBindings.findChildViewById(rootView, id);
      if (linkedin == null) {
        break missingId;
      }

      id = R.id.loginBtn;
      Button loginBtn = ViewBindings.findChildViewById(rootView, id);
      if (loginBtn == null) {
        break missingId;
      }

      id = R.id.login_emailid;
      EditText loginEmailid = ViewBindings.findChildViewById(rootView, id);
      if (loginEmailid == null) {
        break missingId;
      }

      id = R.id.login_layout;
      LinearLayout loginLayout = ViewBindings.findChildViewById(rootView, id);
      if (loginLayout == null) {
        break missingId;
      }

      id = R.id.login_password;
      EditText loginPassword = ViewBindings.findChildViewById(rootView, id);
      if (loginPassword == null) {
        break missingId;
      }

      id = R.id.logo;
      LinearLayout logo = ViewBindings.findChildViewById(rootView, id);
      if (logo == null) {
        break missingId;
      }

      id = R.id.logoimage;
      ImageView logoimage = ViewBindings.findChildViewById(rootView, id);
      if (logoimage == null) {
        break missingId;
      }

      id = R.id.nestedScroll;
      NestedScrollView nestedScroll = ViewBindings.findChildViewById(rootView, id);
      if (nestedScroll == null) {
        break missingId;
      }

      id = R.id.or;
      TextView or = ViewBindings.findChildViewById(rootView, id);
      if (or == null) {
        break missingId;
      }

      id = R.id.passwordLayout;
      LinearLayout passwordLayout = ViewBindings.findChildViewById(rootView, id);
      if (passwordLayout == null) {
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

      id = R.id.showPwd;
      ImageView showPwd = ViewBindings.findChildViewById(rootView, id);
      if (showPwd == null) {
        break missingId;
      }

      id = R.id.startExplore;
      Button startExplore = ViewBindings.findChildViewById(rootView, id);
      if (startExplore == null) {
        break missingId;
      }

      id = R.id.welcomeTV;
      TextView welcomeTV = ViewBindings.findChildViewById(rootView, id);
      if (welcomeTV == null) {
        break missingId;
      }

      return new LoginLayoutBinding((RelativeLayout) rootView, btnL, btnLL, createAccount, fbLogin,
          forgotPassword, gmailLogin, guestLayout, line, linkedin, loginBtn, loginEmailid,
          loginLayout, loginPassword, logo, logoimage, nestedScroll, or, passwordLayout,
          shimmerFrameLayout, shimmerMain, showPwd, startExplore, welcomeTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}