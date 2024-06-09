class Solution {
    public int solution(int n) {
        int answer = 0;
        //for문 이용하기
       for(int i=1; i<=n;i++){
           //if 문으로 n의 짝수와 i의 짝수 조건으로 제곱의 합 구하기
           if(n%2==0 && i%2==0){
               answer += i*i;
               
            //n의 홀수와 i의 홀수 조건으로 홀수합 구하기
           }else if (n%2!=0 && i%2!=0){
               answer += i;
           }
       }
            
        
        return answer;
    }
}