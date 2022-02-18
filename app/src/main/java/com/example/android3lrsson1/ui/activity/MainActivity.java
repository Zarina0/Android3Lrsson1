package com.example.android3lrsson1.ui.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import com.example.android3lrsson1.databinding.ActivityMainBinding;
import com.example.android3lrsson1.viewmodel.CounterViewModel;

public class MainActivity extends AppCompatActivity   {
    ActivityMainBinding binding;
    CounterViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        initObserver();
        listeners();
    }


    private void initObserver() {
        viewModel = new ViewModelProvider(this).get(CounterViewModel.class);
        viewModel.mutableLiveData.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                binding.tvNumber.setText(String.valueOf(integer));
            }
        });
    }
    private void listeners() {
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.incremetn();
            }
        });

        binding.btnDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewModel.decrement();
            }
        });
    }
}
