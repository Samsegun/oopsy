package dev.arrays;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] newArr = new int[] {4,3,2,1,5};
        System.out.println("newArr length is " + newArr.length);

        for(int i= 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

        double[] testArr = new double[4];

        int count = 1;
        for(int i = 0; i < testArr.length; i++) {
            testArr[i] = 3 * count;
            count++;
        }
        System.out.println(Arrays.toString(testArr));

        int[] lastArr = getRandomArray(10);
        System.out.println(Arrays.toString(lastArr));
        Arrays.sort(lastArr);
        System.out.println(Arrays.toString(lastArr));

        int[] secondArr = new int[4];
        System.out.println(Arrays.toString(secondArr));
        Arrays.fill(secondArr, 3);
        System.out.println(Arrays.toString(secondArr));

//        int[] thirdArr = getRandomArray(10);
//        System.out.println(Arrays.toString(thirdArr));
//
//        int[] thirdArrCopy = Arrays.copyOf(thirdArr, thirdArr.length);
//        System.out.println(Arrays.toString(thirdArrCopy));
//
//        Arrays.sort(thirdArrCopy);
//        System.out.println(Arrays.toString(thirdArr));
//        System.out.println(Arrays.toString(thirdArrCopy));

        String[] stringArr = {"abe", "jane", "mark", "ralph", "david"};
        Arrays.sort(stringArr);
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.binarySearch(stringArr, "zoo"));
    }

    private static int[] getRandomArray(int len) {

        Random random = new Random();
        int[] newInt = new int[len];
        for (int i = 0; i < newInt.length; i++) {
            newInt[i] = random.nextInt(100);
        }

        return newInt;
    }
}
