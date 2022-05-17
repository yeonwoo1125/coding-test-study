import java.util.Arrays;

public class p0517 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[]{5, 9, 7, 10}, 5)));
        System.out.println(Arrays.toString(solution(new int[]{2, 36, 1, 3}, 1)));
        System.out.println(Arrays.toString(solution(new int[]{3, 2, 6}, 10)));
    }
    static int[] solution(int[] arr, int divisor) {
        int answer[] = Arrays.stream(arr).filter(ele->ele % divisor == 0).toArray();
        if(answer.length == 0) return new int[]{-1};

        Arrays.sort(answer);
        return answer;
    }
}
