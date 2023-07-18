package dev.sectionChallenge;

import java.util.Scanner;

public class MinElementQuiz {

    public static void main(String[] args) {
        int length = readInteger();
        int[] arr = readElements(length);
        System.out.println("Minimum value in array is " + findMin(arr));
    }

    private static int readInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int input = sc.nextInt();

        return input;
    }

//    private static  int[] readElements(int count){
//        Scanner sc = new Scanner(System.in);
//        int[] intArray = new int[count];
//        System.out.println("Enter "+count+" numbers");
//        for (int i=0;i<count; i+=1) {
//            int numbers = sc.nextInt();
//            sc.nextLine();
//            intArray[i] = numbers;
//        }
//        return intArray;
//    }

    private static int[] readElements(int value) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + value +  " integers separated by commas: ");
        String input = sc.nextLine();

        String[] values = input.split(",");
        int[] arr = new int[value];

        try {
            for (int i = 0; i < values.length; i++) {
                arr[i] = Integer.parseInt(values[i].trim());
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            System.out.println(error);
        }

        return arr;
    }

    private static int findMin(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        for(int i: arr) {
            if(i < minValue) {
                minValue = i;
            }
        }

        return minValue;
    }
}
