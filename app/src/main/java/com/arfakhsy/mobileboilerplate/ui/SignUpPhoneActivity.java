package com.arfakhsy.mobileboilerplate.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.arfakhsy.mobileboilerplate.R;

public class SignUpPhoneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up_phone);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpMainActivity.class);
        startActivity(intent);
    }

    public void onClickSubmit(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpSuccessActivity.class);
        startActivity(intent);
    }
}