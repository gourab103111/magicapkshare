// Generated by view binder compiler. Do not edit!
package com.scriptsbundle.adforest.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import cn.iwgang.countdownview.CountdownView;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.iarcuschin.simpleratingbar.SimpleRatingBar;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;
import com.scriptsbundle.adforest.R;
import com.smarteist.autoimageslider.SliderView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.sufficientlysecure.htmltextview.HtmlTextView;

public final class FragmentAdDetailBinding implements ViewBinding {
  @NonNull
  private final SwipeRefreshLayout rootView;

  @NonNull
  public final TextView addfav;

  @NonNull
  public final SliderView bannerSlider1;

  @NonNull
  public final TextView bidBtn;

  @NonNull
  public final TextView bidStatisticsBtn;

  @NonNull
  public final TextView btnMakeFeat;

  @NonNull
  public final CardView cardView2;

  @NonNull
  public final CardView cardView3;

  @NonNull
  public final CardView cardView4;

  @NonNull
  public final CardView cardViewRating;

  @NonNull
  public final CardView cardViewSeller;

  @NonNull
  public final CardView cardViewUserReport;

  @NonNull
  public final CardView cardmain;

  @NonNull
  public final ImageView contactSellerMessageIcon;

  @NonNull
  public final CountdownView countDown;

  @NonNull
  public final LinearLayout customLayout1;

  @NonNull
  public final TextView date;

  @NonNull
  public final TextView editAdd;

  @NonNull
  public final TextView featuredText;

  @NonNull
  public final HtmlTextView htmlText;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final ImageView imageView4;

  @NonNull
  public final ImageView imageViewSeller;

  @NonNull
  public final LinearLayout lastrow;

  @NonNull
  public final LinearLayout linear;

  @NonNull
  public final LinearLayout linearLayout1;

  @NonNull
  public final LinearLayout linearLayout5;

  @NonNull
  public final LinearLayout linearLayoutCardView2;

  @NonNull
  public final LinearLayout linearLayoutCardViewSeller;

  @NonNull
  public final LinearLayout linearLayoutCardViewUserReport;

  @NonNull
  public final LinearLayout linearLayoutSubmitRating;

  @NonNull
  public final LinearLayout ll1;

  @NonNull
  public final LinearLayout ll11;

  @NonNull
  public final LinearLayout ll1inner;

  @NonNull
  public final LinearLayout ll1innerLocation;

  @NonNull
  public final RelativeLayout llli;

  @NonNull
  public final TextView location;

  @NonNull
  public final TextView loginTime;

  @NonNull
  public final TextView noCurrentRatingText;

  @NonNull
  public final TextView numberOfRate;

  @NonNull
  public final TextView prices;

  @NonNull
  public final RatingBar ratingBar;

  @NonNull
  public final TextView ratingButton;

  @NonNull
  public final EditText ratingEditText;

  @NonNull
  public final LinearLayout ratingLoadLayout;

  @NonNull
  public final TextView ratingLoadMoreButton;

  @NonNull
  public final TextView ratingNotEdit;

  @NonNull
  public final RecyclerView ratingRecylerView;

  @NonNull
  public final TextView ratingTitle;

  @NonNull
  public final SimpleRatingBar ratingbarAds;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final RelativeLayout relMakeFeature;

  @NonNull
  public final TextView relMakeFeatureTV;

  @NonNull
  public final TextView relatedText;

  @NonNull
  public final TextView report;

  @NonNull
  public final TextView reportUserTextView;

  @NonNull
  public final NestedScrollView scrollViewUp;

  @NonNull
  public final TextView sectionTitleRating;

  @NonNull
  public final TextView share;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout3;

  @NonNull
  public final LinearLayout shimmerMain;

  @NonNull
  public final TextView subHeadingSeller;

  @NonNull
  public final SwipeRefreshLayout swipeRefreshLayout;

  @NonNull
  public final TextView textView10;

  @NonNull
  public final TextView textView11;

  @NonNull
  public final TextView textView12;

  @NonNull
  public final TextView textView13;

  @NonNull
  public final TextView textView19;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView8;

  @NonNull
  public final TextView textView9;

  @NonNull
  public final TextView textViewName;

  @NonNull
  public final TextView textViewName1;

  @NonNull
  public final TextView textViewNameSeller;

  @NonNull
  public final TextView textViewTitle;

  @NonNull
  public final TextView tvAdType;

