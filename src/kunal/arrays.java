package kunal;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

    public static void main(String[] args) {
        int[] rNos = {5,6, 7};

        Scanner sc = new Scanner(System.in);
        String[] arr = new String[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        System.out.println(Arrays.toString(arr));
    }
}
