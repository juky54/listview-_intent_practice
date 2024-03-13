package com.k214110809.practice_viewintent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.k214110809.practice_viewintent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}