  @NonNull
  public final TextView tvBlockUser;

  @NonNull
  public final TextView verified;

  @NonNull
  public final TextView views;

  @NonNull
  public final View viw;

  @NonNull
  public final YouTubePlayerView youtubeView;

  private FragmentAdDetailBinding(@NonNull SwipeRefreshLayout rootView, @NonNull TextView addfav,
      @NonNull SliderView bannerSlider1, @NonNull TextView bidBtn,
      @NonNull TextView bidStatisticsBtn, @NonNull TextView btnMakeFeat,
      @NonNull CardView cardView2, @NonNull CardView cardView3, @NonNull CardView cardView4,
      @NonNull CardView cardViewRating, @NonNull CardView cardViewSeller,
      @NonNull CardView cardViewUserReport, @NonNull CardView cardmain,
      @NonNull ImageView contactSellerMessageIcon, @NonNull CountdownView countDown,
      @NonNull LinearLayout customLayout1, @NonNull TextView date, @NonNull TextView editAdd,
      @NonNull TextView featuredText, @NonNull HtmlTextView htmlText, @NonNull ImageView imageView,
      @NonNull ImageView imageView4, @NonNull ImageView imageViewSeller,
      @NonNull LinearLayout lastrow, @NonNull LinearLayout linear,
      @NonNull LinearLayout linearLayout1, @NonNull LinearLayout linearLayout5,
      @NonNull LinearLayout linearLayoutCardView2, @NonNull LinearLayout linearLayoutCardViewSeller,
      @NonNull LinearLayout linearLayoutCardViewUserReport,
      @NonNull LinearLayout linearLayoutSubmitRating, @NonNull LinearLayout ll1,
      @NonNull LinearLayout ll11, @NonNull LinearLayout ll1inner,
      @NonNull LinearLayout ll1innerLocation, @NonNull RelativeLayout llli,
      @NonNull TextView location, @NonNull TextView loginTime,
      @NonNull TextView noCurrentRatingText, @NonNull TextView numberOfRate,
      @NonNull TextView prices, @NonNull RatingBar ratingBar, @NonNull TextView ratingButton,
      @NonNull EditText ratingEditText, @NonNull LinearLayout ratingLoadLayout,
      @NonNull TextView ratingLoadMoreButton, @NonNull TextView ratingNotEdit,
      @NonNull RecyclerView ratingRecylerView, @NonNull TextView ratingTitle,
      @NonNull SimpleRatingBar ratingbarAds, @NonNull RecyclerView recyclerView,
      @NonNull RelativeLayout relMakeFeature, @NonNull TextView relMakeFeatureTV,
      @NonNull TextView relatedText, @NonNull TextView report, @NonNull TextView reportUserTextView,
      @NonNull NestedScrollView scrollViewUp, @NonNull TextView sectionTitleRating,
      @NonNull TextView share, @NonNull ShimmerFrameLayout shimmerFrameLayout3,
      @NonNull LinearLayout shimmerMain, @NonNull TextView subHeadingSeller,
      @NonNull SwipeRefreshLayout swipeRefreshLayout, @NonNull TextView textView10,
      @NonNull TextView textView11, @NonNull TextView textView12, @NonNull TextView textView13,
      @NonNull TextView textView19, @NonNull TextView textView20, @NonNull TextView textView8,
      @NonNull TextView textView9, @NonNull TextView textViewName, @NonNull TextView textViewName1,
      @NonNull TextView textViewNameSeller, @NonNull TextView textViewTitle,
      @NonNull TextView tvAdType, @NonNull TextView tvBlockUser, @NonNull TextView verified,
      @NonNull TextView views, @NonNull View viw, @NonNull YouTubePlayerView youtubeView) {
    this.rootView = rootView;
    this.addfav = addfav;
    this.bannerSlider1 = bannerSlider1;
    this.bidBtn = bidBtn;
    this.bidStatisticsBtn = bidStatisticsBtn;
    this.btnMakeFeat = btnMakeFeat;
    this.cardView2 = cardView2;
    this.cardView3 = cardView3;
    this.cardView4 = cardView4;
    this.cardViewRating = cardViewRating;
    this.cardViewSeller = cardViewSeller;
    this.cardViewUserReport = cardViewUserReport;
    this.cardmain = cardmain;
    this.contactSellerMessageIcon = contactSellerMessageIcon;
    this.countDown = countDown;
    this.customLayout1 = customLayout1;
    this.date = date;
    this.editAdd = editAdd;
    this.featuredText = featuredText;
    this.htmlText = htmlText;
    this.imageView = imageView;
    this.imageView4 = imageView4;
    this.imageViewSeller = imageViewSeller;
    this.lastrow = lastrow;
    this.linear = linear;
    this.linearLayout1 = linearLayout1;
    this.linearLayout5 = linearLayout5;
    this.linearLayoutCardView2 = linearLayoutCardView2;
    this.linearLayoutCardViewSeller = linearLayoutCardViewSeller;
    this.linearLayoutCardViewUserReport = linearLayoutCardViewUserReport;
    this.linearLayoutSubmitRating = linearLayoutSubmitRating;
    this.ll1 = ll1;
    this.ll11 = ll11;
    this.ll1inner = ll1inner;
    this.ll1innerLocation = ll1innerLocation;
    this.llli = llli;
    this.location = location;
    this.loginTime = loginTime;
    this.noCurrentRatingText = noCurrentRatingText;
    this.numberOfRate = numberOfRate;
    this.prices = prices;
    this.ratingBar = ratingBar;
    this.ratingButton = ratingButton;
    this.ratingEditText = ratingEditText;
    this.ratingLoadLayout = ratingLoadLayout;
    this.ratingLoadMoreButton = ratingLoadMoreButton;
    this.ratingNotEdit = ratingNotEdit;
    this.ratingRecylerView = ratingRecylerView;
    this.ratingTitle = ratingTitle;
    this.ratingbarAds = ratingbarAds;
    this.recyclerView = recyclerView;
    this.relMakeFeature = relMakeFeature;
    this.relMakeFeatureTV = relMakeFeatureTV;
    this.relatedText = relatedText;
    this.report = report;
    this.reportUserTextView = reportUserTextView;
    this.scrollViewUp = scrollViewUp;
    this.sectionTitleRating = sectionTitleRating;
    this.share = share;
    this.shimmerFrameLayout3 = shimmerFrameLayout3;
    this.shimmerMain = shimmerMain;
    this.subHeadingSeller = subHeadingSeller;
    this.swipeRefreshLayout = swipeRefreshLayout;
    this.textView10 = textView10;
    this.textView11 = textView11;
    this.textView12 = textView12;
    this.textView13 = textView13;
    this.textView19 = textView19;
    this.textView20 = textView20;
    this.textView8 = textView8;
    this.textView9 = textView9;
    this.textViewName = textViewName;
    this.textViewName1 = textViewName1;
    this.textViewNameSeller = textViewNameSeller;
    this.textViewTitle = textViewTitle;
    this.tvAdType = tvAdType;
    this.tvBlockUser = tvBlockUser;
    this.verified = verified;
    this.views = views;
    this.viw = viw;
    this.youtubeView = youtubeView;
  }

