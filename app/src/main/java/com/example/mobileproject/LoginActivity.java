package com.example.mobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
    }
    public void onLoginBtnClicked(View view) {
        Intent feed = toFeed();
        startActivity(feed);
    }

    Intent toFeed(){
        return new Intent(this, TestActivity.class);
    }
}