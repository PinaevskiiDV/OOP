package Homework;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        ex();
    }

    private static void ex() {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int data = iScanner.nextInt();
        iScanner.close();

        boolean x = data % 400 == 0 || data % 4 == 0 && data % 100 != 0;

        System.out.println(x);
    }
}
