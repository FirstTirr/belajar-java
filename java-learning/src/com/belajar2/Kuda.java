package com.belajar2;

public class Kuda extends Binatang {
    public void bersuara() {
        System.out.println("ngieeeh");
    }
    public static void main(String[] args) {
        Binatang kuda_poni = new Kuda();
        kuda_poni.bersuara();
    }
}
