package com.belajar;

import java.util.Scanner;

public class luasLingkaran {

    public static void main(String[] args) {
        luasLingkaran lingkaran = new luasLingkaran();
        try (Scanner scanner = new Scanner(System.in)) {
            int pilihan;

            do {
                System.out.println("1. luas lingkaran");
                System.out.println("2. keliling lingkaran");
                System.out.println("3. keluar");
                System.out.println("pilih menu");
                pilihan = scanner.nextInt();

                switch (pilihan) {
                    case 1:
                        lingkaran.hitungLuasLingkaran(scanner);
                        break;
                    case 2:
                        lingkaran.hitungKelilingLingkaran(scanner);
                        break;
                    case 3:
                        System.out.println("terima kasih");
                        break;
                    default:
                        System.out.println("pilihan tidak ada");
                        break;
                }
                System.out.println();
            } while (pilihan != 3);
        }
    }

    int jari, diameter;
    double phi = 3.14;

    void hitungLuasLingkaran(Scanner scanner) {
        System.out.print("Masukkan jari-jari lingkaran untuk menghitung luas: ");
        int jariLuas = scanner.nextInt();
        double luas = phi * jariLuas * jariLuas;
        System.out.println("Luas lingkaran adalah: " + luas);
    }

    void hitungKelilingLingkaran(Scanner scanner) {
        System.out.print("Masukkan diameter lingkaran untuk menghitung keliling: ");
        int diameterKeliling = scanner.nextInt();
        double keliling = phi * diameterKeliling;
        System.out.println("Keliling lingkaran adalah: " + keliling);
    }
}