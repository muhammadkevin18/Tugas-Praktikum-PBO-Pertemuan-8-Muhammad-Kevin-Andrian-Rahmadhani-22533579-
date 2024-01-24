package com.mycompany.praktikum8;

// Class 'PersegiPanjang'
public class PersegiPanjang extends BangunDatar implements Keliling {
    // Attributes
    public int panjang;
    public int lebar;

    // Methods
    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.lebar + this.panjang);
    }

    @Override
    public void tampilHasil() {
        System.out.println("Persegi Panjang");
        System.out.println("--------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
    }
}
