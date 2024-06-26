import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = new int[queries.length];
        for(int i=0; i<queries.length;i++){
        ArrayList<Integer> min =new  ArrayList<Integer>();
            int[] num =queries[i];
            int no1 = num[0];
            int no2 = num[1];
            int no3 = num[2];
            
            for(int j=no1;j<=no2;j++){
                if(arr[j]>no3){
                    min.add(arr[j]);
                }
            }
            if(min.size()>0){
            Collections.sort(min);
             answer[i]=min.get(0); 
            }else{
                answer[i]=-1;
            }
     
        }

        return answer;
    }
}