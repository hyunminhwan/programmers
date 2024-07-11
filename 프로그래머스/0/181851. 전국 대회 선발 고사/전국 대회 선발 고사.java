import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int length = 0;
        for(int i=0;i<attendance.length;i++){
            if(attendance[i]){
                length++;
            }
        }
        int[] arr = new int[length];
        int count =0;
        String[] str = new String[rank.length];
        for(int i=0;i<rank.length;i++){
            if(attendance[i]){
               arr[count++]=rank[i];
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<rank.length; i++){
            str[i]=Integer.toString(rank[i]);
        }
         int num1 = Arrays.asList(str).indexOf(new String(Integer.toString(arr[0])));
        System.out.println(num1);
         int num2 = Arrays.asList(str).indexOf(new String(Integer.toString(arr[1])));
         int num3 = Arrays.asList(str).indexOf(new String(Integer.toString(arr[2])));
        
        
    return answer=(num1*10000)+(num2*100)+num3;
    }
}