import java.util.Scanner;

public class Lecture4_task8 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Введите кол-во квартир, подъездов, этажей и номер квартиры");
        int N = k.nextInt();
        int P = k.nextInt();
        int Q = k.nextInt();
        int K = k.nextInt();
        // N - квартиры, P - подъезды, Q - этажы, K - номер квартиры
/*        int N = 300;
        int P = 3;
        int Q = 10;
        int K = 1;*/

        int flatonblock = N / P;
        int flatonlevel = flatonblock / Q;
        int levelsinblock = flatonblock / flatonlevel;

        int p = 1, q = 1, u = flatonlevel, v = flatonblock;
        for (int kv = 1; kv <= K && K <= N && K > 0; ++kv) {
            if (kv > flatonblock) {
                ++p;
                flatonblock += v;
            }
            if (kv > flatonlevel) {
                ++q;
                flatonlevel += u;
                if (q > levelsinblock) {
                    q = 1;
                }
            }
        }
        if (K > N || K <= 0) {
            System.out.println("Дом не резиновый");
        } else {
            System.out.println(p + " " + q);
        }
    }
}
/*
        int p = K / flatonblock + (K % P == 0 ? 0 : 1); // 2
        int q = K % flatonblock == 0 ? Q : (K % flatonblock) / flatonlevel + (K % Q == 0 ? 0 : 1);
        Вариант решения арифметический
*/


