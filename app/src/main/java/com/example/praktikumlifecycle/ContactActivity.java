package com.example.praktikumlifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ContactActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView noHp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        noHp = findViewById(R.id.txtNoHp);
        noHp.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == noHp.getId()) {
            //arahkan ke dial no tsb
//          Uri uri = Uri.parse("tel:089671256809"); //hard code no hp nya
            Uri uri = Uri.parse("tel:" + noHp.getText().toString());

            Intent intent = new Intent (Intent.ACTION_DIAL, uri);
            startActivity(intent);
        }
    }
}