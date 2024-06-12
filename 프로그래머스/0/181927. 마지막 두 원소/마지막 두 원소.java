class Solution {
    public int[] solution(int[] num_list) {
        //int 배열 선언
        int[] answer = new int[num_list.length+1];
        
        
        for(int i=0;i<answer.length;i++){
            //마지막 수 계산해서 배열 끝에 넣기
            if((answer.length-1)==i){
                 answer[i]= num_list[num_list.length-1] <=num_list[num_list.length-2] ?
                    (num_list[num_list.length-1]*2) : (num_list[num_list.length-1])-num_list[num_list.length-2] ;                       break;
            //앞에있는 수 배열에 넣기
            }else{
            answer[i]=num_list[i];   
            }
        }
        return answer;
    }
}