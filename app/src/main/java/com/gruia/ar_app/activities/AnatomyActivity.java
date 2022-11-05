package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.gruia.ar_app.fragments.anatomy.AnatomyARFragment;
import com.gruia.ar_app.fragments.anatomy.AnatomyFragment;
import com.gruia.ar_app.fragments.anatomy.AnatomyLearnFragment;
import com.gruia.ar_app.fragments.anatomy.AnatomyPracticeFragment;import com.gruia.ar_app.R;
import com.gruia.ar_app.fragments.anatomy.learn_fragments.HeartFragment;
import com.gruia.ar_app.fragments.anatomy.learn_fragments.LungsFragment;
import com.gruia.ar_app.fragments.anatomy.learn_fragments.StomachFragment;
import com.gruia.ar_app.fragments.anatomy.learn_fragments.SubLearnFragment;


public class AnatomyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_anatomy);
        loadFragment(new AnatomyFragment());
    }

    public void changeLearnFragment(View view) {
        loadFragment(new SubLearnFragment());
    }

    public void changePracticeFragment(View view) {
        loadFragment(new AnatomyPracticeFragment());
    }

    public void changeARFragment(View view) {
        loadFragment(new AnatomyARFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction().addToBackStack(null);
        fragmentTransaction.replace(R.id.anatomyFrameLayout, fragment);
        fragmentTransaction.commit();
    }

    public void changeStomachFragment(View view) {
        loadFragment(new StomachFragment());
    }

    public void changeLungsFragment(View view) {
        loadFragment(new LungsFragment());
    }

    public void changeHeartFragment(View view) {
        loadFragment(new HeartFragment());
    }
}