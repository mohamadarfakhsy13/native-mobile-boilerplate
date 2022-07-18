package com.arfakhsy.mobileboilerplate.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.arfakhsy.mobileboilerplate.R;
import com.arfakhsy.mobileboilerplate.StartUpActivity;

public class SignUpMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up_main);
    }

    public void onClickBack(View view) {
        Intent intent = new Intent(getApplicationContext(), StartUpActivity.class);
        startActivity(intent);
    }

    public void onClickNext(View view) {
        Intent intent = new Intent(getApplicationContext(), SignUpPhoneActivity.class);
        startActivity(intent);

    }

    public void onClickLogin(View view) {

    }


}