public class p0413 {
    public static void main(String[] args){
        System.out.println(solution(10));
        System.out.println(solution(11));
    }
    static boolean solution(int x) {
        String str = String.valueOf(x);
        int s = 0;
        for(int i=0; i<str.length(); i++)
            s+=str.charAt(i)-'0';
        if(x%s == 0 ) return true;
        else return false;

    }
}
