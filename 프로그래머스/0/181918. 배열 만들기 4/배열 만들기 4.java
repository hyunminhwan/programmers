import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> array =new ArrayList<>();
        int i =0;
        while(i<arr.length){
            if(array.size()==0){
                array.add(arr[i]);
                // System.out.println("1"+array);
                    i++;
            }else if(array.get(array.size()-1)<arr[i]){
                    array.add(arr[i]);
                // System.out.println("2"+array);
                    i++;
            }else if(array.get(array.size()-1)>=arr[i]){
                array.remove(array.size()-1);
                // System.out.println("3"+array);
            }
        }
        int[] stk =new int[array.size()];
        for(int j=0;j<array.size();j++){
            stk[j]=array.get(j);
        }
        
        
        return stk;
    }
}