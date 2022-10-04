package com.gruia.ar_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.ar.core.ArCoreApk;
import com.google.ar.core.Config;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;

public class MainPage extends AppCompatActivity {

    public static Activity fa;
    public Button mArButton;
    public Session session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main_page);
        maybeEnableArButton();

    }

    public void createSession() throws UnavailableDeviceNotCompatibleException, UnavailableSdkTooOldException, UnavailableArcoreNotInstalledException, UnavailableApkTooOldException {
        // Create a new ARCore session.
        session = new Session(this);

        // Create a session config.
        Config config = new Config(session);

        // Do feature-specific operations here, such as enabling depth or turning on
        // support for Augmented Faces.

        // Configure the session.
        session.configure(config);
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

    void maybeEnableArButton() {
        ArCoreApk.Availability availability = ArCoreApk.getInstance().checkAvailability(this);
        if (availability.isTransient()) {
            // Continue to query availability at 5Hz while compatibility is checked in the background.
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    maybeEnableArButton();
                }
            }, 200);
        }
        if (availability.isSupported()) {
            mArButton.setVisibility(View.VISIBLE);
            mArButton.setEnabled(true);
        } else { // The device is unsupported or unknown.
            mArButton.setVisibility(View.INVISIBLE);
            mArButton.setEnabled(false);
        }
    }
}