public class p0418 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{4,3,2,1}));
        System.out.println(solution(new int[]{10}));
    }
    static int[] solution(int[] arr) {
        int[] answer = {};
        if(arr.length==1) return new int[]{-1};

        int loc = 0;
        for(int i = 0; i < arr.length ; i++)
            if(arr[i]<arr[loc])
                loc = i;

        int index = 0;
        answer = new int[arr.length - 1];
        for(int i = 0; i < arr.length ; i++) {
            if(i==loc) continue;
            answer[index++] = arr[i];
        }

        return answer;
    }
}
