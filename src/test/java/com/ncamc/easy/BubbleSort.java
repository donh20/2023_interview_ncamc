package com.ncamc.easy;

public class BubbleSort {

    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    swap(arr,i,j);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);

        System.out.println("Sorted array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}