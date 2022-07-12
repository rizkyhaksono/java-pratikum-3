package com.rizky.kegiatan2;

public class Laptop {
    protected String nama;
    protected int harga;

    public Laptop(String name, int price) {
        this.nama = name;
        this.harga = price;
    }

    public Laptop() {
        this.nama = "";
        this.harga = 0;
    }

    public void display() {
        System.out.println("\nSelamat Datang di Toko Laptop " + nama);
    }

}
