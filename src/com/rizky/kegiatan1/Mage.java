package com.rizky.kegiatan1;

public class Mage extends Hero {
    
    Mage(String name, int power, int health){
        super(name, power, health);
        name = this.namaHero;
        power = this.power;
        health = this.health;
    }

    public void healing() {
        System.out.println("[+] " + this.namaHero + " healed with " + this.health * 2 + " mana\n");
    }
}
