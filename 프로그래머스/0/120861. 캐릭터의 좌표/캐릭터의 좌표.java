class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        
        for(int i=0;i<keyinput.length;i++){
            if(keyinput[i].equals("left")){
                if(Math.abs(answer[0])<board[0]/2||!keyinput[i].equals(keyinput[i-1])){
                      answer[0] -=1;
                }
            }else if(keyinput[i].equals("right")){
                if(Math.abs(answer[0])<board[0]/2||!keyinput[i].equals(keyinput[i-1])){
                      answer[0] +=1;
                }
            }else if(keyinput[i].equals("up")){
                if(Math.abs(answer[1])<board[1]/2||!keyinput[i].equals(keyinput[i-1])){
                      answer[1] +=1;
                }
            }else{
                 if(Math.abs(answer[1])<board[1]/2||!keyinput[i].equals(keyinput[i-1])){
                      answer[1] -=1;
                }
            }
        }
        return answer;
    }
}