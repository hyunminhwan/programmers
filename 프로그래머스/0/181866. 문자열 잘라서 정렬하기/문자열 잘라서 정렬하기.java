import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        
        String[] str = myString.split("x");
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            if(!str[i].isEmpty()){
                 list.add(str[i]);
            }
        }
        String[] answer=list.toArray(new String[0]);
        return answer;
    }
}