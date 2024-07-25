import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer =new int[numlist.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(numlist);
        for(int i : numlist){
            list.add(i);
        }
        for(int j=0; j<numlist.length;j++){
                int start =Math.abs(numlist[0]-n); 
                int count=0;
            for(int i=0;i<list.size();i++){
                 int abs =Math.abs(list.get(i)-n);
               if( start > abs){  
                   start=abs;
                   count=i;
               }else if(start == abs){
                    count=i;
               }
            }
             answer[j]=list.get(count);
             list.remove(count);
            
        }
        return answer;
    }
}
//1,2,3,4,5,6    111
//-3,-2,-1,0,2,1
//10000,10,16
//6,10,20,36,40,47,7000,10000 30
//24,20,10,6,10,17,