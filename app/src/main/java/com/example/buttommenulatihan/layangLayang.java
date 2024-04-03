package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class layangLayang extends AppCompatActivity {

    private EditText diagonal1EditText, diagonal2EditText;
    private Button hitungButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang_layang);

        // Inisialisasi view
        diagonal1EditText = findViewById(R.id.editText);
        diagonal2EditText = findViewById(R.id.editText1);
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
        // Mengambil nilai diagonal 1 dan diagonal 2 dari input pengguna
        String diagonal1String = diagonal1EditText.getText().toString().trim();
        String diagonal2String = diagonal2EditText.getText().toString().trim();

        // Memastikan kedua input tidak kosong
        if (!diagonal1String.isEmpty() && !diagonal2String.isEmpty()) {
            // Mengonversi nilai diagonal 1 dan diagonal 2 menjadi double
            double diagonal1 = Double.parseDouble(diagonal1String);
            double diagonal2 = Double.parseDouble(diagonal2String);

            // Menghitung luas layang-layang
            double luas = 0.5 * diagonal1 * diagonal2;

            // Menampilkan hasil pada TextView
            hasilTextView.setText("HASIL: " + luas);
        } else {
            // Menampilkan pesan kesalahan jika ada input yang kosong
            hasilTextView.setText("Masukkan kedua diagonal terlebih dahulu");
        }
    }
}
