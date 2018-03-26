package com.example.angelo.contatore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Contatore extends AppCompatActivity {


    //View Layout
    private TextView Messaggio;
    private Button Aumenta;
    private Button Diminuisci;
    private Button Azzera;

    //Dichiaro contatore
    private int contatore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatore);

        //imposto riferimenti layout
        Messaggio = findViewById(R.id.textMessaggio);
        Aumenta = findViewById(R.id.buttonAumenta);
        Diminuisci = findViewById(R.id.buttonDiminuisci);


        //imposto azioni pulsanti
        Aumenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++contatore;
                visualizzaMessaggio();
            }
        });

        Diminuisci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --contatore;
                visualizzaMessaggio();
            }
        });
    }


    //con /** invio ho un commento che mi esce come help per le funzioni
    /**
     * Metodo che visualizza messaggio
     */
    private void visualizzaMessaggio (){
        Messaggio.setText(getString(R.string.Valore) + contatore);   //Con R accedo alle risorse, .string accedo al file delle string
    }




}

