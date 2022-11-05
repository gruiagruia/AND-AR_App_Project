package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;

import com.gruia.ar_app.fragments.anatomy.AnatomyARFragment;
import com.gruia.ar_app.fragments.geometry.GeometryARFragment;
import com.gruia.ar_app.fragments.geometry.GeometryFragment;
import com.gruia.ar_app.fragments.geometry.GeometryLearnFragment;
import com.gruia.ar_app.fragments.geometry.GeometryPracticeFragment;import com.gruia.ar_app.R;
import com.gruia.ar_app.fragments.geometry.learn_fragments.CubeFragment;
import com.gruia.ar_app.fragments.geometry.learn_fragments.PyramidFragment;
import com.gruia.ar_app.fragments.geometry.learn_fragments.SphereFragment;
import com.gruia.ar_app.fragments.geometry.learn_fragments.SubLearnFragment;

public class GeometryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_geometry);
        loadFragment(new GeometryFragment());
    }

    public void changeLearnFragment(View view) {
        loadFragment(new SubLearnFragment());
    }

    public void changePracticeFragment(View view) {
        loadFragment(new GeometryPracticeFragment());
    }

    public void changeARFragment(View view) {
        loadFragment(new GeometryARFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack(null);
        fragmentTransaction.replace(R.id.geometryFrameLayout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed(){
        android.app.FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            Log.i("MainActivity", "popping backstack");
            fm.popBackStack();
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            super.onBackPressed();
        }
    }


    public void changeSphereFragment(View view) {
        loadFragment(new SphereFragment());
    }

    public void changePyramidFragment(View view) {
        loadFragment(new PyramidFragment());
    }

    public void changeCubeFragment(View view) {
        loadFragment(new CubeFragment());
    }
}