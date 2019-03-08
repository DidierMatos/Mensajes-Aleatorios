package com.company.msgrandom;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCambio;
    private TextView txtViewFrase;
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    public static final String TAG = MainActivity.class.getSimpleName();
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCambio = findViewById(R.id.btnCambio);
        txtViewFrase = findViewById(R.id.txtVBienvenida);
        constraintLayout = findViewById(R.id.constraintLayout);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aleatorio = factBook.getFact();
                int color = colorWheel.getColor();

                txtViewFrase.setText(aleatorio);
                constraintLayout.setBackgroundColor(color);
                btnCambio.setTextColor(color);

                //Toast.makeText(MainActivity.this, "Activity created", Toast.LENGTH_SHORT).show();
                Log.d(TAG,"We're logging from the onCreate() method");

            }
        });


    }
}
