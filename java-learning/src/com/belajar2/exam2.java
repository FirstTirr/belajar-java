package com.belajar2;

class cobaHitung1 {
    double p, l;

    double hitung(double p, double l) {
        return(p*l);
    }
}
class cobaHitung2 {
    double a, t;
    double hitung(double a, double t) {
        return(a*t/2);
    }
}

public class exam2 {
    public static void main(String[] args) {
        cobaHitung1 datar = new cobaHitung1();
        System.out.println("Hitung Luas Persegi Panjang = " + datar.hitung(4, 10));
        cobaHitung2 segitiga = new cobaHitung2();
        System.out.println("HItung Segitiga = " + segitiga.hitung(10, 30));
    }
}
