import java.math.BigInteger;
class Solution {
    public String solution(String a, String b) {
    try {
            long c = Long.parseLong(a);
            long d = Long.parseLong(b);
            long sum = c + d;
            return Long.toString(sum);
        } catch (NumberFormatException e) {
            // 입력값이 long 타입의 범위를 초과할 경우 BigInteger를 사용
            BigInteger c = new BigInteger(a);
            BigInteger d = new BigInteger(b);
            BigInteger sum = c.add(d);
            return sum.toString();
        }
    }
}