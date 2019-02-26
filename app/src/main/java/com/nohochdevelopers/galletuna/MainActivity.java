package com.nohochdevelopers.galletuna;

import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btnCambio;
    private TextView txtViewFrase;
    private FactBook factBook = new FactBook();

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio = (Button) findViewById(R.id.btnCambio);
        txtViewFrase = (TextView) findViewById(R.id.bienvenidaTxtV);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aleatorio = factBook.getFact();

                txtViewFrase.setText(aleatorio);
                constraintLayout.setBackgroundColor(Color.BLUE);

            }
        });


    }
}
