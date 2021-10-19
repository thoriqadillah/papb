package com.example.praktikumlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.praktikumlifecycle.adapter.KontakAdapter;
import com.example.praktikumlifecycle.model.Kontak;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button toMrHead, toAboutUs, toTugasRecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        toAboutUs = findViewById(R.id.toAboutUs);
        toAboutUs.setOnClickListener(this);

        toMrHead = findViewById(R.id.toMrHead);
        toMrHead.setOnClickListener(this);

        toTugasRecycle = findViewById(R.id.toTugaRecycle);
        toTugasRecycle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        if (view.getId() == toAboutUs.getId()) {
            intent = new Intent(this, ContactActivity.class);
            startActivity(intent);
        } else if (view.getId() == toMrHead.getId()) {
            intent = new Intent(this, KumisActivity.class);
            startActivity(intent);
        } else {
            intent = new Intent(this, RecycleActivity.class);
            startActivity(intent);
        }
    }
}