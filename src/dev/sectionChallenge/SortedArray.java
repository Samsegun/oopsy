package dev.sectionChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static void main(String[] args) {

//        System.out.println(Arrays.toString(sortIntegers(new int[]{106, 26, 81, 5, 15})));
        System.out.println(Arrays.toString(getIntegers(5)));
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] myArr = new int[number];

        System.out.println("Enter " + number + " integers:");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = scanner.nextInt();
        }

        scanner.close();
        return myArr;
    }

    public static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Element %d contents %d \n", i, arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int temp;
        boolean flag;

        do {
            flag = false;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                    flag = true;
                }
            }
        } while (flag);

        return arr;
    }
}
