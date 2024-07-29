import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        Arrays.sort(spell);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<spell.length;i++){
            sb.append(spell[i]);
        }
        
        for(int i=0; i<dic.length;i++){
            char[] ch = dic[i].toCharArray();
            Arrays.sort(ch);
            String str =new String(ch);
                if(str.contains(sb)){
                    answer=1;
                }
            }
        return answer;
    }
}