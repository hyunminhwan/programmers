import java.util.*;
class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n!=0){
            list.add((int)(n%10));
            n=n/10;
        }
        return list;
    }
}