import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        List<Integer> list =new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        if(list.size()==0){
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        
        int count= 0;
        for(int i: list){
            answer[count++]=i;
        }
        
        return answer;
    }
}