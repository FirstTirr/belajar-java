package com.belajar;
//latiahn method void
public class Mobil {
    String warna;
    int tahunProduksi;
    int nomorMesin;
    int nomorAngka;

    public static void main(String[] args) {
        Mobil mobilNiaga = new Mobil();

        //pemangggilan method void
        mobilNiaga.isi();
        mobilNiaga.tampil();
    }
    //mengisi var instance
    void isi(){
        warna = "sirah";
        tahunProduksi = 1990;
        nomorMesin = 5314335;
        nomorAngka = 97208326;
    }
    //menampilkan isi var
    void tampil(){
        System.out.println("warna mobil : "+ warna);
        System.out.println("tahun produksi : "+ tahunProduksi);
        System.out.println("nomor mesin : "+ nomorMesin);
        System.out.println("nomor angka : "+ nomorAngka);
    }
}
