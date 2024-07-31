import java.util.*;
class Solution {
    public ArrayList<Integer> solution(String str) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>=48&&str.charAt(i)<=71){
                list.add(str.charAt(i)-'0');
            }
        }
        Collections.sort(list);
        return list;
    }
}