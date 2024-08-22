class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int start = x;
        int num=0;
        while(x!=0){
            num+=x%10;
            x=x/10;
        }
        if(start%num!=0){
            answer=false;
        }
        return answer;
    }
}