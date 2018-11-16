package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void insertionsort(int [] arr){
        int j;
        for(int i = 0; i < arr.length; i++){
            j = i;
            while(j > 0 && arr[j-1] > arr[j]){
                swap(arr, j, j-1);
                j = j - 1;
            }
        }
    }

    public static void swap(int arr[],int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
