package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Bola extends AppCompatActivity {
    EditText editTextPi;
    EditText editTextRadius;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        editTextPi = findViewById(R.id.editText);
        editTextRadius = findViewById(R.id.editText1);
        buttonHitung = findViewById(R.id.buttonHitung);
        hasilTextView = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungVolume();
            }
        });
    }

    private void hitungVolume() {
        String piStr = editTextPi.getText().toString().trim();
        String radiusStr = editTextRadius.getText().toString().trim();

        if (TextUtils.isEmpty(piStr)) {
            editTextPi.setError("Masukkan nilai Pi");
            return;
        }

        if (TextUtils.isEmpty(radiusStr)) {
            editTextRadius.setError("Masukkan nilai radius");
            return;
        }

        double pi = Double.parseDouble(piStr);
        double radius = Double.parseDouble(radiusStr);
        double volume = (4.0 / 3.0) * pi * Math.pow(radius, 3);
        hasilTextView.setText(String.format("Volume bola adalah %.2f", volume));
    }
}