  @Override
  @NonNull
  public SwipeRefreshLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAdDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAdDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_ad_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAdDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addfav;
      TextView addfav = ViewBindings.findChildViewById(rootView, id);
      if (addfav == null) {
        break missingId;
      }

      id = R.id.banner_slider1;
      SliderView bannerSlider1 = ViewBindings.findChildViewById(rootView, id);
      if (bannerSlider1 == null) {
        break missingId;
      }

      id = R.id.bidBtn;
      TextView bidBtn = ViewBindings.findChildViewById(rootView, id);
      if (bidBtn == null) {
        break missingId;
      }

      id = R.id.bidStatisticsBtn;
      TextView bidStatisticsBtn = ViewBindings.findChildViewById(rootView, id);
      if (bidStatisticsBtn == null) {
        break missingId;
      }

      id = R.id.btnMakeFeat;
      TextView btnMakeFeat = ViewBindings.findChildViewById(rootView, id);
      if (btnMakeFeat == null) {
        break missingId;
      }

      id = R.id.cardView2;
      CardView cardView2 = ViewBindings.findChildViewById(rootView, id);
      if (cardView2 == null) {
        break missingId;
      }

      id = R.id.card_view3;
      CardView cardView3 = ViewBindings.findChildViewById(rootView, id);
      if (cardView3 == null) {
        break missingId;
      }

      id = R.id.card_view4;
      CardView cardView4 = ViewBindings.findChildViewById(rootView, id);
      if (cardView4 == null) {
        break missingId;
      }

