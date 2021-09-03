package com.example.mainactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button configButton;
    private Button continueButton;
    private TextView textMain;
    private EditText textEditName;
    private ConstraintLayout bgMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configButton = findViewById(R.id.configButton);
        continueButton = findViewById(R.id.continueButton);
        textMain = findViewById(R.id.textMain);
        textEditName = findViewById(R.id.textEditName);
        bgMain = findViewById(R.id.bgMain);

        //De main a config
        configButton.setOnClickListener(
                (v) ->{
                    Intent i = new Intent(this,configActivity.class);
                    startActivity(i);
                });

        //Cambiar color
        SharedPreferences sp1 = getSharedPreferences("colors",MODE_PRIVATE);

        //De main a calcNote
        continueButton.setOnClickListener(
                (v) ->{
                    if(!textEditName.getText().toString().replaceAll(" ","").isEmpty()){
                        sp1.edit().putString("name", textEditName.getText().toString().trim()).apply();
                        Intent i = new Intent(this,calcNoteActivity.class);
                        startActivity(i);
                    }else{
                        Toast.makeText(this, "Ingrese un nombre", Toast.LENGTH_SHORT).show(); //mensaje para cuando deje en vacio
                    }
                });
    }


    @Override
    protected void onResume() {
        super.onResume();
        SharedPreferences sp = getSharedPreferences("colors",MODE_PRIVATE);
        String color = sp.getString("color","#FFFFFF");
        bgMain.setBackgroundColor(Color.parseColor(color));
    }
}