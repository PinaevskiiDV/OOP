package Homework;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        ex();
    }

    private static void ex() {
        int[] firstArray = new int[30];
        int val = 3;
        Random random = new Random();
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt(1,5);
        }
        System.out.println(Arrays.toString(firstArray));


        int iRith = firstArray.length - 1;

        for (int i = 0; i < firstArray.length + 1; i++) {
            if (iRith > i){
                if (firstArray[iRith] == val) {
                    iRith--;
                }
                if (firstArray[i] == val){
                    int temp = firstArray[iRith];
                    firstArray[iRith] = firstArray[i];
                    firstArray[i] = temp;
                    iRith--;
                    }
                }

            }
        System.out.println(Arrays.toString(firstArray));
        }

}


//
//for (int x: b) System.out.print(x+" ");
//        System.out.println();
//        transArr(b,3);
//        for (int x: b) System.out.print(x+" ");
//        System.out.println();