package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class configActivity extends AppCompatActivity {

    private TextView titleTextConfig;
    private TextView textConfig;
    private Button blueButton, whiteButton, blackButton;
    private ConstraintLayout bgConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_config);

        titleTextConfig = findViewById(R.id.titleTextConfig);
        textConfig = findViewById(R.id.textConfig);
        blueButton = findViewById(R.id.blueButton);
        whiteButton = findViewById(R.id.whiteButton);
        blackButton = findViewById(R.id.blackButton);
        bgConfig = findViewById(R.id.bgConfig);

        //Cambiar color
        SharedPreferences sp = getSharedPreferences("colors",MODE_PRIVATE);

        //Color azul
        blueButton.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#039BE5").apply();
                    finish();
                });
        //Color blanco
        whiteButton.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#FFFFFF").apply();
                    finish();
                });
        //Color negro
        blackButton.setOnClickListener(
                (v) ->{
                    sp.edit().putString("color","#000000").apply();
                    finish();
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colors",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgConfig.setBackgroundColor(Color.parseColor(color));
    }
}