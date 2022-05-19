public class p0519 {
    public static void main(String[] args){
        System.out.println(solution("abcde"));
        System.out.println(solution("qwer"));
    }
    static String solution(String s) {
        int len = s.length();

        return len%2==0 ? s.substring(len/2-1, len/2+1) : s.substring(len/2,len/2+1);
    }
}
