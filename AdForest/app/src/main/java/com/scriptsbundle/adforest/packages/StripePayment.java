package com.scriptsbundle.adforest.packages;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonObject;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.paymentsheet.PaymentSheet;
import com.stripe.android.paymentsheet.PaymentSheetResult;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.scriptsbundle.adforest.R;
import com.scriptsbundle.adforest.utills.AnalyticsTrackers;
import com.scriptsbundle.adforest.utills.Network.RestService;
import com.scriptsbundle.adforest.utills.SettingsMain;
import com.scriptsbundle.adforest.utills.UrlController;

public class StripePayment extends AppCompatActivity {

    SettingsMain settingsMain;

    EditText cardNumber, cvc;
    Spinner monthSpinner, yearSpinner;
    Button chkout;
    String cvcNo, cardNo;
    int month, year;
    TextView textViewCardNo, textViewExpTit, textViewMonth, textViewYear, textViewCVC;

    String stringCardError, stringExpiryError, stringCVCError, stringInvalidCard,amount,currency;
    RestService restService;
    String packageType;
    PackagesFragment packagesFragment;
    private String PUBLISHABLE_KEY;  //pk_live_tkSrJzIUzdR9sDx7rLINyGHI //pk_test_07HcOQstgKo91LWCA2rd1a13
    private String id = "";
    Button payBtn;
    String SecretKey = "";
    String customerID;
    String EphericalKeyD;
    String ClientSecret;
    PaymentSheet paymentSheet;
    String startString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stripe_payment);

        settingsMain = new SettingsMain(this);

        PUBLISHABLE_KEY = settingsMain.getKey("stripeKey");
        SecretKey = settingsMain.getStripeSKey("stripe_SKey");
        if (!getIntent().getStringExtra("id").equals("")) {
            id = getIntent().getStringExtra("id");
            packageType = getIntent().getStringExtra("packageType");
            amount = getIntent().getStringExtra("itemPrice");
        }
        currency = settingsMain.getStripeCurrencyKey("stripe_CKey");
        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(settingsMain.getMainColor()));
        }
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(settingsMain.getMainColor())));

        this.cardNumber = (EditText) findViewById(R.id.editText9);
        this.cvc = (EditText) findViewById(R.id.cvc);
        this.monthSpinner = (Spinner) findViewById(R.id.spinner);
        this.yearSpinner = (Spinner) findViewById(R.id.spinner2);
        this.chkout = (Button) findViewById(R.id.button4);

        this.textViewCardNo = (TextView) findViewById(R.id.textView23);
        this.textViewCVC = (TextView) findViewById(R.id.textView24);
        this.textViewExpTit = (TextView) findViewById(R.id.textView20);
        this.textViewMonth = (TextView) findViewById(R.id.textView21);
        this.textViewYear = (TextView) findViewById(R.id.textView22);
        packagesFragment = new PackagesFragment();


        chkout.setBackgroundColor(Color.parseColor(settingsMain.getMainColor()));
        restService = UrlController.createService(RestService.class, settingsMain.getUserEmail(), settingsMain.getUserPassword(), this);

        // get view from server
        adforest_getViews();
        PaymentConfiguration.init(this, PUBLISHABLE_KEY);
        paymentSheet = new PaymentSheet(this, paymentSheetResult -> {
            onPaymentResult(paymentSheetResult);
        });

        StringRequest request = new StringRequest(Request.Method.POST, "https://api.stripe.com/v1/customers",
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            customerID = jsonObject.getString("id");
                            getEmphericalKey();
                            Log.d("customerID",customerID);
                        } catch (JSONException e) {
                            Toast.makeText(StripePayment.this, e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
//                            throw new RuntimeException(e);
                        }

                    }
                }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> header = new HashMap<>();
                header.put("Authorization", "Bearer " + SecretKey);
                return header;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    //calling APi for geting views from server
    private void adforest_getViews() {

        if (SettingsMain.isConnectingToInternet(StripePayment.this)) {

            SettingsMain.showDilog(StripePayment.this);

            Log.d("info packageId", id);
            Call<ResponseBody> myCall = restService.getStripeDetailsView(UrlController.AddHeaders(this));
            myCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> responseObj) {
                    try {
                        if (responseObj.isSuccessful()) {
                            Log.d("info Stripe Responce", "" + responseObj.toString());

                            JSONObject response = new JSONObject(responseObj.body().string());
                            if (response.getBoolean("success")) {

                                Log.d("Info Stripe Data", "" + response.getJSONObject("data"));

                                JSONObject jsonObjectThis = response.getJSONObject("data").getJSONObject("form");
                                setTitle(response.getJSONObject("data").getString("page_title"));

                                stringCardError = response.getJSONObject("data").getJSONObject("error").getString("card_number");
                                stringExpiryError = response.getJSONObject("data").getJSONObject("error").getString("expiration_date");
                                stringCVCError = response.getJSONObject("data").getJSONObject("error").getString("invalid_cvc");
                                stringInvalidCard = response.getJSONObject("data").getJSONObject("error").getString("card_details");

                                cardNumber.setHint(jsonObjectThis.getString("card_input_text"));
                                cvc.setHint(jsonObjectThis.getString("cvc_input_text"));
                                chkout.setText(jsonObjectThis.getString("btn_text"));

                                textViewCardNo.setText(jsonObjectThis.getString("card_input_text"));
                                textViewExpTit.setText(jsonObjectThis.getString("select_title"));
                                textViewMonth.setText(jsonObjectThis.getString("select_month"));
                                textViewYear.setText(jsonObjectThis.getString("select_year"));
                                textViewCVC.setText(jsonObjectThis.getString("cvc_input_text"));

                                JSONArray jsonArray = jsonObjectThis.getJSONArray("select_option_year");

                                ArrayList<String> arrayList = new ArrayList<>();
                                //Iterate the jsonArray and print the info of JSONObjects
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    arrayList.add(jsonArray.getString(i));
                                }
                                ArrayAdapter<String> adapter = new ArrayAdapter<>(StripePayment.this,
                                        R.layout.spinner_item_medium, arrayList);

                                ArrayAdapter<String> adapter2 = new ArrayAdapter<>(StripePayment.this,
                                        R.layout.spinner_item_medium, StripePayment.this.getResources().getStringArray(R.array.month_array));
                                yearSpinner.setAdapter(adapter);
                                monthSpinner.setAdapter(adapter2);

                            } else {
                                Toast.makeText(StripePayment.this, response.get("message").toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                        SettingsMain.hideDilog();

                    } catch (JSONException e) {
                        SettingsMain.hideDilog();
                        e.printStackTrace();
                    } catch (IOException e) {
                        SettingsMain.hideDilog();
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    SettingsMain.hideDilog();
                    Log.d("info Send offers ", "error" + String.valueOf(t));
                    Log.d("info Send offers ", "error" + String.valueOf(t.getMessage() + t.getCause() + t.fillInStackTrace()));
                }
            });
        } else {
            SettingsMain.hideDilog();
            Toast.makeText(StripePayment.this, "Internet error", Toast.LENGTH_SHORT).show();
        }
    }

    private void adforest_Checkout(String id) {
        if (SettingsMain.isConnectingToInternet(StripePayment.this)) {
            SettingsMain.showDilog(StripePayment.this);

            JsonObject params = new JsonObject();
            params.addProperty("package_id", id);
            params.addProperty("payment_from", packageType);
            Log.d("info Send Checkout", params.toString());

            Call<ResponseBody> myCall = restService.postCheckout(params, UrlController.AddHeaders(this));
            myCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> responseObj) {
                    try {
                        if (responseObj.isSuccessful()) {
                            Log.d("info Checkout Resp", "" + responseObj.toString());

                            JSONObject response = new JSONObject(responseObj.body().string());
                            Log.d("info Checkout object", "" + response.toString());
                            if (response.getBoolean("success")) {
                                settingsMain.setPaymentCompletedMessage(response.get("message").toString());
                                adforest_getDataForThankYou();
                            } else
                                Toast.makeText(StripePayment.this, response.get("message").toString(), Toast.LENGTH_SHORT).show();

                        }
                        SettingsMain.hideDilog();
                    } catch (JSONException e) {
                        SettingsMain.hideDilog();
                        e.printStackTrace();
                    } catch (IOException e) {
                        SettingsMain.hideDilog();
                        e.printStackTrace();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    if (t instanceof TimeoutException) {
                        Toast.makeText(getApplicationContext(), settingsMain.getAlertDialogMessage("internetMessage"), Toast.LENGTH_SHORT).show();
                        settingsMain.hideDilog();
                    }
                    if (t instanceof SocketTimeoutException || t instanceof NullPointerException) {

                        Toast.makeText(getApplicationContext(), settingsMain.getAlertDialogMessage("internetMessage"), Toast.LENGTH_SHORT).show();
                        settingsMain.hideDilog();
                    }
                    if (t instanceof NullPointerException || t instanceof UnknownError || t instanceof NumberFormatException) {
                        Log.d("info Checkout ", "NullPointert Exception" + t.getLocalizedMessage());
                        settingsMain.hideDilog();
                    } else {
                        SettingsMain.hideDilog();
                        Log.d("info Checkout err", String.valueOf(t));
                        Log.d("info Checkout err", String.valueOf(t.getMessage() + t.getCause() + t.fillInStackTrace()));
                    }
                }
            });
        } else {
            SettingsMain.hideDilog();
            Toast.makeText(StripePayment.this, settingsMain.getAlertDialogTitle("error"), Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.left_enter, R.anim.right_out);
    }

    @Override
    public void onResume() {
        try {
            if (settingsMain.getAnalyticsShow() && !settingsMain.getAnalyticsId().equals(""))
                AnalyticsTrackers.getInstance().trackScreenView("Checkout Process");
            super.onResume();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    public void adforest_getDataForThankYou() {
        if (SettingsMain.isConnectingToInternet(StripePayment.this)) {
            Call<ResponseBody> myCall = restService.getPaymentCompleteData(UrlController.AddHeaders(StripePayment.this));
            myCall.enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> responseObj) {
                    try {
                        if (responseObj.isSuccessful()) {
                            Log.d("info ThankYou Details", "" + responseObj.toString());

                            JSONObject response = new JSONObject(responseObj.body().string());
                            if (response.getBoolean("success")) {
                                JSONObject responseData = response.getJSONObject("data");

                                Log.d("info ThankYou object", "" + response.getJSONObject("data"));

                                Intent intent = new Intent(StripePayment.this, Thankyou.class);
                                intent.putExtra("data", responseData.getString("data"));
                                intent.putExtra("order_thankyou_title", responseData.getString("order_thankyou_title"));
                                intent.putExtra("order_thankyou_btn", responseData.getString("order_thankyou_btn"));
                                startActivity(intent);
                                SettingsMain.hideDilog();
                                StripePayment.this.finish();
                            } else {
                                SettingsMain.hideDilog();
                                Toast.makeText(StripePayment.this, response.get("message").toString(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                        SettingsMain.hideDilog();
                    } catch (IOException e) {
                        e.printStackTrace();
                        SettingsMain.hideDilog();
                    }
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    SettingsMain.hideDilog();
                    Log.d("info ThankYou error", String.valueOf(t));
                    Log.d("info ThankYou error", String.valueOf(t.getMessage() + t.getCause() + t.fillInStackTrace()));
                }
            });
        } else {
            SettingsMain.hideDilog();
            Toast.makeText(StripePayment.this, "Internet error", Toast.LENGTH_SHORT).show();
        }
    }
    private void paymentFlow() {
        paymentSheet.presentWithPaymentIntent(ClientSecret, new PaymentSheet.Configuration("Learn with Charlie", new PaymentSheet.CustomerConfiguration(
                customerID,
                EphericalKeyD
        )));
    }

    private void onPaymentResult(PaymentSheetResult paymentSheetResult) {
        if (paymentSheetResult instanceof PaymentSheetResult.Completed) {
            adforest_Checkout(id);
            Toast.makeText(this, "Payment Success", Toast.LENGTH_SHORT).show();
        }
        if(paymentSheetResult instanceof  PaymentSheetResult.Canceled){
            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
            this.finish();
        }
        if(paymentSheetResult instanceof  PaymentSheetResult.Failed){
            Toast.makeText(this, ((PaymentSheetResult.Failed) paymentSheetResult).getError().toString(), Toast.LENGTH_SHORT).show();
            this.finish();
        }
    }

    private void getEmphericalKey() {
        StringRequest request = new StringRequest(Request.Method.POST, "https://api.stripe.com/v1/ephemeral_keys",
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            EphericalKeyD = jsonObject.getString("id");
                            getClientSecret(customerID, EphericalKeyD);
                            Log.d("EphericalKeyD",EphericalKeyD);
                        } catch (JSONException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> header = new HashMap<>();
                header.put("Authorization", "Bearer " + SecretKey);
                header.put("Stripe-Version", "2022-11-15");
                return header;
            }

            @Override
            public Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                params.put("customer", customerID);
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }

    private void getClientSecret(String customerId, String ephericalKeyD) {
        StringRequest request = new StringRequest(Request.Method.POST, "https://api.stripe.com/v1/payment_intents",
                new com.android.volley.Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            ClientSecret = jsonObject.getString("client_secret");
                            Log.d("ClientSecret",ClientSecret);
//                            Toast.makeText(getApplicationContext(), ClientSecret, Toast.LENGTH_SHORT).show();
                            paymentFlow();
                        } catch (JSONException e) {
                            Toast.makeText(getApplicationContext(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }

                    }
                }, new com.android.volley.Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
//                Log.d("error",error.getLocalizedMessage());
                Toast.makeText(getApplicationContext(), error.getLocalizedMessage(), Toast.LENGTH_SHORT).show();

            }
        }) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> header = new HashMap<>();
                header.put("Authorization", "Bearer " + SecretKey);
                return header;
            }

            @Override
            public Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<>();
                BigDecimal number = new BigDecimal(amount);

                // Round off the number to the nearest integer
                BigDecimal roundedNumber = number.setScale(0, BigDecimal.ROUND_HALF_UP);

                // Print the rounded off number
                System.out.println("The rounded off number is: " + roundedNumber);
                params.put("customer", customerID);
                params.put("amount", String.valueOf(roundedNumber)+"00");
                params.put("currency", currency);
                params.put("automatic_payment_methods[enabled]", "true");
                return params;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(request);
    }
}

