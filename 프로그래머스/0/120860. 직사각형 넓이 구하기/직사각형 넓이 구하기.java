class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int big1=dots[0][0];
        int big2=dots[0][1];
        int sm1=dots[0][0];
        int sm2=dots[0][1];
        for(int i=1; i<dots.length; i++){
            if(big1<dots[i][0]){
                big1=dots[i][0];
            }else if(big2<dots[i][1]){
                big2=dots[i][1];
            } 
            if(sm1>dots[i][0]){
                sm1=dots[i][0];
            }else if(sm2>dots[i][1]){
                sm2=dots[i][1];
            }
        }
        
        return (Math.abs(big1-sm1))*(Math.abs(big2-sm2));
    }
}

