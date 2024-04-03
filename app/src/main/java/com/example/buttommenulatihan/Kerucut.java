package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kerucut extends AppCompatActivity {
    EditText editTextJariJari;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        editTextJariJari = findViewById(R.id.editText);
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
        String jariJariStr = editTextJariJari.getText().toString().trim();
        String tinggiStr = editTextTinggi.getText().toString().trim();

        if (TextUtils.isEmpty(jariJariStr)) {
            editTextJariJari.setError("Masukkan nilai jari-jari");
            return;
        }

        if (TextUtils.isEmpty(tinggiStr)) {
            editTextTinggi.setError("Masukkan nilai tinggi");
            return;
        }

        double jariJari = Double.parseDouble(jariJariStr);
        double tinggi = Double.parseDouble(tinggiStr);
        double volume = (1.0 / 3.0) * Math.PI * Math.pow(jariJari, 2) * tinggi;
        hasilTextView.setText(String.format("Volume kerucut adalah %.2f", volume));
    }
}
