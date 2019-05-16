import java.util.Scanner;

public class Lecture4_task4 {
    public static void main(String[] args) {

        Scanner k = new Scanner (System.in);
        System.out.println("blank 2 material numbers");
        int x = k.nextInt();
        int y = k.nextInt();
        if (x > 100 || y > 100) {
            System.out.println("0");
        } else if (x > 0 && y > 0) {
            System.out.println("2");
        } else if (x > 0 && y < 0) {
            System.out.println("4");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x < 0 && y < 0) {
            System.out.println("3");
        } else if (x > 0 && y < 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
