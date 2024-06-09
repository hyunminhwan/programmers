class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        //삼항연산자를 이용하여 값 구하기
        answer = flag==true ? a+b : a-b ;
        return answer;
    }
}