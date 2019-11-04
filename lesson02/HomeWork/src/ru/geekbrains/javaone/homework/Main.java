package ru.geekbrains.javaone.homework;

import java.util.Arrays;
import java.util.Random;

public class Main {
private static void swap(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            arr[i] = 0;
        } else {
            arr[i] = 1;
        }
    }
}
private static void fill(int[] arr1){
    int step = 3;
    for (int i = 0; i< arr1.length; i++) {
        arr1[i] = step - 2;
        step = step + 3;
    }
}
private static void multiplication(int[] arr2) {
    for (int i = 0; i < arr2.length; i++) {
        if (arr2[i] < 6) {
            arr2[i] = arr2[i] * 2;
        }
    }
}
private static int min(int[] arr3) {
    int m = arr3[0];
    for (int i = 0; i < arr3.length; i++) {
        if (arr3[i] < m) {
            m = arr3[i];
        }
    }
    return m;
}
private static int max(int[] arr3) {
    int ma  = arr3[0];
    for (int i = 0; i < arr3.length; i++) {
        if (arr3[i] > ma) {
            ma = arr3[i];
        }
    }
    return ma;
}

    public static void main(String[] args) {

	int[] arr = {0, 1, 0, 1, 0, 0, 0, 1};
    swap(arr);
    System.out.println(Arrays.toString(arr));

    int[] arr1 = new int[8];
    fill(arr1);
    System.out.println(Arrays.toString(arr1));

    int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
    multiplication(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = {1, -3, 3, 4};
//    Random rnd = new Random();
//    for (int i = 0; i < arr3.length; i++) {
//       arr3[i] = rnd.nextInt(18);
//    }
    System.out.println("Минимальное значение в массиве: " + min(arr3));
    System.out.println("Максимальное значение в массиве: " + max(arr3));

        int [][] arr4 = new int[4][4];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (i == j)
                    arr4[i][j] = 1;
                System.out.print(arr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
