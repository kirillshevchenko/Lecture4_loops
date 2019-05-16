public class Lecture4_task6 {
    public static void main(String[] args) {
        int a = 203;
        int b = 41;
        int c = 2;
        if (a > b && b > c) {
            System.out.println(b);
        } else if (b > a && a > c) {
            System.out.println(a);
        } else if (c > a && a > b) {
            System.out.println(a);
        } else if (b > c && c > a) {
            System.out.println(c);
        } else if (c > b && b > a) {
            System.out.println(b);
        } else if (a > c && c > b) {
            System.out.println(c);
        }
    }
}
