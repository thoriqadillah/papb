package com.example.papb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView kumis, brewok, alis, rambut;
    CheckBox ckRambut, ckAlis, ckKumis, ckBrewok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kumis = findViewById(R.id.kumis);
        brewok = findViewById(R.id.brewok);
        alis = findViewById(R.id.alis);
        rambut = findViewById(R.id.rambut);

        ckRambut = findViewById(R.id.ckRambut);
        ckRambut.setOnClickListener(this);

        ckAlis = findViewById(R.id.ckAlis);
        ckAlis.setOnClickListener(this);

        ckKumis = findViewById(R.id.ckKumis);
        ckKumis.setOnClickListener(this);

        ckBrewok = findViewById(R.id.ckBrewok);
        ckBrewok.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        if (view.getId() == ckRambut.getId()) {
            if (ckRambut.isChecked()) {
                rambut.setVisibility(View.VISIBLE);
            } else {
                rambut.setVisibility(View.INVISIBLE);
            }
        }
        if (view.getId() == ckAlis.getId()) {
            if (ckAlis.isChecked()) {
                alis.setVisibility(View.VISIBLE);
            } else {
                alis.setVisibility(View.INVISIBLE);
            }
        }
        if (view.getId() == ckKumis.getId()) {
            if (ckKumis.isChecked()) {
                kumis.setVisibility(View.VISIBLE);
            } else {
                kumis.setVisibility(View.INVISIBLE);
            }
        }
        if (view.getId() == ckBrewok.getId()) {
            if (ckBrewok.isChecked()) {
                brewok.setVisibility(View.VISIBLE);
            } else {
                brewok.setVisibility(View.INVISIBLE);
            }
        }
    }
}