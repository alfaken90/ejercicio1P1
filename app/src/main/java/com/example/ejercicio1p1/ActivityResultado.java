package com.example.ejercicio1p1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {


    TextView txtRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        setContentView(R.layout.activity_resultado);

        txtRes = findViewById(R.id.txtResultado);

        Intent i = getIntent();
        String res = i.getStringExtra("dato");

        txtRes.setText(res);
    }

}