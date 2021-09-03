package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView titleResult, textResult, textResultNota;
    private Button calcAgainButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        titleResult = findViewById(R.id.titleResult);
        textResult = findViewById(R.id.textResult);
        textResultNota = findViewById(R.id.textResultNota);
        calcAgainButton = findViewById(R.id.calcAgainButton);
    }
}