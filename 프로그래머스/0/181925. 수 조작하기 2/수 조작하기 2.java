class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        //for문으로 numLog에 들어가는 숫자 두개를 빼서 입력값받기
        for(int i=0;i<numLog.length-1;i++){
            int a = (numLog[i+1]-numLog[i]);
            //받은 입력값을 switch  문에 넣어서 조작키값 받기
            switch(a){
                case 1 : 
                    answer += "w"; 
                    break;
                case -1 : 
                    answer += "s"; 
                    break;
                case 10 : 
                    answer += "d"; 
                    break;
                case -10 : 
                    answer += "a";
                    break;
            }
        }
        return answer;
    }
}