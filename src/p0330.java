public class p0330 {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4};
        System.out.println(solution(arr));

        int[] arr2 = new int[]{5,5};
        System.out.println(solution(arr2));
    }
    public static double solution(int[] arr) {
        double answer = 0;
        for(int val : arr)
            answer+=val;
        return answer/arr.length;
    }
}
