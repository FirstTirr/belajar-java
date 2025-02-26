package com.belajar;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class latihan9 {
    public static void main(String[] args) throws IOException{
        String nama;
        int umur;
        //membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // Membuat objek BufferedReader
        BufferedReader br =  new BufferedReader(isr);

        // Mengisi vaeiabel nama dengan bufferedreader
        System.out.print("inputkan nama anda: ");
        nama = br.readLine();

        // Mengisi vaeiabel nama dengan bufferedreader
        System.out.print("inputkan umur anda : ");
        umur = Integer.parseInt(br.readLine());
        
        // Tampilkan output isi variabel nama
        System.out.println("nama anda adalah " + nama);

        // Menampilkan umur
        System.out.println("umur anda adalah " + umur);
    }
}
