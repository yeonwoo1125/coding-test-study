public class p0412 {
    public static void main(String[] args){
        int[] answer = solution(12345);
        for(int i=0; i< answer.length;i++){
            System.out.print(answer[i]+" ");
        }
    }
    static int[] solution(long n) {
        StringBuilder sb = new StringBuilder(Long.toString(n));
        String re = sb.reverse().toString();
        int[] answer = new int[re.length()];

        for(int i=0; i<answer.length; i++)
            answer[i] = re.charAt(i)-'0';

        return answer;
    }
}