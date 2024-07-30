import java.util.*;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int num=0;
        ArrayList<Integer> list =new ArrayList<Integer>();
        for(int i : numbers){
            list.add(i);
        }
        if(direction.equals("right")){
            num=list.get(list.size()-1);
            list.remove(list.size()-1);
            list.add(0,num);
        }else{
            num=list.get(0);
            list.remove(0);
            list.add(num);
        }
        for(int i=0; i<list.size();i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}