package com.rizky.kegiatan1;

public class Tank extends Hero {
    
    Tank(String name, int power, int health){
        super(name, power, health);
        name = this.namaHero;
        power = this.power;
        health = this.health;
    }

    public void defense() {
        System.out.println("[+] " + this.namaHero + " defense with " + (this.health - 20) + " armor\n" );
    }
}
