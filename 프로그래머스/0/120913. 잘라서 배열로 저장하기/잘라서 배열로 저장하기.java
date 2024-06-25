class Solution {
    public String[] solution(String my_str, int n) {
        int size=0;
        //if 문으로 answer 배열 크기 만들기
        if(my_str.length()%n == 0){
            size=my_str.length()/n;
        }else{
            size=(my_str.length()/n) + 1;
        }    
        //answer 배열 선언
        String[] answer = new String[size];
        int index =0;
        //answer null값 초기화하기
        for(int i=0;i<answer.length;i++){
            answer[i]="";
        }
        //answer에 6개씩 담기
        for(int i=0;i<my_str.length();i++){
            answer[index] += my_str.charAt(i);
            if(answer[index].length()>=n) index++;
        }
        return answer;
    }
}