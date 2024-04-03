package com.example.buttommenulatihan.fragments;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.buttommenulatihan.Balok;
import com.example.buttommenulatihan.Bola;
import com.example.buttommenulatihan.Kerucut;
import com.example.buttommenulatihan.Kubus;
import com.example.buttommenulatihan.Prisma;
import com.example.buttommenulatihan.R;
import com.example.buttommenulatihan.Tabung;

public class Fragment2 extends Fragment {

    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);

        CardView cardView = view.findViewById(R.id.cardviewkubus);
        cardView.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Kubus.class);
            startActivity(intent);
        });

        CardView cardView1 = view.findViewById(R.id.cardviewbola);
        cardView1.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Bola.class);
            startActivity(intent);
        });

        CardView cardView2 = view.findViewById(R.id.cardviewbalok);
        cardView2.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Balok.class);
            startActivity(intent);
        });

        CardView cardView3 = view.findViewById(R.id.cardviewprisma);
        cardView3.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Prisma.class);
            startActivity(intent);
        });

        CardView cardView4 = view.findViewById(R.id.cardviewkerucut);
        cardView4.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Kerucut.class);
            startActivity(intent);
        });

        CardView cardView5 = view.findViewById(R.id.cardviewtabung);
        cardView5.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), Tabung.class);
            startActivity(intent);
        });

        return view;
    }
}
