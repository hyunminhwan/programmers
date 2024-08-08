import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : array){
            map.put(n,map.getOrDefault(n, 0)+1);          
        }
        int n=0;
        List<Integer> kset = new ArrayList<Integer>(map.keySet());
        kset.sort((a,b)->map.get(b).compareTo(map.get(a)));
        if(kset.size()==1){
            answer=kset.get(0);
        }else if(map.get(kset.get(0))==map.get(kset.get(1))){
            answer=-1;
        }else{
            answer=kset.get(0);
        }
        
        
        return answer;
    }
}
