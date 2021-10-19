package com.example.praktikumlifecycle.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.praktikumlifecycle.R;
import com.example.praktikumlifecycle.model.Kontak;
import com.example.praktikumlifecycle.viewHolder.KontakViewHolder;

import java.util.ArrayList;

public class KontakAdapter extends RecyclerView.Adapter<KontakViewHolder> {

    private ArrayList<Kontak> kontakList;
    private Context context;

    public KontakAdapter(ArrayList<Kontak> kontakList, Context context) {
        this.kontakList = kontakList;
        this.context = context;
    }

    @NonNull
    @Override
    public KontakViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout. layout_item, parent, false);
        KontakViewHolder viewHolder = new KontakViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull KontakViewHolder holder, int position) {
        holder.getTxtName().setText(kontakList.get(position).getNama());
        Glide.with(context).load(kontakList.get(position).getFoto()).into(holder.getImgProfilePic());
        holder.getTxtKontak().setText(kontakList.get(position).getNoHp());
    }

    @Override
    public int getItemCount() {
        return kontakList.size();
    }
}
