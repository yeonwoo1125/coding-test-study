public class p0411 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4}));
        System.out.println(solution(new int[]{1,2,7,6,4}));
    }
    static int solution(int[] nums) {
        int answer = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }
}
