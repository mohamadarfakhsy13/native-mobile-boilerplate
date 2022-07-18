package com.arfakhsy.mobileboilerplate.otp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.arfakhsy.mobileboilerplate.R;
import com.arfakhsy.mobileboilerplate.ui.SignUpPhoneActivity;
import com.arfakhsy.mobileboilerplate.ui.SignUpSuccessActivity;

public class OtpVerificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_otp_verification);
    }

    public void onClickExit(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpPhoneActivity.class);
        startActivity(intent);
    }

    public void onClickVerify(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpSuccessActivity.class);
        startActivity(intent);
    }
}