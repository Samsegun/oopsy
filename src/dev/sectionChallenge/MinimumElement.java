package dev.sectionChallenge;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int[] arr = readIntegers();

        System.out.println("Minimum number in input values is " + findMin(arr));
    }


    public static int[] readIntegers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a list of integers separated by commas: ");
        String enteredValues = sc.nextLine();

        String[] splits = enteredValues.split(",");
        int[] userArr = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            userArr[i] = Integer.parseInt(splits[i].trim());
        }

        sc.close();

        return userArr;
    }

    public static int findMin(int[] arr) {
        int minValue = arr[0];

        for(int i : arr) {
            if(i < minValue) {
                minValue = i;
            }
        }

        return minValue;
    }
}
