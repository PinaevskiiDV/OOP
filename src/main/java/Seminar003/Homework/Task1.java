package Seminar003.Homework;

import java.util.*;


public class Task1 {
    public static void main(String[] args) {
        List<Integer> newArray = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            newArray.add(random.nextInt(0, 100));
        }
        System.out.println(newArray);
        for (int i = 0; i < newArray.size(); i++) {
            if (newArray.get(i) % 2 != 0) {
                newArray.remove(i);
                i--;
            }
        }
        System.out.println(newArray);

    }

}
