import java.util.*;
class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> list =new ArrayList<String>(); 
        for(int i=0; i<picture.length; i++){
            String[] sp =picture[i].split("");
            String str = "";
            for(int j=0; j<sp.length;j++){
                str +=sp[j].repeat(k);
            }
            for(int j=0; j<k; j++){
                list.add(str);
            }
            
        }
        return list;
    }
}