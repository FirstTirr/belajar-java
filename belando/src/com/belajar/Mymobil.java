package com.belajar;
//latihan method static
public class Mymobil {
    //var static
    static String warna = "pink";
    static int tahun_Produksi = 1989;

    //methode static
    static void ubah() {
        warna = "biru";
    }

    static void tampil() {
        System.out.println(warna);
        System.out.println(tahun_Produksi);
    }

    public static void main(String[] args) {
        //pemanggilan methode static
        Mymobil.ubah();
        Mymobil.tampil();
    }
}
