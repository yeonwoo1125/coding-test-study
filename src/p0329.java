public class p0329 {
    public static void main(String[] args){
        System.out.println(solution(5,2));
        System.out.println(solution(4,3));
    }

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        for (int i = 1; i <= n; i++)
            answer[i - 1] = x * i;
        return answer;
    }
}
