import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        HashMap<Integer,Integer> map =new  HashMap<Integer,Integer>();
        for(int i=0;i<strArr.length;i++){
            map.put(strArr[i].length(),map.getOrDefault(strArr[i].length(),0) + 1);
        }
        return  answer=Collections.max(map.values());
    }
}