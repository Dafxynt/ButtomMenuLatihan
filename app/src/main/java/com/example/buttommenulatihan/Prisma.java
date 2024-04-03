package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Prisma extends AppCompatActivity {
    EditText editTextLuasAlas;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prisma);

        editTextLuasAlas = findViewById(R.id.editText);
        editTextTinggi = findViewById(R.id.editText1);
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
        String luasAlasStr = editTextLuasAlas.getText().toString().trim();
        String tinggiStr = editTextTinggi.getText().toString().trim();

        if (TextUtils.isEmpty(luasAlasStr)) {
            editTextLuasAlas.setError("Masukkan nilai luas alas");
            return;
        }

        if (TextUtils.isEmpty(tinggiStr)) {
            editTextTinggi.setError("Masukkan nilai tinggi");
            return;
        }

        double luasAlas = Double.parseDouble(luasAlasStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = (1.0 / 3.0) * luasAlas * tinggi;
        hasilTextView.setText(String.format("Volume limas adalah %.2f", volume));
    }
}
