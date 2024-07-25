class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] avg = new double[score.length]; //int로 받으면 소수점을 날리기때문에 오류
        for(int i=0;i<score.length; i++){
        avg[i]=(score[i][0]+score[i][1])/2.0;  //평균값 구해서 넣기
        }
        for(int i=0;i<avg.length; i++){  
            int count=1;
            for(int j=0;j<avg.length;j++){    
                if(avg[i]<avg[j]){
                   count++;
                }
            }
            answer[i]=count;
        }
        return answer;
    }
}
//150 140 110 130
//150 150 80 190 190 200 40