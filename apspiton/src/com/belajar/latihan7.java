package com.belajar;
import java.util.Scanner;

public class latihan7 {
    public static void main(String[] args) {
        //mengolah data sederhana dengan scanner
        int  NIP;
        String Alamat, Email, Nama;
        Scanner Input = new Scanner(System.in);
        System.out.println("DATA SEKOLAH");
        System.out.println("----------");
        
        System.out.print("Email : ");
        Email = Input.next();
        
        System.out.print("Nama : ");
        Nama = Input.next();
        
        System.out.print("Alamat : ");
        Alamat = Input.next();
        
        System.out.print("NIP : ");
        NIP = Input.nextInt();
        
        //menampilkan data 
        System.out.println("DATA SEKOLAH");
        System.out.println("----------");

        System.out.println("Email : " + Email);
        System.out.println("Nama : " + Nama);
        System.out.println("Alamat : " + Alamat);
        System.out.println("NIP : " + NIP);
    }
}
