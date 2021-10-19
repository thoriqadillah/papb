package com.example.praktikumlifecycle.viewHolder;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.praktikumlifecycle.R;

public class KontakViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private TextView txtName, txtKontak;
    private ImageView imgProfilePic;
    Context context;

    public KontakViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        txtName = itemView.findViewById(R.id.txtName);

        txtKontak = itemView.findViewById(R.id.txtKontak);
        txtKontak.setOnClickListener(this);

        imgProfilePic = itemView.findViewById(R.id.imgProfilePic);
    }

    @Override
    public void onClick(View view) {
        Uri uri = Uri.parse("tel:" + txtKontak.getText().toString());

        Intent intent = new Intent (Intent.ACTION_DIAL, uri);
        context.startActivity(intent);
    }

    public TextView getTxtName() {
        return txtName;
    }

    public TextView getTxtKontak() {
        return txtKontak;
    }

    public ImageView getImgProfilePic() {
        return imgProfilePic;
    }

    public Context getContext() {
        return context;
    }
}
