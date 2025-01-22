package com.belajar;

public class latihan3 {
    public static void main(String[] args) {
        int A = 60;
        int B = 80;
        int C = 40;
        boolean a = A < B && B > C || C < B;
        boolean b = A < B || B > C && C < B;
        System.out.println(a);
        System.out.println(b);
        
    }
}
