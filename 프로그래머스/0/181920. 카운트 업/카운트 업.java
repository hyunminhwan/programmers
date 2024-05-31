class Solution {
    public int[] solution(int start_num, int end_num) {
       //배열 크기 만들기
        int a =end_num-start_num+1;
        //배열선언
        int[] answer = new int[a];
        int index=0;
        //for문으로 숫자입력하기
        for(int i=start_num;i<=end_num;i++){
            answer[index++]=i;
        }
        return answer;
        
    }
}