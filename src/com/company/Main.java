package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size-1; i++) {
            array[i]= scanner.nextInt();
        }
        bubbleSort(array);

        for (int i = 0; i < size-1; i++) {
            if(array[i]-array[i+1]==2){
                System.out.println((array[i]+array[i+1])/2);
            }
        }
    }
    static void bubbleSort(int[] a){
        for(int i = 0; i<a.length;i++){
            for(int j = 0; i<a.length-1-i;i++){
                if(a[j]>a[i]){
                    int temp = a[j];
                    a[j] = a[i];
                    a[i]=temp;
                }
            }
        }
    }
}

