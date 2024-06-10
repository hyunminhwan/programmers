class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 1;
        //4가지 경우의 수를 if 문으로 넣고 삼항 연산자를 이용하여 1또는 0출력
        if(ineq.equals(">")&& eq.equals("=")){
           answer = n>=m ? 1:0; 
           
        }else if(ineq.equals("<")&& eq.equals("=")){
            answer = n<=m ? 1:0; 
            
        }else if(ineq.equals(">")&& eq.equals("!")){
            answer = n>m ? 1:0; 
            
        }else if(ineq.equals("<")&& eq.equals("!")){
            answer = n<m ? 1:0; 
            
        }
        
       
       return answer;
    }
}