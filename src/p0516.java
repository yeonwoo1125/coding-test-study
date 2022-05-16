public class p0516 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{4,7,12}, new boolean[]{true, false, true}));
        System.out.println(solution(new int[]{1,2,3}, new boolean[]{false, false, true}));
    }
    static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0; i<signs.length; i++){
            if(!signs[i]) answer+= absolutes[i]*-1;
            else answer+=absolutes[i];
        }
        return answer;
    }
}
