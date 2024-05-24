// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class WhizzchatItemChatRtlBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final RelativeLayout bubbleLayoutParent;

  @NonNull
  public final LinearLayout chatBubble;

  @NonNull
  public final TextView fileDate;

  @NonNull
  public final TextView fileName;

  @NonNull
  public final LinearLayout filesLayout;

  @NonNull
  public final TextView imageDate;

  @NonNull
  public final LinearLayout imageInner;

  @NonNull
  public final LinearLayout imageLayout;

  @NonNull
  public final TextView mapDate;

  @NonNull
  public final LinearLayout mapLayout;

  @NonNull
  public final ImageView mapView;

  @NonNull
  public final TextView message;

  @NonNull
  public final TextView tvDate;

  private WhizzchatItemChatRtlBinding(@NonNull RelativeLayout rootView,
      @NonNull RelativeLayout bubbleLayoutParent, @NonNull LinearLayout chatBubble,
      @NonNull TextView fileDate, @NonNull TextView fileName, @NonNull LinearLayout filesLayout,
      @NonNull TextView imageDate, @NonNull LinearLayout imageInner,
      @NonNull LinearLayout imageLayout, @NonNull TextView mapDate, @NonNull LinearLayout mapLayout,
      @NonNull ImageView mapView, @NonNull TextView message, @NonNull TextView tvDate) {
    this.rootView = rootView;
    this.bubbleLayoutParent = bubbleLayoutParent;
    this.chatBubble = chatBubble;
    this.fileDate = fileDate;
    this.fileName = fileName;
    this.filesLayout = filesLayout;
    this.imageDate = imageDate;
    this.imageInner = imageInner;
    this.imageLayout = imageLayout;
    this.mapDate = mapDate;
    this.mapLayout = mapLayout;
    this.mapView = mapView;
    this.message = message;
    this.tvDate = tvDate;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static WhizzchatItemChatRtlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static WhizzchatItemChatRtlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.whizzchat_item_chat_rtl, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static WhizzchatItemChatRtlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      RelativeLayout bubbleLayoutParent = (RelativeLayout) rootView;

      id = R.id.chat_bubble;
      LinearLayout chatBubble = ViewBindings.findChildViewById(rootView, id);
      if (chatBubble == null) {
        break missingId;
      }

      id = R.id.fileDate;
      TextView fileDate = ViewBindings.findChildViewById(rootView, id);
      if (fileDate == null) {
        break missingId;
      }

      id = R.id.fileName;
      TextView fileName = ViewBindings.findChildViewById(rootView, id);
      if (fileName == null) {
        break missingId;
      }

      id = R.id.filesLayout;
      LinearLayout filesLayout = ViewBindings.findChildViewById(rootView, id);
      if (filesLayout == null) {
        break missingId;
      }

      id = R.id.imageDate;
      TextView imageDate = ViewBindings.findChildViewById(rootView, id);
      if (imageDate == null) {
        break missingId;
      }

      id = R.id.imageInner;
      LinearLayout imageInner = ViewBindings.findChildViewById(rootView, id);
      if (imageInner == null) {
        break missingId;
      }

      id = R.id.imageLayout;
      LinearLayout imageLayout = ViewBindings.findChildViewById(rootView, id);
      if (imageLayout == null) {
        break missingId;
      }

      id = R.id.mapDate;
      TextView mapDate = ViewBindings.findChildViewById(rootView, id);
      if (mapDate == null) {
        break missingId;
      }

      id = R.id.mapLayout;
      LinearLayout mapLayout = ViewBindings.findChildViewById(rootView, id);
      if (mapLayout == null) {
        break missingId;
      }

      id = R.id.map_view;
      ImageView mapView = ViewBindings.findChildViewById(rootView, id);
      if (mapView == null) {
        break missingId;
      }

      id = R.id.message;
      TextView message = ViewBindings.findChildViewById(rootView, id);
      if (message == null) {
        break missingId;
      }

      id = R.id.tv_date;
      TextView tvDate = ViewBindings.findChildViewById(rootView, id);
      if (tvDate == null) {
        break missingId;
      }

      return new WhizzchatItemChatRtlBinding((RelativeLayout) rootView, bubbleLayoutParent,
          chatBubble, fileDate, fileName, filesLayout, imageDate, imageInner, imageLayout, mapDate,
          mapLayout, mapView, message, tvDate);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
