class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String str =""+num; //num을 String으로 변환 
        char[] ch = str.toCharArray();//다시 char[]에 변환
        for(int i=0;i<ch.length;i++){
            //k+'0'로 char로 변환하여 비교
            if(ch[i]==k+'0'){
                answer=i+1;
                break;
            }
            }
        return answer;
        }
        
    }
