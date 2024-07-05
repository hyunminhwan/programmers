class Solution {
    public int solution(int[] arr) {
        int answer = 0;
       
        while(true){
             boolean  brek =true; 
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=50 && arr[i]%2==0){
                    arr[i]=arr[i]/2;
                    brek= false;
                }else if(arr[i]<50 && arr[i]%2==1){
                    arr[i]=arr[i]*2+1;
                    brek=false;
                 }
            }
             if(brek)break;
            answer++;
        }
        return answer;
    }
}