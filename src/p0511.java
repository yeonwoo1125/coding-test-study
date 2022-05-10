public class p0511 {
    public static void main(String[] args){
        System.out.println(solution("one4seveneight"));
        System.out.println(solution("23four5six7"));
        System.out.println(solution("2three45sixseven"));
        System.out.println(solution("123"));
    }
    static int solution(String s) {
        String[] num = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < num.length; i++) {
            s = s.replaceAll(num[i], String.valueOf(i));
        }
        return Integer.parseInt(s);
    }
}
