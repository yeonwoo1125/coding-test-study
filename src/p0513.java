public class p0513 {
    public static void main(String[] args){
        System.out.println(solution(3,20,4));
    }
    static long solution(int price, int money, int count) {
        long answer = money;
        for(int i=1; i<=count;i++){
            answer-=i*price;
        }
        if(answer >0) answer = 0;
        return Math.abs(answer);
    }
}
