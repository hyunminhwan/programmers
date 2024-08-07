import java.util.*;
class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();

       for(int i=l;i<=r;i++){
           String sno = Integer.toString(i);
           for(int j=0;j<sno.length();j++){
               if(sno.charAt(j)=='1'||sno.charAt(j)=='2'||sno.charAt(j)=='3'||sno.charAt(j)=='4'||sno.charAt                    (j)=='6'||sno.charAt(j)=='7'||sno.charAt(j)=='8'||sno.charAt(j)=='9'){
                  break;
               }
               if(j==sno.length()-1)
               list.add(i);
           }
           
           
       }
        if(list.size()==0){
          list.add(-1);
        }
        int[] answer = new int[list.size()];
        
        int count = 0;
        for(int i :list){
            answer[count++]=i;
        }
        return answer;
    }
}
