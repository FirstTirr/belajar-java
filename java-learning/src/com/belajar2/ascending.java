package com.belajar2;

public class ascending {
    
    // Method untuk mengurutkan array secara ascending
    public static void urutAscending(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // Swap elemen
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    // Method untuk menampilkan array
    public static void tampilArray(int[] arr) {
        for (int angka : arr) {
            System.out.print(angka + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // Contoh array
        int[] angka = {5, 3, 8, 1, 9, 2, 4};
        
        System.out.println("Array sebelum diurutkan:");
        tampilArray(angka);
        
        // Mengurutkan array
        urutAscending(angka);
        
        System.out.println("Array setelah diurutkan ascending:");
        tampilArray(angka);
    }
}
