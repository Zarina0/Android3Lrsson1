package com.example.android3lrsson1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.android3lrsson1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements CounterContracts.CounterView {
    ActivityMainBinding binding;
    CounterPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter= new CounterPresenter();
        presenter.attachView(this);
        listerner();
    }

    private void listerner() {
        binding.btnIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.icrement();
                presenter.change();

            }
        });


        binding.btnDecrementt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               presenter.decrement();
                presenter.change();
            }
        });


    }

    @Override
    public void updateCounter(int count) {
        binding.tvNumber.setText(String.valueOf(count));
    }


    @Override
    public void greenText() {
        binding.tvNumber.setTextColor(Color.parseColor("#07E510"));
    }


}