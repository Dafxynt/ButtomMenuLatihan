package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {

    private EditText panjangEditText, lebarEditText;
    private Button hitungButton;
    private TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        // Inisialisasi view
        panjangEditText = findViewById(R.id.editText);
        lebarEditText = findViewById(R.id.editText1);
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
        // Mengambil nilai panjang dan lebar dari input pengguna
        String panjangString = panjangEditText.getText().toString().trim();
        String lebarString = lebarEditText.getText().toString().trim();

        // Memastikan kedua input tidak kosong
        if (!panjangString.isEmpty() && !lebarString.isEmpty()) {
            // Mengonversi nilai panjang dan lebar menjadi bilangan desimal
            double panjang = Double.parseDouble(panjangString);
            double lebar = Double.parseDouble(lebarString);

            // Menghitung luas persegi panjang
            double luas = panjang * lebar;

            // Menampilkan hasil pada TextView
            hasilTextView.setText("HASIL: " + String.format("%.2f", luas));
        } else {
            // Menampilkan pesan kesalahan jika ada input yang kosong
            hasilTextView.setText("Masukkan panjang dan lebar terlebih dahulu");
        }
    }
}
