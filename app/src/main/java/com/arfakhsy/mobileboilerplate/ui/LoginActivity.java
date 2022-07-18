package com.arfakhsy.mobileboilerplate.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.arfakhsy.mobileboilerplate.R;
import com.arfakhsy.mobileboilerplate.StartUpActivity;
import com.arfakhsy.mobileboilerplate.landingpage.DashboardActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_login);
    }

    public void onClickLogin(View view) {
        Intent intent = new Intent(getApplicationContext(), DashboardActivity.class);
        startActivity(intent);
    }

    public void onClickSignUp(View view) {

        Intent intent = new Intent(getApplicationContext(), SignUpMainActivity.class);
        startActivity(intent);
    }

    public void onClickForgotPassword(View view) {

        Intent intent = new Intent(getApplicationContext(), ForgotPasswordActivity.class);
        startActivity(intent);
    }

    public void onClickBack(View view) {

        Intent intent = new Intent(getApplicationContext(), StartUpActivity.class);
        startActivity(intent);
    }
}