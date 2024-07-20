class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int no =0;
        if(num%2==1){
            no=total/num-(num/2);
        }else{
            no=total/num-(num/2-1);
        }
        for(int i=0;i<num;i++){
            answer[i]=no+i;
        }
        return answer;
    }
}
//1 2 3 4 5 6 8 9