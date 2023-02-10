package Seminar003.Homework;


import java.util.*;



public class Task2 {
    public static void main(String[] args) {
        List<Integer> newArray = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            newArray.add(random.nextInt(0, 100));
        }
        System.out.println(newArray);
        System.out.println("Максимальный элемент:  " + Collections.max(newArray));
        System.out.println("Миниимальный элемент:  " + Collections.min(newArray));
        System.out.printf("Среднее арифметическое всех элементов:  %.2f", average(newArray));

    }

    private static double average(List<Integer> newArray) {
        double sum = 0;
        for (int i = 0; i < newArray.size(); i++) {
            sum += newArray.get(i);
        }
        double average = sum / newArray.size();
        return average;
    }
}
