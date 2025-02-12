package com.belajar;
//methode non void  
public class Mobilku {
    String warna_mobil;
    int tahun_produksi;
    int nomor_mesin;
    int nomor_angka;
    
    //methode mengisi var instance
    void isi(String warna_mobil, int tahun_produksi, int nomor_mesin, int nomor_angka){
        this.warna_mobil = warna_mobil;
        this.tahun_produksi = tahun_produksi;
        this.nomor_mesin = nomor_mesin;
        this.nomor_angka = nomor_angka;
    }
    //methode menampilkan isi var
    String ambil_warna (){
        return warna_mobil;
    }

    int ambil_tahun_produksi (){
        return tahun_produksi;
    }

    int ambil_nomor_mesin (){
        return nomor_mesin;
    }

    int ambil_nomor_angka (){
        return nomor_angka;
    }

    public static void main(String[] args) {
        Mobilku mobil_niaga = new Mobilku();
        //pemanggilan methode void
        mobil_niaga.isi( "pink", 1989, 123544, 9722465); 

        System.out.println("warna : "+ mobil_niaga.ambil_warna());
        System.out.println("tahun produksi :"+ mobil_niaga.ambil_tahun_produksi());
        System.out.println("nomor mesin :"+ mobil_niaga.ambil_nomor_mesin());
        System.out.println("nomor angka :"+ mobil_niaga.ambil_nomor_angka());
    }
}
