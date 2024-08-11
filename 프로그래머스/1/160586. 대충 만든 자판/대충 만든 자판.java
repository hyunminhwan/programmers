import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        for(int i=0;i<targets.length;i++){
            int no = 0;
            for(int j=0; j<targets[i].length();j++){
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int x=0; x<keymap.length; x++){
                    if(keymap[x].contains(String.valueOf(targets[i].charAt(j)))){
                        list.add(keymap[x].indexOf(String.valueOf(targets[i].charAt(j)))+1);
                    }
                    
                }
                if(list.size()>0){
                Collections.sort(list);
                no+=list.get(0);
                }else{
                    no=-1;
                    break; 
                }
            }
            if(no>0){
                answer[i]=no;
            }else{
                answer[i]=-1;
            }
           
        }
        
        return answer;
    }
}
/*
    keymap ABACD BCEFD 자판 편리한
            1키   2키
            1  + 1 +2 +5=9
            1 +1+ 1+1 =4
    targets ABCD
*/