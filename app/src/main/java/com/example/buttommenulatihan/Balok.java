package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Balok extends AppCompatActivity {
    EditText editTextPL;
    EditText editTextLT;
    EditText editTextPT;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        editTextPL = findViewById(R.id.editText);
        editTextLT = findViewById(R.id.editText1);
        editTextPT = findViewById(R.id.editText2);
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
        String plStr = editTextPL.getText().toString().trim();
        String ltStr = editTextLT.getText().toString().trim();
        String ptStr = editTextPT.getText().toString().trim();

        if (TextUtils.isEmpty(plStr)) {
            editTextPL.setError("Masukkan nilai panjang");
            return;
        }

        if (TextUtils.isEmpty(ltStr)) {
            editTextLT.setError("Masukkan nilai lebar");
            return;
        }

        if (TextUtils.isEmpty(ptStr)) {
            editTextPT.setError("Masukkan nilai tinggi");
            return;
        }

        double pl = Double.parseDouble(plStr);
        double lt = Double.parseDouble(ltStr);
        double pt = Double.parseDouble(ptStr);
        double volume = 2 * pl * lt + lt * pt + pl * pt;
        hasilTextView.setText(String.format("Volume balok adalah %.2f", volume));
    }
}
