import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] str =my_string.split("");
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.charAt(0));
        for(int i=1;i<str.length;i++){
           if(!(sb.toString().contains(str[i]))){
                sb.append(str[i]);
           }
        }
        
        return sb.toString();
    }
}