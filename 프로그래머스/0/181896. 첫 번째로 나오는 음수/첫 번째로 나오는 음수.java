class Solution {
    public int solution(int[] num_list) {       
        int answer = 0;
        //for문으로 배열에 있는 숫자 가져오기
        for(int i=0;i<num_list.length;i++){
            //if문으로 배열안에 있는값중 음수 찾기
            if(num_list[i]<0){
                //음수 인 배열 index 찾아서 answer에 ibdex 번호 넣기
                answer=i;
                break;
            }else{
                //전부 양수면 -1 리턴
            answer=-1;
        }
        }
        return answer;
    }
}