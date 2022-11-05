package com.gruia.ar_app.viewModel;

import androidx.lifecycle.ViewModel;

import com.gruia.ar_app.model.Profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProfileActivityViewModel extends ViewModel {

    private List<Profile> profiles;

    public ProfileActivityViewModel()
    {
        profiles = new ArrayList<>();
    }

    public List<Profile> getProfiles() {
        return profiles;
    }

    public void addProfile(Profile profile)
    {
        profiles.add(profile);
    }

    public void deleteProfile(String email)
    {
        for(int i = 0; i < profiles.size(); i++)
        {
            if(Objects.equals(profiles.get(i).getEmail(), email))
            {
                profiles.remove(i);
            }
        }
    }

    public void editProfile(Profile profile)
    {
        for(int i = 0; i < profiles.size(); i++)
        {
            if(Objects.equals(profiles.get(i).getEmail(), profile.getEmail()))
            {
                profiles.set(i,profile);
            }
        }
    }
}
