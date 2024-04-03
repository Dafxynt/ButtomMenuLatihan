package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Tabung extends AppCompatActivity {
    EditText editTextPI;
    EditText editTextR2;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        editTextPI = findViewById(R.id.editText);
        editTextR2 = findViewById(R.id.editText1);
        editTextTinggi = findViewById(R.id.editText2);
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
        String piStr = editTextPI.getText().toString().trim();
        String r2Str = editTextR2.getText().toString().trim();
        String tinggiStr = editTextTinggi.getText().toString().trim();

        if (TextUtils.isEmpty(piStr)) {
            editTextPI.setError("Masukkan nilai π");
            return;
        }

        if (TextUtils.isEmpty(r2Str)) {
            editTextR2.setError("Masukkan nilai r²");
            return;
        }

        if (TextUtils.isEmpty(tinggiStr)) {
            editTextTinggi.setError("Masukkan nilai tinggi");
            return;
        }

        double pi = Double.parseDouble(piStr);
        double r2 = Double.parseDouble(r2Str);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = pi * r2 * tinggi;
        hasilTextView.setText(String.format("Volume tabung adalah %.2f", volume));
    }
}
