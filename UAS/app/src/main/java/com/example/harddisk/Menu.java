package com.example.harddisk;

public class Menu {
    private String nama;
    private String harga;
    private String gambar;

    public Menu(String nama, String harga,String gambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public String getHarga() {
        return harga;
    }

    public String getGambar() {
        return gambar;
    }
}
