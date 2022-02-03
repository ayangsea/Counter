package com.example.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private com.example.counter.databinding.ActivityMainBinding mBinding;
    private int mCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mBinding.plus.setOnClickListener(v->updateCounter(1));
        mBinding.minus.setOnClickListener(v->updateCounter(-1));
    }

    private void updateCounter(int i) {
        mCounter += i;
        mBinding.counter.setText(String.valueOf(mCounter));
    }
}