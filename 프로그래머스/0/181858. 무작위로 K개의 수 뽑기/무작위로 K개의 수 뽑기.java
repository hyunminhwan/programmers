import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        LinkedHashSet<Integer> ls =new LinkedHashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(ls.size()!=k){
                ls.add(arr[i]);
            }
        }
        int index =0;
        for(int num : ls){
            answer[index++]=num;
        }
        if(ls.size()<k){
            for(int j=ls.size();j<k;j++){
                answer[j]=-1;
            }
        }
        return answer;
    }
}
//011223
//012
