class Solution {
    public int[][] solution(int n) {
        int[][] answer =new int[n][n];
        int rowstart = 0;
        int rowend=n-1;
        int colstart = 0;
        int colend = n-1;
        int i=0;
        int no=1;
        while(i<n*n){
            for(int j=rowstart; j<=rowend;j++){
                answer[rowstart][j]=no++;
                i++;
            }
            rowstart++;
            
            for(int j=rowstart;j<=colend;j++){
                answer[j][colend]=no++;
                i++;
            }
            colend--;
            
            for(int j=colend;j>=colstart;j--){
                answer[rowend][j]=no++;
                i++;
            }
            rowend--;
            for(int j=rowend;j>=rowstart;j--){
               answer[j][colstart]=no++;
                i++;
            }
            colstart++;
        }
        
        
        return answer;
    }
}
//숫자는 1~ n*n
//n n-1 n-1 n-2 n-2 ...1 1 될때 까지
//[0][0] [0][1] [0][2] [0][3] 가로
//[1][3] [2][3] [3][3] 세로
//[3][2] [3][1] [3][0] 가로
//[2][0] [1][0] 세로

//[1][1] [1][2]
//[2][2]
//[2][1]