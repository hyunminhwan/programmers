import java.util.*;
class Solution {
    public int[] solution(int n, int[] numlist) {
        //ArrayList 선언
        ArrayList<Integer> array= new ArrayList<Integer>();
        int count=0;
        //for문으로 n의 배수를 ArrayList에 담는다
        for(int i=0;i<numlist.length;i++){
            if(numlist[i]%n==0){
                array.add(numlist[i]);
                count++;
            }
        }
        //ArrayList에 담은 수를 다시 int[]에 넣는다
        int[] answer =new int[array.size()];
        for(int i=0;i<array.size();i++){
            answer[i]=array.get(i);
        }
        return answer;
    }
}