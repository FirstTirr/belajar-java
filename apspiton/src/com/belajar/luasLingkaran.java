package com.belajar;
import java.util.Scanner;
public class luasLingkaran {
    public static void main(String[] args) {
        luasLingkaran lingkaran = new luasLingkaran();
        lingkaran.isi();
        lingkaran.hitung();
    }

    int jari;
    double phi = 3.14;
    Scanner scanner = new Scanner(System.in);

    void isi () {
        System.out.print("Masukkan jari-jari lingkaran: ");
        jari = scanner.nextInt();
    }

    void hitung () {
        double luas = phi * jari * jari;
        System.out.println("Luas lingkaran adalah: " + luas);
    }
}
