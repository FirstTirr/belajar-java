package com.belajar2;

public class array2d_3 {
    public static void main(String[] args) {
        char[][] papan = new char[2][2];
        
        papan[0][0] = 'X';
        papan[0][1] = 'O';
        papan[1][0] = 'O';
        papan[1][1] = 'X';
        
        System.out.println("Papan 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(papan[i][j] + " ");
            }
            System.out.println();
        }
    }
}