package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.gruia.ar_app.R;
import com.gruia.ar_app.adapter.ChooseProfileAdapter;
import com.gruia.ar_app.model.Profile;

public class CreateProfileActivity extends AppCompatActivity {

    private EditText name,email,phone;
    ChooseProfileAdapter adapter;
    public static Activity fa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_profile);
        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
        fa = this;

    }

    public void editProfile(View v)
    {
        Profile updatedProfile = new Profile(name.getText().toString(),email.getText().toString(),
                Long.parseLong(phone.getText().toString()));
        Intent intent = new Intent(this, ChooseProfileActivity.class);
        fa.finish();
        startActivity(intent);
    }
}