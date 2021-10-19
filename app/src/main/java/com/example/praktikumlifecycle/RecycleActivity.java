package com.example.praktikumlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.praktikumlifecycle.adapter.KontakAdapter;
import com.example.praktikumlifecycle.model.Kontak;

import java.util.ArrayList;

public class RecycleActivity extends AppCompatActivity implements View.OnClickListener {

    RecyclerView recyclerView;
    KontakAdapter kontakAdapter;
    ArrayList<Kontak> kontakList;

    Button btnAdd;
    int foto = (R.drawable.user);
//test b
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);

        btnAdd = findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(this);

        loadData();
        initRecycleView();
    }

    private void initRecycleView() {
        recyclerView = findViewById(R.id.recycleContainer);
        kontakAdapter = new KontakAdapter(kontakList, this);
        recyclerView.setAdapter(kontakAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void addData() {
        kontakList.add(new Kontak("newData " + (kontakList.size() - 1), "090671256809" + (kontakList.size() - 1), foto));
    }

    private void loadData() {
        kontakList = new ArrayList<>();
        kontakList.add(new Kontak("Thoriq", "089671256809", foto));
        kontakList.add(new Kontak("Si A", "088888888888", foto));
        kontakList.add(new Kontak("Si B", "081111111111", foto));
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == btnAdd.getId()) {
            addData();
            kontakAdapter.notifyDataSetChanged();
        }
    }
}