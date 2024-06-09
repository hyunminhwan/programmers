class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        //if 문으로 number가 n의 배수이면서 m의 배수 
        if(number%n==0 && number%m==0){
            answer=1;
        }else{
            answer=0;
        }
        return answer;
    }
}