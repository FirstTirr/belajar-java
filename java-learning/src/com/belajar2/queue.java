package com.belajar2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class queue {
    String str;
    int num;
    public static void main(String[] args) {
        queue queue = new queue();
    }

    public queue() {
        try {
            LinkedList <Integer> list = new LinkedList<Integer>();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Jumlah Data : ");
            str = bf.readLine();
            if ((num = Integer.parseInt(str)) == 1) {
                System.out.println("anda menekan angka 1");
                System.exit(0);
            } else {
                for (int i = 1; i<= num; i++) {
                    System.out.print("masukkan elemen: " + i + " : ");
                    str = bf.readLine();
                    int n = Integer.parseInt(str);
                    list.add(n);
                }
            }
                System.out.println("\nisi queue: " + list);
                System.out.println("elemen pertama : " + list.removeFirst());
                System.out.println("elemen terakhir : " + list.removeLast());
                System.out.print("elemen tengah : ");
                while (!list.isEmpty()) {
                    System.out.print(list.remove() + " ");
                }
                System.out.println("");
        }catch (Exception e) {
            System.out.println(e.getMessage() + "adalah strig");
            System.exit(0);
        }
    }
}   
