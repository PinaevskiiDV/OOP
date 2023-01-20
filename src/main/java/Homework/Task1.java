package Homework;
import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        ex();


    }

    private static void ex() {

        int[] bigArray = new int[10];

                Random random = new Random();
        for (int i = 0; i < bigArray.length; i++) {
            bigArray[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(bigArray));

        int maxElement = 0;
        int minElement = bigArray[0];
        for (int num : bigArray) {
            if (num > maxElement){
                maxElement = num;
            }
            if(num < minElement){
                minElement = num;
            }
        }
        System.out.println("min element = " + minElement + ", max element = " + maxElement);
    }
}
