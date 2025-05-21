package com.belajar2;

public class array2d {
    public static void main(String[] args) throws Exception {
       int[][] pixel = new int[3][3];
        pixel[0][0] = 70;
        pixel[0][1] = 30;
        pixel[0][2] = 45;
        pixel[1][0] = 75;
        pixel[1][1] = 66;
        pixel[1][2] = 89;
        int i, j;
        for (i=0; i<2; i++) {
            for (j=0; j<3; j++)
            
            System.out.print(pixel[1][j] + " ");
            System.out.println("");
        }
    }
}
