package com.juaracoding.ujiancracker.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.juaracoding.ujiancracker.R;
import com.juaracoding.ujiancracker.entity.Dasboard;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class CrackerAdapter extends RecyclerView.Adapter<CrackerAdapter.MainviewHolder> {

    private ArrayList<Dasboard> dasboards;

    private CrackerAdapter(ArrayList<Dasboard> dasboards) {
        this.dasboards = dasboards;
    }

    @NonNull

    @Override
    public MainviewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_soal, parent, false);
        return new CrackerAdapter.MainviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MainviewHolder holder, int position) {
        String title = dasboards.get(position).getTitle();
        String level = dasboards.get(position).getLevel();

        holder.vTitle.setText(title);
        holder.vLevel.setText(level);
        holder.btnmulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class MainviewHolder extends RecyclerView.ViewHolder {

        TextView vTitle, vLevel;
        Button btnmulai;

        public MainviewHolder(@NonNull View itemView) {
            super(itemView);
            vTitle=itemView.findViewById(R.id.vTitle);
            vLevel=itemView.findViewById(R.id.vLevel);
        }


    }
}
