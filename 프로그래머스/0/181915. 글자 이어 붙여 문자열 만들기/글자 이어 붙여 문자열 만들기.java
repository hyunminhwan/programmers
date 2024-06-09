class Solution {
    public String solution(String my_string, int[] index_list) {
       //StringBuilder 선언
        StringBuilder answer = new StringBuilder();
        
        //for문을 이용하여 index 안에있는 번호대로 string 문자를 answer에 넣기
        for(int i=0;i<index_list.length;i++){
        answer.append(my_string.charAt(index_list[i]));
        }
        
        return answer.toString();
    }
}