public class p0331 {
    public static void main(String[] args){
        System.out.println(solution("1111114444"));
    }

    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder(phone_number);

        for(int i=0; i<phone_number.length()-4; i++)
            sb.setCharAt(i,'*');

        return sb.toString();
    }
}
