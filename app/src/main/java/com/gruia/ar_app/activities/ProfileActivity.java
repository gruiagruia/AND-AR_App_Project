package com.gruia.ar_app.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;

import com.gruia.ar_app.R;
import com.gruia.ar_app.model.Profile;
import com.gruia.ar_app.viewModel.ProfileActivityViewModel;

public class ProfileActivity extends AppCompatActivity {

    private EditText name,email,phone;
    private ProfileActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_profile);
        viewModel = new ViewModelProvider(this).get(ProfileActivityViewModel.class);
        name = findViewById(R.id.editTextTextPersonName);
        email = findViewById(R.id.editTextTextEmailAddress);
        phone = findViewById(R.id.editTextPhone);
    }


    public void editProfile(View v)
    {
        Profile updatedProfile = new Profile(name.getText().toString(),email.getText().toString(),
                                            Long.parseLong(phone.getText().toString()));
        viewModel.editProfile(updatedProfile);
    }
}