package com.app.app.androidruntimepermission;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends RuntimePermissionsActivity {

    private int REQUEST_PERMISSIONS = 1;
    private static int SPLASH_TIME_OUT_IN_MILI_SECONDS = 1000;
    Context context = this;
    String token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        SharedPreferences sharedPreferences = context.getSharedPreferences("TOKEN", Context.MODE_PRIVATE);
        token = sharedPreferences.getString("token", "");

        SplashActivity.super.requestAppPermissions(new
                        String[]{
                        Manifest.permission.RECEIVE_SMS,
                        Manifest.permission.READ_SMS,
                        Manifest.permission.CAMERA,
                        Manifest.permission.ACCESS_NETWORK_STATE,
                        Manifest.permission.INTERNET,
                        Manifest.permission.READ_PHONE_STATE,
                        Manifest.permission.READ_EXTERNAL_STORAGE,
                        Manifest.permission.READ_CONTACTS,
                        Manifest.permission.WRITE_CONTACTS,
                        Manifest.permission.ACCESS_COARSE_LOCATION,
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_WIFI_STATE,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE



                }, R.string.runtime_permissions_txt
                , REQUEST_PERMISSIONS);
    }


    @Override
    public void onPermissionsGranted(int requestCode) {
        startSplashing();
    }

    void startSplashing() {
        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
              /*  if (token.length()>0) {
                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
                } else {*/

                    Intent i = new Intent(SplashActivity.this, MainActivity.class);
                    startActivity(i);
               // }

                finish();
            }
        }, SPLASH_TIME_OUT_IN_MILI_SECONDS);

    }

}
