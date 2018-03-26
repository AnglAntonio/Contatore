package com.example.angelo.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Contatore extends AppCompatActivity {


    //View Layout
    private TextView Messaggio;
    private Button Aumenta;
    private Button Diminuisci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatore);

        //imposto riferimenti layout
        Messaggio = findViewById(R.id.textMessaggio);
        Aumenta = findViewById(R.id.buttonAumenta);
        Diminuisci = findViewById(R.id.buttonDiminuisci);






    }








}

