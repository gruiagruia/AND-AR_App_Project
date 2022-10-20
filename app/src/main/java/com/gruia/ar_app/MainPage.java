package com.gruia.ar_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.AugmentedImageDatabase;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;

import java.io.IOException;
import java.io.InputStream;

public class MainPage extends AppCompatActivity {


    public Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_page);


    }


    public void coursesPressed(View v)
    {
        Intent intent = new Intent(this, CoursesActivity.class);
        startActivity(intent);
    }

    public void profilePressed(View v)
    {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void progressPressed(View v)
    {
        Intent intent = new Intent(this, ProgressActivity.class);
        startActivity(intent);
    }

    public void settingsPressed(View v)
    {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }


}