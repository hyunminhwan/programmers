import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
         String answer="";
             StringBuilder str =new StringBuilder(my_string);
            Arrays.sort(indices);
                for(int i=indices.length-1;i>=0;i--){
                    str.deleteCharAt(indices[i]);
                }
                    answer=str.toString();
        return answer;
        }
        
}