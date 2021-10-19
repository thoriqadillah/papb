package com.example.praktikumlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

public class KumisActivity extends AppCompatActivity implements View.OnClickListener {
    private ImageView kumis, brewok, alis, rambut;
    private CheckBox ckRambut, ckAlis, ckKumis, ckBrewok;
    private Button btnBack, btnContact;
    //test c
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumis);

        kumis = findViewById(R.id.kumis);
        brewok = findViewById(R.id.brewok);
        alis = findViewById(R.id.alis);
        rambut = findViewById(R.id.rambut);

        //with click listener
        ckRambut = findViewById(R.id.ckRambut);
        ckRambut.setOnClickListener(this);

        ckAlis = findViewById(R.id.ckAlis);
        ckAlis.setOnClickListener(this);

        ckKumis = findViewById(R.id.ckKumis);
        ckKumis.setOnClickListener(this);

        ckBrewok = findViewById(R.id.ckBrewok);
        ckBrewok.setOnClickListener(this);

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(this);

        btnContact = findViewById(R.id.btnContactUs);
        btnContact.setOnClickListener(this);
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

        if (view.getId() == btnContact.getId()) {
            Intent intent = new Intent(this, ContactActivity.class);
            startActivity(intent);
        } else if (view.getId() == btnBack.getId()) {
            finish();
        }
    }
}