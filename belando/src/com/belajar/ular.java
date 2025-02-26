package com.belajar;

public class ular extends Reptil {
    public static void main(String[] args) {
        Binatang b = new Binatang();
        Reptil r = new Reptil();
        ular u = new ular();
    
        System.out.println(r instanceof Binatang);
        System.out.println(u instanceof Reptil);
        System.out.println(u instanceof Binatang);
        
    }
}
