import java.util.Arrays;

public class p0421 {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"Jane","Kim"}));
    }
    static String solution(String[] seoul) {
        return "김서방은 "+ Arrays.asList(seoul).indexOf("Kim")+"에 있다";
    }
}
