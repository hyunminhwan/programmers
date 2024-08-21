class Solution {
    public int[][] solution(int n) {
        int[][] answer =new int[n][n];
        int start = 0;
        int end=n-1;
        int start2 = 0;
        int end2 = n-1;
        int i=0;
        int no=0;
        while(i<=n*n){
            for(int j=start; j<=end;j++){
                answer[start][j]=no++;
                i++;
            }
            start++;
            
            for(int j=start;j<=end;j++){
                answer[j][end]=no++;
                i++;
            }
            end--;
            
            for(int j=end;j>=start2;j--){
                answer[end2][j]=no++;
                i++;
            }
            end2--;
            for(int j=end2;j>start2;j--){
               answer[j][start2]=no++;
                i++;
            }
            start2++;
        }
        
        
        return answer;
    }
}
//숫자는 1~ n*n
//n n-1 n-1 n-2 n-2 ...1 1 될때 까지
//[0][0] [0][1] [0][2] [0][3] 
//[1][3] [2][3] [3][3] 
//[3][2] [3][1] [3][0] 

//[2][0] [1][0] 

//[1][1] [1][2]
//[2][2]
//[2][1]