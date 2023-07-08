package dev.lpa;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[10];
        myIntArray[5] = 50;

        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;

//        for (int j : myIntArray) {
//            System.out.println(j);
//        }
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        int arrLength = firstTen.length;
        System.out.println("last item in firstTen is " + firstTen[9]);

        int[] newArr = new int[] {4,3,2,1,5};
        System.out.println("newArr length is " + newArr.length);

        for(int i: newArr) {
            System.out.println(i);
        }
    }
}
