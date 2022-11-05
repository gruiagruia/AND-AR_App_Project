package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.gruia.ar_app.R;

public class MainActivity extends AppCompatActivity {


    public static Activity fa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        fa = this;
    }

    public void startButtonClicked(View v)
    {
        Intent intent = new Intent(this, ChooseProfileActivity.class);
        MainActivity.fa.finish();
        startActivity(intent);
    }
}