import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arr =new ArrayList<Integer>();
        for(int i=n; i>0;i--){
            if(n%i==0){
                arr.add(i);
            }
        }
        Collections.sort(arr);
        int[] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}