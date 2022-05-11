public class p0512 {
    public static void main(String[] args){
        System.out.println(solution(6));
        System.out.println(solution(16));
        System.out.println(solution(626331));
    }
    static long solution(long num) {
        int answer = 0;

        while(num != 1){
            if(answer > 500){
                answer = -1;
                break;
            }
            if(num%2==0) num = num/2;
            else num = num*3 + 1;
            answer++;
        }

        return answer;
    }
}
