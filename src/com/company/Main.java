package com.company;

public class Main {

    public static void main(String[] args) {

        InPlaceSorts z = new InPlaceSorts();


        int[] intarr = z.randomIntArr(10000);
        double[] Doublearr = z.IntToDouble(intarr);
        String[]  Stringarr = z.IntToString(intarr);


        long time = System.nanoTime();
        z.insertionSort(intarr);
        time = System.nanoTime() - time;
        System.out.println("Time Taken - Insertion Sort: "+ time + " nano seconds");

        long time2 = System.nanoTime();
        z.selectionsort(Doublearr);
        time2 = System.nanoTime() - time2;
        System.out.println("Time Taken - Selection Sort: "+ time2 + " nano seconds");


        long time3 = System.nanoTime();
        z.bubbleSort(Stringarr);
        time3 = System.nanoTime() - time3;
        System.out.println("Time Taken - Bubble Sort: "+ time3 + " nano seconds");



    }
}