      id = R.id.card_viewRating;
      CardView cardViewRating = ViewBindings.findChildViewById(rootView, id);
      if (cardViewRating == null) {
        break missingId;
      }

      id = R.id.card_view_seller;
      CardView cardViewSeller = ViewBindings.findChildViewById(rootView, id);
      if (cardViewSeller == null) {
        break missingId;
      }

      id = R.id.card_view_user_report;
      CardView cardViewUserReport = ViewBindings.findChildViewById(rootView, id);
      if (cardViewUserReport == null) {
        break missingId;
      }

      id = R.id.cardmain;
      CardView cardmain = ViewBindings.findChildViewById(rootView, id);
      if (cardmain == null) {
        break missingId;
      }

      id = R.id.contact_seller_MessageIcon;
      ImageView contactSellerMessageIcon = ViewBindings.findChildViewById(rootView, id);
      if (contactSellerMessageIcon == null) {
        break missingId;
      }

      id = R.id.countDown;
      CountdownView countDown = ViewBindings.findChildViewById(rootView, id);
      if (countDown == null) {
        break missingId;
      }

      id = R.id.customLayout1;
      LinearLayout customLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (customLayout1 == null) {
        break missingId;
      }

      id = R.id.date;
      TextView date = ViewBindings.findChildViewById(rootView, id);
      if (date == null) {
        break missingId;
      }

      id = R.id.editAdd;
      TextView editAdd = ViewBindings.findChildViewById(rootView, id);
      if (editAdd == null) {
        break missingId;
      }

      id = R.id.featuredText;
      TextView featuredText = ViewBindings.findChildViewById(rootView, id);
      if (featuredText == null) {
        break missingId;
      }

      id = R.id.html_text;
      HtmlTextView htmlText = ViewBindings.findChildViewById(rootView, id);
      if (htmlText == null) {
        break missingId;
      }

      id = R.id.image_view;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.imageView4;
      ImageView imageView4 = ViewBindings.findChildViewById(rootView, id);
      if (imageView4 == null) {
        break missingId;
      }

      id = R.id.image_view_Seller;
      ImageView imageViewSeller = ViewBindings.findChildViewById(rootView, id);
      if (imageViewSeller == null) {
        break missingId;
      }

      id = R.id.lastrow;
      LinearLayout lastrow = ViewBindings.findChildViewById(rootView, id);
      if (lastrow == null) {
        break missingId;
      }

      id = R.id.linear;
      LinearLayout linear = ViewBindings.findChildViewById(rootView, id);
      if (linear == null) {
        break missingId;
      }

