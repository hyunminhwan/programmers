class Solution {
    public int solution(int hp) {
        int answer = 0;
        int num =0;
        num=hp/5;
        answer+=num;
        num=(hp%5)/3;
        answer+=num;
        num=hp%5%3;
        answer+=num;
        return answer;
    }
}