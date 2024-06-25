import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        //int 배열에  a,b,c,d 넣기
        int[] arr = {a,b,c,d};
        //sort로 정렬
        Arrays.sort(arr);
        //정렬한수를 다시 a b c d 순서대로 넣기
        a=arr[0];b=arr[1];c=arr[2];d=arr[3];
        //삼항 연산자 사용
       answer= 
           //모두가 같을때
        (a==d) ? 1111*a :
        //한개만 다를때
        (a==c&&a!=d) ? (10*a+d)*(10*a+d):
        (d==b&&a!=d) ? (10*d+a)*(10*d+a):
        //두개씩 같을때
        (a==b&&c==d) ? (a+c)*Math.abs(a-c):
        //두개만 같을때
        a==b? c*d :
        b==c? a*d :
        c==d? a*b :
        //모두 다를때
        a;
        
         
        
        return answer;
    }
}