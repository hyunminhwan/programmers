import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer =new int[emergency.length];
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : emergency){
            list.add(i);
        }
        Collections.sort(list, Collections.reverseOrder());
        for(int i=0;i<emergency.length;i++){
            for(int j=0;j<list.size();j++){
                if(list.get(j)==emergency[i]){
                    answer[i]=j+1;
                }
            }
        }
        return answer;
    }
}
//76,24,3