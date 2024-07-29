class Solution {
    public int solution(int n, int k) {
        int answer = (n*12000)+(k*2000);
        n=(int)Math.floor(n/10);
        return answer-(n*2000);
    }
}