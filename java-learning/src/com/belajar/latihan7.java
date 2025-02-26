package com.belajar;
import java.util.Scanner;

public class latihan7 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        //mengolah data sederhana dengan scanner
        int  NIP;
        String Alamat, Email, Nama;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA SEKOLAH");
        System.out.println("----------");
        
        System.out.print("Email : ");
        Email = Input.nextLine();
        
        System.out.print("Nama : ");
        Nama = Input.nextLine();
        
        System.out.print("Alamat : ");
        Alamat = Input.nextLine();
        
        System.out.print("NIP : ");
        NIP = Input.nextInt();
        
        //menampilkan data 
        System.out.println("\nDATA SEKOLAH");
        System.out.println("----------");

        System.out.println("Email : " + Email);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("NIP : " + NIP);
    }
}
