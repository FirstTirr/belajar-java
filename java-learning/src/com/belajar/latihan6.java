package com.belajar;
import java.util.Scanner;

public class latihan6 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //menoolah input adta sederhana 
        //menggunakan class scanner
        int NISN, Usia;
        String Nama, Alamat;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA SISWA");
        System.out.println("----------");
        
        System.out.print("NISN : ");
        NISN = Input.nextInt();
        
        System.out.print("Nama : ");
        Nama = Input.next();
        
        System.out.print("Alamat : ");
        Alamat = Input.next();
        
        System.out.print("Usia : ");
        Usia = Input.nextInt();
        
        //menampilkan data 
        System.out.println("DATA SISWA");
        System.out.println("----------");

        System.out.println("NISN : " + NISN);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("Usia : " + Usia);
    }
}
