package com.mycompany.praktikum8;

// Class 'BelahKetupat'
public class BelahKetupat extends BangunDatar implements Keliling, Simetri {
    // Attribute
    public int diagonal1;
    public int diagonal2;

    // Methods
    @Override
    public double hitungLuas() {
        return 0.5 * diagonal1 * diagonal2;
    }

    @Override
    public double hitungKeliling() {
        // Assuming it's a rhombus, where all sides are equal
        return 4 * Math.sqrt(0.25 * diagonal1 * diagonal1 + 0.25 * diagonal2 * diagonal2);
    }

    @Override
    public double hitungSimPutar() {
        return 180; // Angle of rotation for a rhombus
    }

    @Override
    public double hitungSimLipat() {
        return 2; // Number of symmetry lines for a rhombus
    }

    @Override
    public void tampilHasil() {
        System.out.println("Belah Ketupat");
        System.out.println("--------------");
        System.out.println("Luasnya: " + this.hitungLuas());
        System.out.println("Kelilingnya: " + this.hitungKeliling());
        System.out.println("Sim. Lipat: " + this.hitungSimLipat());
        System.out.println("Sim. Putar: " + this.hitungSimPutar());
    }
}
