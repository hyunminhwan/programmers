class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        int index2 = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                index=i;
                break;
            }
        }
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                 index2= i;
                break;
            }
        }
        int count =0;
        int[] answer = new int[index2-index+1] ;
        if(index==0&&index2==0){
            answer[0]=-1;
            return answer;
        }else if(index==index2){
            answer[0]=arr[index];
        }else{
            for(int i=index;i<=index2;i++){
                answer[count++]=arr[i];
            }
        }
        return answer;
    }
}