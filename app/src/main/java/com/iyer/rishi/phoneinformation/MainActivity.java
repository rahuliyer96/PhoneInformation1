package com.iyer.rishi.phoneinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class MainActivity extends AppCompatActivity {
    Button btnPhoneModelAndManufacturer, btnPhoneLanuage, btnPhoneImeiNumber, btnNetworkTypeAndCarrier, btnAndroidVersion, btnInternetConnection, btnDisplayResolution;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAndroidVersion = (Button) findViewById(R.id.btnAndroidVersion);
        btnPhoneImeiNumber= (Button) findViewById(R.id.btnPhoneImeiNumber);
        btnPhoneModelAndManufacturer= (Button) findViewById(R.id.btnPhoneModelAndManufacturer);
        btnPhoneLanuage=(Button)findViewById(R.id.btnPhoneLanguage);
        btnNetworkTypeAndCarrier=(Button)findViewById(R.id.btnPhoneNetworkTypeAndCarrier);
        btnInternetConnection=(Button)findViewById(R.id.btnInternetConnection);
        btnDisplayResolution=(Button)findViewById(R.id.btnDisplayResolution);


        btnPhoneLanuage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });

    }
}
