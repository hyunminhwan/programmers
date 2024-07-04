import java.util.*;
class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = new String[todo_list.length];
        int count=0;
        for(int i=0;i<finished.length;i++){
            if(!finished[i]){
                answer[count]=todo_list[i];
                count++;
            }
        }
        return Arrays.copyOfRange(answer,0,count);
    }
}