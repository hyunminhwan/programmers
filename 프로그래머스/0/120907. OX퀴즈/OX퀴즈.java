class Solution {
    public String[] solution(String[] quiz) {
        String[] answer =new String[quiz.length];
        int count = 0;
        for(int i=0;i<quiz.length;i++){
            String[] str = quiz[i].split(" ");
            int no1 =Integer.parseInt(str[0]);
            int no2 =Integer.parseInt(str[2]);
            int no3 =Integer.parseInt(str[4]);
            switch(str[1]){
                case "+" : answer[count]= no1 + no2 == no3 ? "O":"X"; count++; break;
                case "-" : answer[count]= no1 - no2 == no3 ? "O":"X"; count++; break;
            }
        }
        return answer;
    }
}