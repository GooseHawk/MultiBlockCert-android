package io.github.android.blockcert;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.gson.Gson;

/**
 * Created by Yifan on 2017/3/27.
 */

public class MainShowActivity extends AppCompatActivity {
    protected Activity mActivity = this;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        mActivity = this;
        Intent intent = getIntent();
        String resultString = intent.getStringExtra("ResultString");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);
        Gson gson = new Gson();
        CertResult certResult = gson.fromJson(resultString, CertResult.class);
        String informationResult = "Issuer: " + certResult.getIssuer().getName() + "\n" +
                "Recipient: " + certResult.getRecipient().getGivenName() + " " + certResult.getRecipient().getFamilyName() + "\n" +
                "Issued Date: " + certResult.getAssertion().getIssuedOn();
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(informationResult);


    }
}