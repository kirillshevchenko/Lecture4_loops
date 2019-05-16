public class Lecture4_task7 {
    public static void main(String[] args) {
        int h1 = 13;
        int m1 = 04;
        int s1 = 04;
        int h2 = 19;
        int m2 = 30;
        int s2 = 43;
        long begin = h1 * 3600 + m1 * 60 + s1;
        long end = h2 * 3600 + m2 * 60 + s2;
        long duration = end - begin;
        long minutes = duration / 60;
        long s3 = duration - minutes * 60;
        long h3 = minutes / 60;
        long m3 = minutes - h3 * 60;
        System.out.println(h3 + ":" + m3 + ":" + s3);
    }
}
