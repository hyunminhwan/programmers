import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
      ArrayList<String> arr =new  ArrayList<String>();
        int num=0;
        int count=0;
        for(int i=0;i<intStrs.length;i++){
            if(k<Integer.parseInt(intStrs[i].substring(s,s+l))){
            arr.add(intStrs[i].substring(s,s+l));
            }
        }
        int[] answer =new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[count++]=Integer.parseInt(arr.get(i));
        }
        return answer;
    }
}