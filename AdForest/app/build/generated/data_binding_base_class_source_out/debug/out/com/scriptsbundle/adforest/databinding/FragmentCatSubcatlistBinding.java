// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.scriptsbundle.adforest.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCatSubcatlistBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final LinearLayout filterLayout;

  @NonNull
  public final RelativeLayout main;

  @NonNull
  public final ProgressBar progressBar2;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RecyclerView recyclerView2;

  @NonNull
  public final RelativeLayout rel1;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final Spinner spinner;

  @NonNull
  public final TextView textView6;

  @NonNull
  public final TextView textViewFilter;

  private FragmentCatSubcatlistBinding(@NonNull NestedScrollView rootView,
      @NonNull LinearLayout filterLayout, @NonNull RelativeLayout main,
      @NonNull ProgressBar progressBar2, @NonNull RecyclerView recyclerView,
      @NonNull RecyclerView recyclerView2, @NonNull RelativeLayout rel1,
      @NonNull NestedScrollView scrollView, @NonNull ShimmerFrameLayout shimmerFrameLayout,
      @NonNull LinearLayout shimmerMain, @NonNull Spinner spinner, @NonNull TextView textView6,
      @NonNull TextView textViewFilter) {
    this.rootView = rootView;
    this.filterLayout = filterLayout;
    this.main = main;
    this.progressBar2 = progressBar2;
    this.recyclerView = recyclerView;
    this.recyclerView2 = recyclerView2;
    this.rel1 = rel1;
    this.scrollView = scrollView;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.shimmerMain = shimmerMain;
    this.spinner = spinner;
    this.textView6 = textView6;
    this.textViewFilter = textViewFilter;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCatSubcatlistBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCatSubcatlistBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cat_subcatlist, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCatSubcatlistBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filter_layout;
      LinearLayout filterLayout = ViewBindings.findChildViewById(rootView, id);
      if (filterLayout == null) {
        break missingId;
      }

      id = R.id.main;
      RelativeLayout main = ViewBindings.findChildViewById(rootView, id);
      if (main == null) {
        break missingId;
      }

      id = R.id.progressBar2;
      ProgressBar progressBar2 = ViewBindings.findChildViewById(rootView, id);
      if (progressBar2 == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.recycler_view2;
      RecyclerView recyclerView2 = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView2 == null) {
        break missingId;
      }

      id = R.id.rel1;
      RelativeLayout rel1 = ViewBindings.findChildViewById(rootView, id);
      if (rel1 == null) {
        break missingId;
      }

      NestedScrollView scrollView = (NestedScrollView) rootView;

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

      id = R.id.textView6;
      TextView textView6 = ViewBindings.findChildViewById(rootView, id);
      if (textView6 == null) {
        break missingId;
      }

      id = R.id.textViewFilter;
      TextView textViewFilter = ViewBindings.findChildViewById(rootView, id);
      if (textViewFilter == null) {
        break missingId;
      }

      return new FragmentCatSubcatlistBinding((NestedScrollView) rootView, filterLayout, main,
          progressBar2, recyclerView, recyclerView2, rel1, scrollView, shimmerFrameLayout,
          shimmerMain, spinner, textView6, textViewFilter);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}