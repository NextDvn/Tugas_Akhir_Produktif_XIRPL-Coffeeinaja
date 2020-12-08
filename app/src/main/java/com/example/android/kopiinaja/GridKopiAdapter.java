package com.example.android.kopiinaja;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class GridKopiAdapter extends RecyclerView.Adapter<GridKopiAdapter.GridViewHolder> {
    private final ArrayList<Kopi> listKopi;
    private ListKopiAdapter.OnItemClickCallback onItemClickCallback;

    public GridKopiAdapter(ArrayList<Kopi> list) {
        this.listKopi = list;
    }


    @NonNull
    @Override
    public GridViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_grid_kopi, viewGroup, false);
        return new GridViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull final GridViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(listKopi.get(position).getPhoto())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPhoto);

    }

    @Override
    public int getItemCount() {
        return listKopi.size();
    }

    public interface OnItemClickCallback {
        void onItemClicked(Kopi data);
    }

    public class GridViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;

        public GridViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
        }
    }
}
