import java.util.ArrayList;
import java.util.Arrays;

public class p0518 {
    public static void main(String[] args){
        System.out.println(Arrays.toString(solution(new int[]{1, 1, 3, 3, 0, 1, 1})));
        System.out.println(Arrays.toString(solution(new int[]{4,4,4,3,3})));
    }
    static int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int a = 10;
        for(int n : arr) {
            if(a != n)
                list.add(n);
            a = n;
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
