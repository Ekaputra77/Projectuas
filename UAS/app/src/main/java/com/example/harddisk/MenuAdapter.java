package com.example.harddisk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import  androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.harddisk.R;

import java.util.ArrayList;
import java.util.Objects;

public class MenuAdapter extends  RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {
    private Context context;
    private ArrayList<Menu> menus;
    private OnItemClickListener mListener;

    public interface OnItemClickListener {
        void onItemClick (int position);
    }

    public void setOnClickListener (OnItemClickListener listener){
        mListener = listener;
    }

    public MenuAdapter(Context mcontext, ArrayList<Menu> menuhardsik){
        context = mcontext;
        menus = menuhardsik;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_menu,parent,false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {
        Menu menubaru= menus.get(position);
        String gambarbaru = menubaru.getGambar();
        String harga = menubaru.getHarga();
        String nama = menubaru.getNama();

        holder.tvnamadata.setText(nama);
        holder.tvhargadata.setText(harga);

        Glide
                .with(context)
                .load(gambarbaru)
                .centerCrop()
                .into(holder.imdata);
    }

    @Override
    public int getItemCount() {
        return menus.size();
    }

    public class MenuViewHolder extends  RecyclerView.ViewHolder {
        public ImageView imdata;
        public TextView tvhargadata;
        public TextView tvnamadata;

        MenuViewHolder(@NonNull View view) {
            super(view);
            imdata = view.findViewById(R.id.img_menu);
            tvhargadata = view.findViewById(R.id.tv_harga);
            tvnamadata = view.findViewById(R.id.tv_nama);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
                });
            }
        }
}