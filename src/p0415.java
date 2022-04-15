public class p0415 {
    public static void main(String[] args){
        System.out.println(solution(new int[]{1,2,3,4,5}));
        System.out.println(solution(new int[]{1,3,2,4,2}));
    }

    static int[] solution(int[] answers) {
        int[] answer;

        int[] one = new int[]{1,2,3,4,5};
        int[] two = new int[]{2,1,2,3,2,4,2,5};
        int[] three = new int[]{3,3,1,1,2,2,4,4,5,5};

        int[] score = new int[3];

        for(int i=0; i<answers.length; i++){
            if(answers[i] == one[i%5])  score[0]++;
            if(answers[i] == two[i%8])  score[1]++;
            if(answers[i] == three[i%10]) score[2]++;
        }

        int max = score[0];
        for(int i=0; i<3; i++){
            if(score[i] > max){ max = score[i]; }
        }

        int cnt = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max){ cnt++; }
        }

        answer = new int[cnt];
        int idx = 0;
        for(int i=0; i<3; i++){
            if(score[i] == max) answer[idx++] = i+1;
        }
        return answer;
    }
}
