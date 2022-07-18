package com.arfakhsy.mobileboilerplate.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.arfakhsy.mobileboilerplate.R;
import com.arfakhsy.mobileboilerplate.StartUpActivity;

public class SignUpSuccessActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_sign_up_success);
    }

    public void onClickExit(View view) {
        Intent intent = new Intent(getApplicationContext(), StartUpActivity.class);
        startActivity(intent);
    }

    public void onClickSignUpSuccess(View view) {
        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }
}