package com.gruia.ar_app;

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
import com.gruia.ar_app.fragments.anatomy.AnatomyPracticeFragment;


public class AnatomyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_anatomy);
        loadFragment(new AnatomyFragment());
    }

    public void changeLearnFragment(View view) {
        loadFragment(new AnatomyLearnFragment());
    }

    public void changePracticeFragment(View view) {
        loadFragment(new AnatomyPracticeFragment());
    }

    public void changeARFragment(View view) {
        loadFragment(new AnatomyARFragment());
    }

    private void loadFragment(Fragment fragment) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.anatomyFrameLayout, fragment);
        fragmentTransaction.commit();
    }
}