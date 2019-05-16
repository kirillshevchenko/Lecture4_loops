public class Lecture4_task5 {
    public static void main(String[] args) {
        int a = 137;
        int b = a / 100;
        int c = a % 10;
        if (b > c) {
            System.out.println(b);
        } else if (c > b) {
            System.out.println(c);
        } else {
            System.out.println("=");
        }
    }
}
