public class p0419 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4,6,7,8,0}));
        System.out.println(solution(new int[]{5,8,4,0,6,7,9}));
    }
    static int solution(int[] numbers) {
        int answer = 0;

        for(int i=0; i<10; i++)
            answer+=i;

        for(int i=0; i<numbers.length; i++)
            answer-=numbers[i];
        return answer;
    }
}
