import java.util.*;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //answer int[] 선언
        int[] answer = new int[queries.length];
        //for문으로 queries에 있는 열에있는 수 꺼내기
        for(int i=0; i<queries.length;i++){
        ArrayList<Integer> min =new  ArrayList<Integer>();
            int[] num =queries[i];
            //수 각각 넣기
            int no1 = num[0];
            int no2 = num[1];
            int no3 = num[2];
            //k보다 큰수 찾기
            for(int j=no1;j<=no2;j++){
                if(arr[j]>no3){
                    min.add(arr[j]);
                }
            }
            //k보다 큰수 & 그중에서 작은수 찾고 아무것도 없으면 -1리턴
            if(min.size()>0){
            Collections.sort(min);
             answer[i]=min.get(0); 
            }else{
                answer[i]=-1;
            }
     
        }

        return answer;
    }
}