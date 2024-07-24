import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        String[] str1 =before.split("");
        String[] str2 =after.split("");
        Arrays.sort(str1);
        Arrays.sort(str2);
        before = String.join(",",str1);
        after = String.join(",",str2);
        if(before.equals(after)){
            answer=1;
        }
        return answer;
    }
}