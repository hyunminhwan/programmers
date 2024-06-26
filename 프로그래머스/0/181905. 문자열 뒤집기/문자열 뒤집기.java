class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str1 ="";
       String str=my_string.substring(s,e+1);
        for(int i=e-s;i>=0;i--){
           str1+=str.charAt(i);
        }
        answer=my_string.replace(str,str1);
        
        
        
        return answer;
    }
}