      id = R.id.linearLayout1;
      LinearLayout linearLayout1 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout1 == null) {
        break missingId;
      }

      id = R.id.linearLayout5;
      LinearLayout linearLayout5 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout5 == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view2;
      LinearLayout linearLayoutCardView2 = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardView2 == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view_seller;
      LinearLayout linearLayoutCardViewSeller = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardViewSeller == null) {
        break missingId;
      }

      id = R.id.linear_layout_card_view_user_report;
      LinearLayout linearLayoutCardViewUserReport = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutCardViewUserReport == null) {
        break missingId;
      }

      id = R.id.linearLayoutSubmitRating;
      LinearLayout linearLayoutSubmitRating = ViewBindings.findChildViewById(rootView, id);
      if (linearLayoutSubmitRating == null) {
        break missingId;
      }

      id = R.id.ll1;
      LinearLayout ll1 = ViewBindings.findChildViewById(rootView, id);
      if (ll1 == null) {
        break missingId;
      }

      id = R.id.ll11;
      LinearLayout ll11 = ViewBindings.findChildViewById(rootView, id);
      if (ll11 == null) {
        break missingId;
      }

      id = R.id.ll1inner;
      LinearLayout ll1inner = ViewBindings.findChildViewById(rootView, id);
      if (ll1inner == null) {
        break missingId;
      }

      id = R.id.ll1inner_location;
      LinearLayout ll1innerLocation = ViewBindings.findChildViewById(rootView, id);
      if (ll1innerLocation == null) {
        break missingId;
      }

      id = R.id.llli;
      RelativeLayout llli = ViewBindings.findChildViewById(rootView, id);
      if (llli == null) {
        break missingId;
      }

      id = R.id.location;
      TextView location = ViewBindings.findChildViewById(rootView, id);
      if (location == null) {
        break missingId;
      }

      id = R.id.loginTime;
      TextView loginTime = ViewBindings.findChildViewById(rootView, id);
      if (loginTime == null) {
        break missingId;
      }

      id = R.id.noCurrentRatingText;
      TextView noCurrentRatingText = ViewBindings.findChildViewById(rootView, id);
      if (noCurrentRatingText == null) {
        break missingId;
      }

      id = R.id.numberOfRate;
      TextView numberOfRate = ViewBindings.findChildViewById(rootView, id);
      if (numberOfRate == null) {
        break missingId;
      }

      id = R.id.prices;
      TextView prices = ViewBindings.findChildViewById(rootView, id);
      if (prices == null) {
        break missingId;
      }

      id = R.id.ratingBar;
      RatingBar ratingBar = ViewBindings.findChildViewById(rootView, id);
      if (ratingBar == null) {
        break missingId;
      }

      id = R.id.rating_button;
      TextView ratingButton = ViewBindings.findChildViewById(rootView, id);
      if (ratingButton == null) {
        break missingId;
      }

      id = R.id.ratingEditText;
      EditText ratingEditText = ViewBindings.findChildViewById(rootView, id);
      if (ratingEditText == null) {
        break missingId;
      }

      id = R.id.ratingLoadLayout;
      LinearLayout ratingLoadLayout = ViewBindings.findChildViewById(rootView, id);
      if (ratingLoadLayout == null) {
        break missingId;
      }

      id = R.id.ratingLoadMoreButton;
      TextView ratingLoadMoreButton = ViewBindings.findChildViewById(rootView, id);
      if (ratingLoadMoreButton == null) {
        break missingId;
      }

      id = R.id.ratingNotEdit;
      TextView ratingNotEdit = ViewBindings.findChildViewById(rootView, id);
      if (ratingNotEdit == null) {
        break missingId;
      }

      id = R.id.ratingRecylerView;
      RecyclerView ratingRecylerView = ViewBindings.findChildViewById(rootView, id);
      if (ratingRecylerView == null) {
        break missingId;
      }

      id = R.id.ratingTitle;
      TextView ratingTitle = ViewBindings.findChildViewById(rootView, id);
      if (ratingTitle == null) {
        break missingId;
      }

      id = R.id.ratingbarAds;
      SimpleRatingBar ratingbarAds = ViewBindings.findChildViewById(rootView, id);
      if (ratingbarAds == null) {
        break missingId;
      }

      id = R.id.recycler_view;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.relMakeFeature;
      RelativeLayout relMakeFeature = ViewBindings.findChildViewById(rootView, id);
      if (relMakeFeature == null) {
        break missingId;
      }

      id = R.id.relMakeFeatureTV;
      TextView relMakeFeatureTV = ViewBindings.findChildViewById(rootView, id);
      if (relMakeFeatureTV == null) {
        break missingId;
      }

      id = R.id.relatedText;
      TextView relatedText = ViewBindings.findChildViewById(rootView, id);
      if (relatedText == null) {
        break missingId;
      }

      id = R.id.report;
      TextView report = ViewBindings.findChildViewById(rootView, id);
      if (report == null) {
        break missingId;
      }

      id = R.id.report_user_text_view;
      TextView reportUserTextView = ViewBindings.findChildViewById(rootView, id);
      if (reportUserTextView == null) {
        break missingId;
      }

      id = R.id.scrollViewUp;
      NestedScrollView scrollViewUp = ViewBindings.findChildViewById(rootView, id);
      if (scrollViewUp == null) {
        break missingId;
      }

      id = R.id.sectionTitleRating;
      TextView sectionTitleRating = ViewBindings.findChildViewById(rootView, id);
      if (sectionTitleRating == null) {
        break missingId;
      }

      id = R.id.share;
      TextView share = ViewBindings.findChildViewById(rootView, id);
      if (share == null) {
        break missingId;
      }

      id = R.id.shimmerFrameLayout3;
      ShimmerFrameLayout shimmerFrameLayout3 = ViewBindings.findChildViewById(rootView, id);
      if (shimmerFrameLayout3 == null) {
        break missingId;
      }

      id = R.id.shimmerMain;
      LinearLayout shimmerMain = ViewBindings.findChildViewById(rootView, id);
      if (shimmerMain == null) {
        break missingId;
      }

      id = R.id.subHeading_Seller;
      TextView subHeadingSeller = ViewBindings.findChildViewById(rootView, id);
      if (subHeadingSeller == null) {
        break missingId;
      }

      SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) rootView;

      id = R.id.textView10;
      TextView textView10 = ViewBindings.findChildViewById(rootView, id);
      if (textView10 == null) {
        break missingId;
      }

      id = R.id.textView11;
      TextView textView11 = ViewBindings.findChildViewById(rootView, id);
      if (textView11 == null) {
        break missingId;
      }

      id = R.id.textView12;
      TextView textView12 = ViewBindings.findChildViewById(rootView, id);
      if (textView12 == null) {
        break missingId;
      }

      id = R.id.textView13;
      TextView textView13 = ViewBindings.findChildViewById(rootView, id);
      if (textView13 == null) {
        break missingId;
      }

      id = R.id.textView19;
      TextView textView19 = ViewBindings.findChildViewById(rootView, id);
      if (textView19 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView8;
      TextView textView8 = ViewBindings.findChildViewById(rootView, id);
      if (textView8 == null) {
        break missingId;
      }

      id = R.id.textView9;
      TextView textView9 = ViewBindings.findChildViewById(rootView, id);
      if (textView9 == null) {
        break missingId;
      }

      id = R.id.text_view_name;
      TextView textViewName = ViewBindings.findChildViewById(rootView, id);
      if (textViewName == null) {
        break missingId;
      }

      id = R.id.text_viewName;
      TextView textViewName1 = ViewBindings.findChildViewById(rootView, id);
      if (textViewName1 == null) {
        break missingId;
      }

      id = R.id.text_viewName_Seller;
      TextView textViewNameSeller = ViewBindings.findChildViewById(rootView, id);
      if (textViewNameSeller == null) {
        break missingId;
      }

      id = R.id.text_view_title;
      TextView textViewTitle = ViewBindings.findChildViewById(rootView, id);
      if (textViewTitle == null) {
        break missingId;
      }

      id = R.id.tv_adType;
      TextView tvAdType = ViewBindings.findChildViewById(rootView, id);
      if (tvAdType == null) {
        break missingId;
      }

      id = R.id.tv_block_user;
      TextView tvBlockUser = ViewBindings.findChildViewById(rootView, id);
      if (tvBlockUser == null) {
        break missingId;
      }

      id = R.id.verified;
      TextView verified = ViewBindings.findChildViewById(rootView, id);
      if (verified == null) {
        break missingId;
      }

      id = R.id.views;
      TextView views = ViewBindings.findChildViewById(rootView, id);
      if (views == null) {
        break missingId;
      }

      id = R.id.viw;
      View viw = ViewBindings.findChildViewById(rootView, id);
      if (viw == null) {
        break missingId;
      }

      id = R.id.youtube_view;
      YouTubePlayerView youtubeView = ViewBindings.findChildViewById(rootView, id);
      if (youtubeView == null) {
        break missingId;
      }

      return new FragmentAdDetailBinding((SwipeRefreshLayout) rootView, addfav, bannerSlider1,
          bidBtn, bidStatisticsBtn, btnMakeFeat, cardView2, cardView3, cardView4, cardViewRating,
          cardViewSeller, cardViewUserReport, cardmain, contactSellerMessageIcon, countDown,
          customLayout1, date, editAdd, featuredText, htmlText, imageView, imageView4,
          imageViewSeller, lastrow, linear, linearLayout1, linearLayout5, linearLayoutCardView2,
          linearLayoutCardViewSeller, linearLayoutCardViewUserReport, linearLayoutSubmitRating, ll1,
          ll11, ll1inner, ll1innerLocation, llli, location, loginTime, noCurrentRatingText,
          numberOfRate, prices, ratingBar, ratingButton, ratingEditText, ratingLoadLayout,
          ratingLoadMoreButton, ratingNotEdit, ratingRecylerView, ratingTitle, ratingbarAds,
          recyclerView, relMakeFeature, relMakeFeatureTV, relatedText, report, reportUserTextView,
          scrollViewUp, sectionTitleRating, share, shimmerFrameLayout3, shimmerMain,
          subHeadingSeller, swipeRefreshLayout, textView10, textView11, textView12, textView13,
          textView19, textView20, textView8, textView9, textViewName, textViewName1,
          textViewNameSeller, textViewTitle, tvAdType, tvBlockUser, verified, views, viw,
          youtubeView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}