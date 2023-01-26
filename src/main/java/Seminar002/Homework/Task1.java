package Seminar002.Homework;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите строку для проверки на палиндром: ");
        String str = iScanner.nextLine();
        iScanner.close();

        System.out.print(palindrom(str));
    }

    private static boolean palindrom(String str) {
        int length = str.length();
        for (int i = 0; i < length/2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                return false;
            }

        }
        return true;
    }
}
