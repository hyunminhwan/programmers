class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        StringBuffer buf = new StringBuffer();
        for(int i=c-1;i<my_string.length();i+=m){
            buf.append(my_string.charAt(i));
        }
        return answer=buf.toString();
    }
}