package com.project.mustafa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.project.mustafa.databinding.ActivityOffersBinding;

public class offers extends AppCompatActivity {
private ActivityOffersBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityOffersBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}