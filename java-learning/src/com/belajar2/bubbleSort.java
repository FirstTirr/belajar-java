package com.belajar2;

public class bubbleSort {
    static void bubbleSort (int[] arr){
        int n = arr.length;
        int temp = 0;
        for (int i = 0; i<n; i++){
            for (int j = 1; j<(n-i); j++){
                if(arr[j-1]>arr[j]){
                    temp = arr[j-1];
                    arr[j -1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
     }
public static void main(String[] args){
    int arr[] = {2, 4, 5, 3, 9};
    System.out.println("array sebelum bubble sort");
    for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    bubbleSort(arr);
    System.out.println("array setelah bubble sort");
    for (int i = 0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
    }
}
}
