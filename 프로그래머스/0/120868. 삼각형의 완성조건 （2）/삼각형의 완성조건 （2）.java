import java.util.*;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        int start=sides[1]-sides[0]+1;
        int end =sides[1]+sides[0];
        for(int i=start;i<=sides[1];i++){
            answer++;
        }
        for(int i=sides[1]+1;i<end;i++){
            answer++;
        }
        return answer;
    }
}