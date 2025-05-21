package com.belajar2;

//overloading
class cobaHitung {
    int p, l ;
    double r;

    int hitung(int p, int l){
        return (p*l);
    }
    double hitung(double r) {
        return(2*3.14*r);
    }
}

public class exam extends cobaHitung {
    public static void main(String[] args) {
        exam datar = new exam();
        System.out.println("HItung Persegi Panjang = " + datar.hitung(5, 2));
        System.out.println("Hitung Keliling Persegi Panjang = " + datar.hitung(7));
    }
}
