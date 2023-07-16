package dev.arrayChallenge;

import java.util.Arrays;
import java.util.Random;

public class Descending {

    public static void main(String[] args) {
        int[] intList = getRandomArray(10);
        System.out.println(Arrays.toString(intList));

        boolean flag;
        int temp;

        do {
            flag = false;
            for(int i = 0; i < intList.length - 1; i++) {
                if(intList[i] < intList[i + 1]) {
                    temp = intList[i];
                    intList[i] = intList[i + 1];
                    intList[i + 1] = temp;
                    flag = true;
                }
            }
        } while(flag);

        System.out.println(Arrays.toString(intList));
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
