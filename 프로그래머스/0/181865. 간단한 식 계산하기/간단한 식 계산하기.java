import java.util.*;
class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] str=binomial.split(" ");
        System.out.println(str[1]);
        int num1=Integer.parseInt(str[0]);
        int num2=Integer.parseInt(str[2]);
        
        answer= str[1].equals("+") ? num1+num2 :
                str[1].equals("-") ? num1-num2 :
                str[1].equals("*") ? num1*num2 :0;
        return answer;
    }
}