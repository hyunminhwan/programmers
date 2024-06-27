class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        String str="";
       
        for(int i=0;i<parts.length;i++){
            int[] num=parts[i];
            int no1 = num[0];
            int no2 = num[1];
             str=my_strings[i].substring(no1,no2+1);
            answer+=str;
        }
        return answer;
    }
}