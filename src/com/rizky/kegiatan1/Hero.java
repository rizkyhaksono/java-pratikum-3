package com.rizky.kegiatan1;

import java.util.Scanner;

public class Hero {
    protected String namaHero, input;
    protected int power, health;

    Scanner scanner = new Scanner(System.in);

    public Hero() {
        System.out.println("[-] Selamat Datang di Land of War [-]\n");
    }

    public Hero(String namaHero, int power, int health) {
        this.namaHero = namaHero;
        this.power = power;
        this.health = health;
    }

    public void display() {
        System.out.println("Nama Hero\t: " + this.namaHero);
        System.out.println("Power Hero\t: " + this.power);
        System.out.println("Health Hero\t: " + this.health);
    }
  
}
