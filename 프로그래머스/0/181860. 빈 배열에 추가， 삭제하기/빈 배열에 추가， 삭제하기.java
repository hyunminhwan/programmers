import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
            if(flag[i]==true){
                for(int j=0;j<arr[i];j++){
                    list.add(arr[i]);
                    list.add(arr[i]);
                }
            }else{
                for(int j=0;j<arr[i];j++){
                    list.remove(list.size()-1);
                }
            }
        }
        int[] answer =new int[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}