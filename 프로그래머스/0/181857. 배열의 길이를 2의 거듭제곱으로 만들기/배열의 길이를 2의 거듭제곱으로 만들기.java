class Solution {
    public int[] solution(int[] arr) {
        int num=0;
        for(int i=0;i<=10;i++){
            if(arr.length>num){
               num=(int)(Math.pow(2,i));
            }else if(arr.length==num){
                num=arr.length;
                break;
            }
            
        }
        int[] answer = new int[num];
           for(int i=0;i<arr.length;i++){
               answer[i]=arr[i];
               }
        return answer;
           }
}