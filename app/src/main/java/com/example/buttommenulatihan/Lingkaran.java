package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Lingkaran extends AppCompatActivity {

    private EditText jariJariEditText;
    private Button hitungButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        // Inisialisasi view
        jariJariEditText = findViewById(R.id.editText);
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
        // Mengambil nilai jari-jari dari input pengguna
        String jariJariString = jariJariEditText.getText().toString().trim();

        // Memastikan input tidak kosong
        if (!jariJariString.isEmpty()) {
            // Mengonversi nilai jari-jari menjadi double
            double jariJari = Double.parseDouble(jariJariString);

            // Menghitung luas lingkaran
            double luas = Math.PI * jariJari * jariJari;

            // Menampilkan hasil pada TextView
            hasilTextView.setText("HASIL: " + luas);
        } else {
            // Menampilkan pesan kesalahan jika input kosong
            hasilTextView.setText("Masukkan jari-jari terlebih dahulu");
        }
    }
}
