package com.scriptsbundle.adforest.home;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import com.scriptsbundle.adforest.R;
import com.scriptsbundle.adforest.helper.DataCallback;
import com.scriptsbundle.adforest.helper.OnItemClickListener;
import com.scriptsbundle.adforest.home.adapter.ItemMainAllLocationPoPUpHome;
import com.scriptsbundle.adforest.modelsList.homeCatListModel;
import com.scriptsbundle.adforest.utills.Network.RestService;
import com.scriptsbundle.adforest.utills.SettingsMain;
import com.scriptsbundle.adforest.utills.UrlController;
import timber.log.Timber;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAllLocationsPopUpHome extends DialogFragment {

    RecyclerView locationRecycler_view;
    ItemMainAllLocationPoPUpHome ItemMainAllLocationPoPUpHome;
    ArrayList<homeCatListModel> locationAdscat = new ArrayList<>();
    SettingsMain settingsMain;
    RestService restService;

    public JSONObject pagination;
    Button btn_loadMore;
    String term_id = "";
    EditText searchView;
    private Context context;
    RelativeLayout mainRelative;
    private DataCallback dataCallback;

    public FragmentAllLocationsPopUpHome() {
        // Required empty public constructor
    }

    public static FragmentAllLocationsPopUpHome newInstance() {
        return new FragmentAllLocationsPopUpHome();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_all_locations, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        context = getContext();
        settingsMain = new SettingsMain(context);
        mainRelative = view.findViewById(R.id.mainRelative);
        locationRecycler_view = view.findViewById(R.id.locationRecycler_view);
        searchView = view.findViewById(R.id.mSearch);
        searchView.requestFocus();

        locationRecycler_view.setHasFixedSize(true);
        locationRecycler_view.setNestedScrollingEnabled(false);
        ViewCompat.setNestedScrollingEnabled(locationRecycler_view, false);
        GridLayoutManager MyLayoutManager = new GridLayoutManager(context, 1);
        MyLayoutManager.setOrientation(RecyclerView.VERTICAL);
        locationRecycler_view.setLayoutManager(MyLayoutManager);

        SwipeRefreshLayout swipeRefreshLayout = getActivity().findViewById(R.id.swipe_refresh_layout);
        swipeRefreshLayout.setEnabled(true);

        if (settingsMain.getAppOpen()) {
            restService = UrlController.createService(RestService.class, context);
        } else
            restService = UrlController.createService(RestService.class, settingsMain.getUserEmail(), settingsMain.getUserPassword(), getActivity());

        Bundle args = getArguments();
        if (args != null) {
            String jsonArrayString = args.getString("locationjsonArray");
            try {
                JSONArray jsonArray = new JSONArray(jsonArrayString);
                // Use the jsonArray as needed
                Log.d("jsonchamp", jsonArrayString);
                adforest_setAllLocationAds(jsonArray);
                mainRelative.setVisibility(View.VISIBLE);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        searchView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (ItemMainAllLocationPoPUpHome != null) {
                    ItemMainAllLocationPoPUpHome.getFilter().filter(searchView.getText().toString());
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }


    private void adforest_setAllLocationAds(JSONArray jsonArray) {

        locationAdscat.clear();
        for (int i = 0; i < jsonArray.length(); i++) {
            homeCatListModel item = new homeCatListModel();
            try {
                item.setTitle(jsonArray.optJSONObject(i).getString("name"));
                item.setThumbnail(jsonArray.optJSONObject(i).getString("img"));
                item.setId(jsonArray.optJSONObject(i).getString("cat_id"));
                item.setAdsCount(jsonArray.getJSONObject(i).getString("count"));
            } catch (JSONException e) {
                e.printStackTrace();
            }

            locationAdscat.add(item);
        }

        ItemMainAllLocationPoPUpHome = new ItemMainAllLocationPoPUpHome(context, locationAdscat, 2);
        locationRecycler_view.setAdapter(ItemMainAllLocationPoPUpHome);
        ItemMainAllLocationPoPUpHome.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(homeCatListModel item) {

                searchView.setText("");
                Intent intent = new Intent(getContext(), HomeActivity.class);
                intent.putExtra("location_id", item.getId());
                intent.putExtra("location_name", item.getTitle());
//                startActivityForResult(intent, 1);
                closeDialog(intent);
            }

        });

    }

    // Set the data callback
    public void setDataCallback(DataCallback callback) {
        this.dataCallback = callback;
    }

    // Method to close/dismiss the DialogFragment and pass the data back
    public void closeDialog(Intent data) {
        if (dataCallback != null) {
            dataCallback.onDataReceived(data);
        }
        dismiss();
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1) {
            if (data != null) {
                Toast.makeText(context, data.toString(), Toast.LENGTH_SHORT).show();
            }

        }
    }

    @Override
    public void onStop() {
        Timber.w("App stopped");

        super.onStop();
    }

    @Override
    public void onDestroy() {
        Timber.w("App destroyed");

        super.onDestroy();
    }
}
