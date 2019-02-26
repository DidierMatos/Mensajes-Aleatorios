package com.nohochdevelopers.galletuna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button btnCambio;
    TextView txtViewFrase;

    private FactBook factBook = new FactBook();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio = (Button) findViewById(R.id.btnCambio);
        txtViewFrase = (TextView) findViewById(R.id.bienvenidaTxtV);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aleatorio = factBook.getFact();

                txtViewFrase.setText(aleatorio);

            }
        });


    }
}
