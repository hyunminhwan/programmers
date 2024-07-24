import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int start =Math.abs(array[0]-n);
        for(int i=1;i<array.length;i++){
            if(start>=Math.abs(array[i]-n)){
                start=Math.abs(array[i]-n);
                if(Math.abs(array[i]-n)==Math.abs(array[i-1]-n)){
                     answer=array[i-1];
                }else{
                answer=array[i];
                }
            }
        }
        return answer;
    }
}