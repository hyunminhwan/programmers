class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //queries에 있는 수 int에 넣기
        for(int i=0;i<queries.length;i++){
            int start = queries[i][0];
            int end = queries[i][1];
            int k= queries[i][2];
            //if문으로  배열의 인덱스수가 k의 배수이면 +1씩 더하기
            for(int j=start;j<=end;j++){
                if(j%k==0)
                arr[j]++;
            }
        }
        return arr;
    }
}