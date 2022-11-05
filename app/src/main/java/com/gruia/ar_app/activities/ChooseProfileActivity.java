package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.gruia.ar_app.R;
import com.gruia.ar_app.adapter.ChooseProfileAdapter;
import com.gruia.ar_app.model.Profile;
import com.gruia.ar_app.viewModel.ChooseProfileViewModel;

import java.util.ArrayList;

public class ChooseProfileActivity extends AppCompatActivity {

    RecyclerView profileList;
    ChooseProfileAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_choose_profile);

        profileList = findViewById(R.id.rv);
        profileList.hasFixedSize();
        profileList.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<Profile> profiles = new ArrayList<>();
        profiles.add(new Profile("Alex","alex@gmail.com",12345678));
        profiles.add(new Profile("Dorin","Dorin@gmail.com",12345678));
        profiles.add(new Profile("Marius","Marius@gmail.com",12345678));
        profiles.add(new Profile("Cosmin","Cosmin@gmail.com",12345678));



        adapter = new ChooseProfileAdapter(profiles);
        profileList.setAdapter(adapter);
    }

    public void createProfile(View view) {
        Intent intent = new Intent(this, CreateProfileActivity.class);
        startActivity(intent);
    }
}