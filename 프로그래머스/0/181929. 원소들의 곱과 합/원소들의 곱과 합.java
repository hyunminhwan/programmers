class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int pd =1;
        int spd =0;
        
        //for문으로 원소의곱과 원소의합을 구하는식
        for(int i=0; i<num_list.length;i++){
            pd *= num_list[i];
             spd += num_list[i];
        }
        //spd를 한번더 곱하면서 원소의 합의제곱을 만들고
        //pd와 크기 비교하면 0/1 를 출력
        answer = spd*spd > pd ? 1:0 ;
       
        return answer;
    }
}