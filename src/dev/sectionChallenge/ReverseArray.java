package dev.sectionChallenge;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = new int[] {4,2,5,10,7,8};
//        System.out.println(Arrays.toString(arr));

        reverse(arr);
        System.out.println(Arrays.toString(arr));

        int[][] nestedArr = new int[3][3];
        int[][] nestedArr2 = new int[3][2];
        System.out.println(Arrays.deepToString(nestedArr2));
    }

    private static void reverse(int[] arr) {
        System.out.println("Array = " + Arrays.toString(arr));

        int temp;
        int halfWay = arr.length / 2;

        for(int i = 0; i < halfWay; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - (i + 1)];
            arr[arr.length - (i + 1)] = temp;
        }

        System.out.println("Array = " + Arrays.toString(arr));
    }
}
