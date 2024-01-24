package com.mycompany.praktikum8;

// Class 'Lingkaran'
public class Lingkaran extends BangunDatar implements Keliling, Simetri {
    // Attribute
    public int jejarin;

    // Methods
    @Override
    public double hitungLuas() {
        return Math.PI * this.jejarin * this.jejarin;
    }

    @Override
    public double hitungKeliling() {
        return 2 * Math.PI * this.jejarin;
    }

    @Override
    public double hitungSimPutar() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public double hitungSimLipat() {
        return Double.POSITIVE_INFINITY;
    }

    @Override
    public void tampilHasil() {
        System.out.println("Lingkaran");
        System.out.println("----------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
