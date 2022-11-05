package com.gruia.ar_app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gruia.ar_app.R;
import com.gruia.ar_app.model.Profile;

import java.util.ArrayList;

public class ChooseProfileAdapter extends RecyclerView.Adapter<ChooseProfileAdapter.ViewHolder>{

    private ArrayList<Profile> profiles;

    public ChooseProfileAdapter(ArrayList<Profile> profiles) {
        this.profiles = profiles;
    }

    @NonNull
    @Override
    public ChooseProfileAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChooseProfileAdapter.ViewHolder holder, int position) {
        holder.name.setText(profiles.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return profiles.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private final TextView name;
        private final ImageView icon;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            icon = itemView.findViewById(R.id.iv_icon);



        }
    }
}
