import java.util.*;
class Solution {
    public long solution(long n) {
        StringBuilder sb =new StringBuilder();
        String[] str = (""+n).split("");
        Arrays.sort(str);
        for(int i=0;i<str.length;i++){
            sb.append(str[i]);
        }
        
        return  Long.parseLong(sb.reverse().toString());
    }
}