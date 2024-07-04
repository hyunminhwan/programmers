class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int sum1 = 0;
        for(int i=0;i<num_list.length;i++){
            if((i+1)%2==0){
                sum += num_list[i];
            }else{
                sum1 += num_list[i];
            }
        }
        return sum>sum1 ? sum:sum1;
    }
}