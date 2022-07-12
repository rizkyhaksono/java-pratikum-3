package com.rizky.kegiatan2_child;

import java.util.Scanner;

import com.rizky.kegiatan2.Laptop;

public class Merk extends Laptop {

    public static final String input = null;

    public Merk() {
        setMerk();
        setHarga();
    }

    public Merk(String name, int price) {
        super(name, price);
    }

    Scanner scn = new Scanner(System.in);

    public String setMerk() {
        System.out.print("Masukkan Merk Laptop : ");
        return this.nama = scn.nextLine();
    }

    public int setHarga() {
        System.out.print("Masukkan Harga Laptop : ");
        return this.harga = scn.nextInt();
    }

    public void Brand() {
        System.out.println("Laptop dari " + super.nama + " dengan harga " + super.harga + ".000.000 rupiah");
    }
}
