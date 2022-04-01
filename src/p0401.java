public class p0401 {
    public static void main(String[] args) {
        System.out.println(solution(100));
        System.out.println(solution(3));
    }

    public static long solution(long n) {

        double x = Math.sqrt(n);
        if (x == (int) x) {
            return (long) Math.pow((int) x + 1, 2);
        }
        return -1;
    }

}
