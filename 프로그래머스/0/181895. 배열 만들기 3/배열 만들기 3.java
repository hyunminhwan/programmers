import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        
        ArrayList<Integer> sb =new ArrayList<Integer>();
        for(int i=0;i<intervals.length;i++){
            int no1 = intervals[i][0];
            int no2 = intervals[i][1];
            for(int j=no1;j<=no2;j++){
                   sb.add(arr[j]);
            }
        }
        int[] answer =new int[sb.size()];
        for(int i=0;i<sb.size();i++){
            answer[i]=sb.get(i);
        }
        return answer;
    }
}