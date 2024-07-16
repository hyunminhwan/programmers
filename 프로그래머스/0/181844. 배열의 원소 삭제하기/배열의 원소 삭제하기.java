import java.util.*;
class Solution {
    public  List<Integer> solution(int[] arr, int[] delete_list) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<arr.length;i++){
           list.add(arr[i]);
        }
        for(int i=0;i<delete_list.length;i++){
            for(int j=0;j<list.size();j++){
                if(delete_list[i]==list.get(j)){
                    list.remove(j);
                }
            }
        }
        
        return list;
    }
}