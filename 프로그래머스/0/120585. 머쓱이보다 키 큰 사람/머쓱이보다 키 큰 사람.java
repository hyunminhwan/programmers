class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        //for문을 이용하여 머쓱이의 키보다 큰사람을 찾는다
        for(int i=0;i<array.length;i++){
           if(array[i]>height){
               answer++;
            
           }
        }
        return answer;
    }
}