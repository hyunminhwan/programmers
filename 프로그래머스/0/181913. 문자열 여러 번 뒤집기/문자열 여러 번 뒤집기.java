class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        String end="";
        StringBuffer buf = new StringBuffer(my_string);
       
        for(int i=0;i<queries.length;i++){
            answer=buf.substring(queries[i][0],queries[i][1]+1);
             StringBuffer endbuf = new StringBuffer(answer);
             StringBuffer revbuf = new StringBuffer();
            revbuf=endbuf.reverse();
           buf=buf.replace(queries[i][0],queries[i][1]+1,revbuf.toString());
        }
        end=String.valueOf(buf);
        return end;
    }
}