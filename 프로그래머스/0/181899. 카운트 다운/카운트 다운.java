class Solution {
    public int[] solution(int start, int end_num) {
         int size = start - end_num + 1; 
        int[] answer = new int[size];
        int count=0;
        for(int i=start;i>=end_num;i--){
                answer[count] = i;
            count++;
        }
        return answer;
    }
}