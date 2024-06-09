class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        //맨앞 문자가 같은지 startsWith 사용하기
        if(my_string.startsWith(is_prefix)){
            answer=1;
        }else{
            answer=0;
        }
        
        
        return answer;
    }
}