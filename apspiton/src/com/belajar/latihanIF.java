package com.belajar;
import java.util.Scanner;

public class latihanIF {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = scanner.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah angka genap.");
        } else {
            System.out.println(angka + " adalah angka ganjil.");
        }
    }
}