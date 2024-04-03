package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BelahKetupat extends AppCompatActivity {

    private EditText alasEditText, tinggiEditText;
    private Button hitungButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belah_ketupat);

        // Inisialisasi view
        alasEditText = findViewById(R.id.editText);
        tinggiEditText = findViewById(R.id.editText1);
        hitungButton = findViewById(R.id.buttonHitung);
        hasilTextView = findViewById(R.id.myTextView2);

        // Menambahkan listener pada tombol hitung
        hitungButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungLuas();
            }
        });
    }

    private void hitungLuas() {
        // Mengambil nilai alas dan tinggi dari input pengguna
        String alasString = alasEditText.getText().toString().trim();
        String tinggiString = tinggiEditText.getText().toString().trim();

        // Memastikan kedua input tidak kosong
        if (!alasString.isEmpty() && !tinggiString.isEmpty()) {
            // Mengonversi nilai alas dan tinggi menjadi double
            double alas = Double.parseDouble(alasString);
            double tinggi = Double.parseDouble(tinggiString);

            // Menghitung luas jajar genjang
            double luas = alas * tinggi;

            // Menampilkan hasil pada TextView
            hasilTextView.setText("HASIL: " + luas);
        } else {
            // Menampilkan pesan kesalahan jika ada input yang kosong
            hasilTextView.setText("Masukkan kedua nilai alas dan tinggi terlebih dahulu");
        }
    }
}
