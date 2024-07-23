import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
       HashMap<String,Integer> hm = new HashMap<>();
        String[] ch = s.split("");
        for(int i=0; i<ch.length;i++){
            if(hm.get(ch[i])!=null){
                hm.put(ch[i],hm.get(ch[i])+1);
            }else{
                 hm.put(ch[i],1);
            }
        }
        Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){
            if(hm.get(ch[i])==1){
                answer+=ch[i];
            }
        }
        
        
        return answer;
    }
}