package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcNoteActivity extends AppCompatActivity {

    private TextView titleTextCalc;
    private EditText textEditNota1, textEditNota2, textEditNota3, textEditNota4, textEditNota5;
    private Button calcButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_note);

        titleTextCalc = findViewById(R.id.titleTextCalc);
        textEditNota1 = findViewById(R.id.textEditNota1);
        textEditNota2 = findViewById(R.id.textEditNota2);
        textEditNota3 = findViewById(R.id.textEditNota3);
        textEditNota4 = findViewById(R.id.textEditNota4);
        textEditNota5 = findViewById(R.id.textEditNota5);
        calcButton = findViewById(R.id.calcButton);

    }
}