package Seminar002.Homework;
import java.io.FileWriter;
import java.io.IOException;
public class Task2 {
    public static void main(String[] args) {
        test();
    }

    private static void test() {


        try (FileWriter fw = new FileWriter("test1.txt", false)){

                  for (int i = 0; i < 100; i++) {
                      fw.append("TEST");
                  }
                      fw.flush();
        }
                  catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
