package com.example.harddisk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import static com.example.harddisk.MainActivity.Extra_Gambar;
import static com.example.harddisk.MainActivity.Extra_Nama;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String gambar = intent.getStringExtra(Extra_Gambar);
        String nama = intent.getStringExtra(Extra_Nama);


        TextView tvnama = findViewById(R.id.tv_nama);
        ImageView ivgambar = findViewById(R.id.img_menu);

        Glide.with(this).load(gambar).fitCenter().into(ivgambar);
        tvnama.setText(nama);
    }
}
