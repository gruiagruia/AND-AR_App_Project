package com.gruia.ar_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.gruia.ar_app.fragments.geometry.GeometryARFragment;
import com.gruia.ar_app.fragments.geometry.GeometryFragment;
import com.gruia.ar_app.fragments.geometry.GeometryLearnFragment;
import com.gruia.ar_app.fragments.geometry.GeometryPracticeFragment;

public class GeometryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_geometry);
        loadFragment(new GeometryFragment());
    }

    public void changeLearnFragment(View view) {
        loadFragment(new GeometryLearnFragment());
    }

    public void changePracticeFragment(View view) {
        loadFragment(new GeometryPracticeFragment());
    }

    public void changeARFragment(View view) {
        loadFragment(new GeometryARFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.geometryFrameLayout, fragment);
        fragmentTransaction.commit();
    }


}