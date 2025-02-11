package com.belajar;
import java.util.Scanner;
public class latihan10 {
    public static void main(String[] args) {
        double gula = 10000;
        double kopi = 15000;
        double susu = 16000;
        double teh= 5000;
        double garam= 2000;
        Scanner  scanner = new Scanner(System.in);

        System.out.println("gula, kopi, susu, teh, garam");

        System.out.print("pilih barang  : ");
        String pilihan = scanner.nextLine();
        double harga = 0;

        if (pilihan.equals("gula")) {
            harga = gula;
        } else if (pilihan.equals("teh")) {
            harga = teh;
        } else if (pilihan.equals("kopi")) {
            harga = kopi;
        } else if (pilihan.equals("susu")) {
            harga = susu;
        } else if (pilihan.equals("garam")) {
            harga = garam;
        } else {
            System.out.println("pilihan tidak valid ");
            scanner.close();
            return;
        }
        System.out.println(pilihan + " = " + harga);

        System.out.print("berapa? ");
        double input = scanner.nextDouble();

        double output = input * harga;

        System.out.println("harga nya  = " + output);

        scanner.close();
    }
}