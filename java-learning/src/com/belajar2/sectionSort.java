package com.belajar2;

public class sectionSort {

    private static int j;
    public static int[] selectionSort(int[] arr) {
        for(int i = 0; i<arr.length - 1; i++) {
            int index = i;
            for (int j = i+1; j<arr.length; j++);
                if (arr[j]<arr[index])
                    index = j;
                    int smallestVal = arr[index];
                    arr[index] = arr[i];
                    arr[i] = smallestVal;       
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 7, 8, 3, 99, 78,23};
        System.out.println("array sebelum selection sort");
        for (int i: arr1){
            System.out.print(i);
            System.out.print(", ");
        }
        System.err.println("\narray setelah selection sort");
        int[] arr2 = selectionSort(arr1);
        for (int i: arr2) {
            System.out.print(i);
            System.out.print(", ");
        }
    }
}