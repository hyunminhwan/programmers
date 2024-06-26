class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                answer[i]=arr[i];
            }
            for(int i=0;i<queries.length;i++){
                int[] tem= new int[queries[i].length];
                    tem =queries[i];
                        int no1 = tem[0];
                        int no2 = tem[1];
                for(int j=no1;j<=no2;j++){
                        answer[j]++;
                }
        }
        return answer;
    }
}
//queries[2][3]