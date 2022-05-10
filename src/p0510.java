public class p0510 {
    public static void main(String[] args){
        System.out.println(solution(5,24));
    }
    static String solution(int a, int b) {
        String[] day = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        int select = 0;

        for(int i = 0; i < a-1; i++){
            select += date[i];
        }
        select += b - 1;

        return day[select % 7];
    }
}
