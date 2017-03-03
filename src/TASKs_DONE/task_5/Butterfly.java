package TASKs_DONE.task_5;

import java.util.Scanner;

/**
 * Created by Admin on 16.12.2016.
 */
public class Butterfly {

    public static void butterfly(){

        System.out.println("Input a number: ");
        Scanner scanner = new Scanner (System.in);
        int num = scanner.nextInt();
        int arr[][] = new int[num][num];

        int i, j;

        for (i = 0; i < (arr.length / 2 + 1); i++) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j < i) || (j >= (arr[i].length - i))) {
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = 1;
                }
            }

        }

        for (i = arr.length - 1; i >= (arr.length / 2); i--) {
            for (j = 0; j < arr[i].length; j++) {
                if ((j > i) || (j < (arr[i].length-1-i))) {
                    arr[i][j] = 0;
                }else {
                    arr[i][j] = 1;
                }
            }
        }

        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }

}