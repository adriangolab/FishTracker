package com.projects.fishtracker.main;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.projects.fishtracker.R;

public class MainActivity extends AppCompatActivity implements MainContract.MvpView{

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainPresenter();
    }
}