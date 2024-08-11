class Solution {
    boolean solution(String s) {
        s=s.toLowerCase();
        int y = 0;
        int p = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='y'){
                y++;
            }else if(s.charAt(i)=='p'){
                p++;
            }
        }
        return y==p ? true:false;
    }
}