class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split(" ");
        
        for(int i=0;i<str.length;i++){
            if(str[i].equals("Z")){
                str[i]=str[i-1];
            answer-=Integer.parseInt(str[i]);
            }else{
            answer+=Integer.parseInt(str[i]);
            }        
        }
        return answer;
    }
}