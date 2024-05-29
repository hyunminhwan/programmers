class Solution {
    public int[][] solution(int n) {
        //2차배열 선언 및 크기 할당
        int[][] answer = new int[n][n];
        //for 2중문으로 2차배열 안에 숫자 넣기
        for(int i=0;i<answer.length;i++){
            answer[i][i]=1;
        }return answer;
    }
}

/*
  [0][0] /[1][1]/[2][2]
*/