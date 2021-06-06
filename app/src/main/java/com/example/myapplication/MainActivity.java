package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTwoCaramel, btnTwoDalgona, btnTwoAmericano, btnTwoColdbrew, btnTwoCafemoca, btnTwoSignature, btnTwoTonic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTwoCaramel = findViewById(R.id.btnTwoCaramel);
        btnTwoDalgona = findViewById(R.id.btnTwoDalgona);
        btnTwoAmericano = findViewById(R.id.btnTwoAmericano);
        btnTwoColdbrew = findViewById(R.id.btnTwoColdbrew);
        btnTwoCafemoca = findViewById(R.id.btnTwoCafemoca);
        btnTwoSignature = findViewById(R.id.btnTwoSignature);
        btnTwoTonic = findViewById(R.id.btnTwoTonic);

        btnTwoCaramel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoDalgona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoAmericano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoColdbrew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoCafemoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoSignature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnTwoTonic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}