package com.example.buttommenulatihan;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class kotak extends AppCompatActivity {

    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak);

        editTextSisi = findViewById(R.id.editText);
        buttonHitung = findViewById(R.id.buttonHitung);
        textViewHasil = findViewById(R.id.myTextView2);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuasPersegi();
            }
        });
    }

    private void hitungLuasPersegi() {
        String sisiStr = editTextSisi.getText().toString();

        if (TextUtils.isEmpty(sisiStr)) {
            Toast.makeText(this, "Masukkan panjang sisi", Toast.LENGTH_SHORT).show();
            return;
        }

        double sisi;
        try {
            // Menangani jika pengguna memasukkan tanda koma sebagai pemisah desimal
            sisiStr = sisiStr.replace(",", ".");
            sisi = Double.parseDouble(sisiStr);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Masukkan angka yang valid", Toast.LENGTH_SHORT).show();
            return;
        }

        double luas = sisi * sisi;
        textViewHasil.setText(String.format("Luas persegi dengan sisi %.2f adalah %.2f", sisi, luas));
    }
}
