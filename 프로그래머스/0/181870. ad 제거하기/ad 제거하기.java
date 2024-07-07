import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        List<String> arr = new ArrayList<String>();
        for(int i=0;i<strArr.length;i++){
            if(!strArr[i].contains("ad")){
                arr.add(strArr[i]);
            }
        }
        String[] answer =arr.toArray(new String[0]);
        return answer;
    }
}