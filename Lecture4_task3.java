public class Lecture4_task3 {
    public static void main(String[] args) {
       int n=555;
        if (n>=100 && n<=1000) {
        int x = n / 100;
        int y = n - x * 100;
        int z = y / 20;
        int t = y - z * 20;
        int value = x * 100 + z * 30 + t * 2;
        System.out.println(value);
        }
        else if (n<100 && n>=10) {
            int z = n / 20;
            int t = n - z * 20;
            int value = z * 30 + t * 2;
            System.out.println(value);
        }
        else if (n<10 && n>0) {
            int value = n * 2;
            System.out.println(value);
        }
    }
}

