// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.scriptsbundle.adforest.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemBlockMessageBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout cardView;

  @NonNull
  public final CircleImageView profileImage;

  @NonNull
  public final TextView tvUnblockUser;

  @NonNull
  public final TextView tvUserAddress;

  @NonNull
  public final TextView tvUserName;

  private ItemBlockMessageBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout cardView, @NonNull CircleImageView profileImage,
      @NonNull TextView tvUnblockUser, @NonNull TextView tvUserAddress,
      @NonNull TextView tvUserName) {
    this.rootView = rootView;
    this.cardView = cardView;
    this.profileImage = profileImage;
    this.tvUnblockUser = tvUnblockUser;
    this.tvUserAddress = tvUserAddress;
    this.tvUserName = tvUserName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemBlockMessageBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemBlockMessageBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_block_message, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemBlockMessageBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout cardView = (RelativeLayout) rootView;

      id = R.id.profileImage;
      CircleImageView profileImage = ViewBindings.findChildViewById(rootView, id);
      if (profileImage == null) {
        break missingId;
      }

      id = R.id.tv_unblock_user;
      TextView tvUnblockUser = ViewBindings.findChildViewById(rootView, id);
      if (tvUnblockUser == null) {
        break missingId;
      }

      id = R.id.tv_user_address;
      TextView tvUserAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvUserAddress == null) {
        break missingId;
      }

      id = R.id.tv_user_name;
      TextView tvUserName = ViewBindings.findChildViewById(rootView, id);
      if (tvUserName == null) {
        break missingId;
      }

      return new ItemBlockMessageBinding((RelativeLayout) rootView, cardView, profileImage,
          tvUnblockUser, tvUserAddress, tvUserName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
