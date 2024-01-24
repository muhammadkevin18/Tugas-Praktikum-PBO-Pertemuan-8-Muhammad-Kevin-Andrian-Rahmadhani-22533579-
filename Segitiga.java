package com.mycompany.praktikum8;

// Class 'Segitiga'
public class Segitiga extends BangunDatar {
    // Attributes
    public int alas;
    public int tinggi;

    // Methods
    @Override
    public double hitungLuas() {
        return 0.5 * this.alas * this.tinggi;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Segitiga");
        System.out.println("--------");
        System.out.println("Luasnya: " + this.hitungLuas());
    }
}