package com.btsinfo.des;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import java.security.SecureRandom;

import java.security.SecureRandom;

public class Activity_result extends AppCompatActivity {

    private TextView tvResultat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent mIntent = getIntent();
        String face = mIntent.getStringExtra("face");
        tvResultat = (TextView) findViewById(R.id.tvResultat);

        int min_val = 0;
        int max_val = 0;
        if (face=="4")
            max_val = 4;
        if (face=="6")
            max_val = 6;
        if (face=="8")
            max_val = 8;
        if (face=="10")
            max_val = 10;
        if (face=="12")
            max_val = 12;
        if (face=="20")
            max_val = 20;

        SecureRandom random = new SecureRandom();
        int randomNum = random.nextInt((max_val - min_val) + 1) + min_val;
        Toast.makeText(this, randomNum, Toast.LENGTH_SHORT).show();
    }
}