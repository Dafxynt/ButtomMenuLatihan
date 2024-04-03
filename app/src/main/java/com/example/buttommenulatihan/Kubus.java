package com.example.buttommenulatihan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kubus extends AppCompatActivity {
    EditText editText;
    Button buttonHitung;
    TextView hasilTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        editText = findViewById(R.id.editText);
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
        String sisiStr = editText.getText().toString().trim();

        if (TextUtils.isEmpty(sisiStr)) {
            editText.setError("Masukkan jumlah sisi");
            return;
        }

        double sisi = Double.parseDouble(sisiStr);
        double volume = sisi * sisi * sisi;
        hasilTextView.setText(String.format("Volume kubus adalah %.2f", volume));
    }
}
