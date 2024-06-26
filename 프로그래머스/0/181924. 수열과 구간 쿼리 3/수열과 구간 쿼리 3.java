class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //for문으로 queries들어있는 수 추출 및 arr에 다시 넣기
        for(int i=0;i<queries.length;i++){
          int[] num =queries[i];
            //자리 바꾸기
          int qu1 = num[0];
          int qu2 = num[1];
            int no = arr[qu1];
            arr[qu1]=arr[qu2];
            arr[qu2]=no;
            
        }
        return arr;
    }
}