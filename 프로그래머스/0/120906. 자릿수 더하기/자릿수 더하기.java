class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = ""+n;
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++){
            answer += ch[i]-'0';
        }
        return answer;
    }
}