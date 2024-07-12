class Solution {
    public String solution(String n_str) {
        String answer = "";
        int num =0;
        for(int i=0;i<n_str.length();i++){
            if(n_str.charAt(i)!='0'){
                num=i;
                break;
            }
        }
        return answer=n_str.substring(num,n_str.length());
    }
}