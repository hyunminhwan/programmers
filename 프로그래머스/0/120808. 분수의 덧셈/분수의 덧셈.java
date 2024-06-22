class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer =new int[2];
        //부모수구하기
        int num1=denom1*denom2;
        //분자수구하기
        int num2=(numer1*denom2)+(denom1*numer2);
        //최대공약수 구하기
        int gcdnum=gcd(num1,num2);
        //분자 분모 나누기
        num1 /= gcdnum;
        num2 /= gcdnum;

        answer[1]=num1;
        answer[0]=num2;
        return answer;
    }
    //최대공약수 구하는 함수식
  static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}