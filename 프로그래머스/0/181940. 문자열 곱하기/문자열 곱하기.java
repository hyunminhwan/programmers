class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        //for문으로 문자 이어 쓰기
         for (int i=0; i<k; i++) {
           answer += my_string;
         }System.out.print(answer);
        return answer;
        
        
    }
}