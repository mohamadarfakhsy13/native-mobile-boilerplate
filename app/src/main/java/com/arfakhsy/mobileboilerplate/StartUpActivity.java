package com.arfakhsy.mobileboilerplate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.arfakhsy.mobileboilerplate.ui.LoginActivity;
import com.arfakhsy.mobileboilerplate.ui.SignUpMainActivity;

public class StartUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_up);
    }

    public void onClickLogin(View view) {

        Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
        startActivity(intent);
    }

    public void onClickSignUp(View view) {

        Intent intent = new Intent(getApplicationContext(), SignUpMainActivity.class);
        startActivity(intent);
    }
}