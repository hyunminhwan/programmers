import java.math.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String str= "";
        for(int i=0;i<=t.length()-p.length();i++){
            str=t.substring(i,i+p.length());
            BigInteger no = new BigInteger(str);
            BigInteger no2 = new BigInteger(p);
            if(no.compareTo(no2)<=0){
                answer++;
            }
        }
        return answer;
    }
}