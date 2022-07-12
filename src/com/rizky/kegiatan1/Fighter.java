package com.rizky.kegiatan1;

public class Fighter extends Hero {
    
    Fighter(String name, int power, int health){
        super(name, power, health);
        name = this.namaHero;
        power = this.power;
        health = this.health;
    }

    public void attack() {
        System.out.println("[+] " + this.namaHero + " attacked with " + (this.health + 20) + " power\n" );
    }
}
