import java.util.Scanner;

public class Lesson001 {


    public static void main(String[] args) {
//        ex1();
        ex2();


    }

    private static void ex2() {

        int[] arr = new int[] {1,1,1,0,0,1,1,1,1};
        int max = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {


            if (arr[i] == 1) {
                count++;
            }
            else {
                if (max < count)
                    max = count;
                count = 0;
            }
        }
        System.out.println("max lenght" + Math.max(max, count));
    }
//
//    private static void ex1() {
//        Scanner iScanner = new Scanner(System.in);
//        System.out.print("Имя: ");
//        String name = iScanner.nextLine();
//        System.out.printf("Привет, %s!\n", name);
//        iScanner.close();
//    }

}


