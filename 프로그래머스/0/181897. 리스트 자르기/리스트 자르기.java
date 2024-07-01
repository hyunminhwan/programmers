import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer =new int[num_list.length];
        int no=0;
        int count=0;
            switch(n){
                    
                case 1 :
                    for(int i=0;i<=slicer[1];i++){
                        answer[i]=num_list[i];
                        no++;
                       
                    } break;
                case 2 :
                    for(int i=slicer[0];i<num_list.length;i++){
                        answer[count++]=num_list[i];
                        no++;
                    } break;
                case 3:
                    for(int i=slicer[0];i<=slicer[1];i++){
                        answer[count++]=num_list[i];
                        no++;
                    } break;
                case 4:
                    for(int i=slicer[0];i<=slicer[1];i+=slicer[2]){
                         answer[count++]=num_list[i];
                        no++;
                    }    break;
            }
            answer=Arrays.copyOf(answer,no);
        
        return answer;
    }
}