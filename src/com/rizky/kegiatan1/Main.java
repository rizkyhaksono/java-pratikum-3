package com.rizky.kegiatan1;

public class Main {
    public static void main(String[] args) {

        new Hero();
        Mage mage = new Mage("Lilia", 25, 25);
        Fighter fighter = new Fighter("Chou", 30, 20);
        Tank tank = new Tank("Hilda", 1, 50);

        mage.display();
        mage.healing();

        fighter.display();
        fighter.attack();

        tank.display();
        tank.defense();

        System.out.print("Masukkan nama hero anda : ");
    }
}
