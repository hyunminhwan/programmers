class Solution {
    public int solution(String number) {
        int[] in =new int[1];
       
        for(int i=0;i<number.length();i++){
            in[0]+=number.charAt(i)-'0';
        }
       int answer=in[0]%9;
        return answer;
    }
}