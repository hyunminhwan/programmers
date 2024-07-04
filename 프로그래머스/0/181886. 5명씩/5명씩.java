class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[1+((names.length-1)/5)];
        int count =0;
        for(int i=0;i<names.length;i+=5){
            answer[count++]=names[i];
        }
        return answer;
    }
}