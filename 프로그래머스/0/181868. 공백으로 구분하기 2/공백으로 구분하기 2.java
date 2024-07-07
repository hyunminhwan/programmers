import java.util.*;
class Solution {
    public String[] solution(String my_string) {
         String[] str =my_string.split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i<str.length;i++){
            if(!str[i].isEmpty()){
                list.add(str[i]);
            }
        }
        String[] answer = list.toArray(new String[0]);
        return  answer;
    }
}