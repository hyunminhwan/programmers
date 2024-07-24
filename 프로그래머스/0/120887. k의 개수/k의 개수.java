class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n=i; n<=j; n++){
             String b=""+n;
            int no =n;
            for(int m=0; m<b.length();m++){
                if(no%10==k){
                    answer++;
                }
                no=no/10;
            }
        }
        return answer;
    }
}
//1 10 11 12 13
//