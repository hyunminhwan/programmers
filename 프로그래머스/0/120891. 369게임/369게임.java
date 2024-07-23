class Solution {
    public int solution(int order) {
        int answer = 0;
        int count = 0;
        while(order!=0){
           count=order%10;
               if(count==3||count==6||count==9){
                   answer++;
               }
            order=order/10;
        }
        return answer;
    }
}