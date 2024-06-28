import java.util.*;
class Solution {
    public String solution(String code) {
        StringBuilder ret =new StringBuilder();
        int mode=0;
        int idx =0;
        while(idx<code.length()){
            if(mode==0){
            //모드0에서1로 바꾸기
                if(code.charAt(idx)=='1'){
                    mode=1;
                    idx++;
                //짝수일때 ret에 code[idx]추가
                }else if(idx%2==0||idx==0){
                    ret.append(code.charAt(idx));
                    idx++;
                }else idx++;
        }else if(mode==1){
            //모드를 1에서0으로 바꾸기
            if(code.charAt(idx)=='1'){
                mode=0;
                idx++;
                //idx가 홀수 일때 ret에 code[idx]추가
            }else if(idx%2==1){
                ret.append(code.charAt(idx));
                idx++;
            }else idx++;
        }
        }
        //string으로 변환
        return ret.length()==0? "EMPTY":ret.toString();
    }
}