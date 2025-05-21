package com.belajar2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
public class stack {
    String str;
    int num; 
    public static void main(String[] args) {
        stack s = new stack();
    }
    public stack() {
        try {
            Stack<Integer> stack = new Stack<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Jumlah Data :");
            str = bf.readLine();
            if (1 == (num = Integer.parseInt(str))) {
                System.out.println("anda menekan angka satu");
                System.exit(0);
            }
            else {
                for (int i = 1; i<= num; i++) {
                    System.out.print("masukkan elemen " + i + " : ");
                    str = bf.readLine();    
                    int n = Integer.parseInt(str);
                    stack.push(n);
                }
            }
            System.out.println("\nIsi stack : " + stack);
            System.out.println("elemen pertama : " + stack.pop());
            System.out.print("elemen tengah :" + stack);
        } catch (Exception e) {
            System.out.println(e.getMessage()+ "adalah string");
            System.exit(0);
        }
    }

}
