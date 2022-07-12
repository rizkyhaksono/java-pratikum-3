package com.rizky.kegiatan2;

import java.util.Scanner;

import com.rizky.kegiatan2_child.Merk;

public class Main {
    public static void main(String[] args) {
        String input;

        Merk c = new Merk();

        c.display();
        c.Brand();

        Scanner scn = new Scanner(System.in);
        System.out.print("Mengulagi? [y/n] : ");
        input = scn.nextLine();

        switch(input) {
            case "y":
                new Merk();
                c.display();
                c.Brand();
                break;
            case "n":
                System.out.println("Terima Kasih");
                break;
            default:
                System.out.println("Input tidak valid");
                new Main();
                break;
        }

        scn.close();
    }

}
