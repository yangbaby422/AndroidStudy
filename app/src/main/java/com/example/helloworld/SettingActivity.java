package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import com.example.helloworld.Utils.StatusUtils;

public class SettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StatusUtils.setImmersionMode(this);
        setContentView(R.layout.activity_setting);

        StatusUtils.initToolbar(this, "设置", true, false);
    }
}