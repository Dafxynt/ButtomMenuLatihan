package com.example.buttommenulatihan.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Intent;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.buttommenulatihan.BelahKetupat;
import com.example.buttommenulatihan.Lingkaran;
import com.example.buttommenulatihan.PersegiPanjang;
import com.example.buttommenulatihan.R;
import com.example.buttommenulatihan.Segitiga;
import com.example.buttommenulatihan.kotak;
import com.example.buttommenulatihan.layangLayang;

public class Fragment1 extends Fragment {

    public Fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);

        CardView cardViewKotak = view.findViewById(R.id.cardviewkotak);
        cardViewKotak.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), kotak.class);
            startActivity(intent);
        });

        CardView cardViewPersegiPanjang = view.findViewById(R.id.cardviewpersegipanjang);
        cardViewPersegiPanjang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), PersegiPanjang.class);
            startActivity(intent);
        });

        CardView cardViewSegitiga = view.findViewById(R.id.cardviewsegitiga);
        cardViewSegitiga.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Segitiga.class);
            startActivity(intent);
        });

        CardView cardViewLingkaran = view.findViewById(R.id.cardviewlingkaran);
        cardViewLingkaran.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Lingkaran.class);
            startActivity(intent);
        });

        CardView cardViewLayangLayang = view.findViewById(R.id.cardviewlayanglayang);
        cardViewLayangLayang.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), layangLayang.class);
            startActivity(intent);
        });

        CardView cardViewBelahKetupat = view.findViewById(R.id.cardviewbelahketupat);
        cardViewBelahKetupat.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), BelahKetupat.class);
            startActivity(intent);
        });

        return view;
    }
}
