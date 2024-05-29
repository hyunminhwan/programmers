class Solution {
    public int solution(int a, int b) {

	 String answer = "";
	 int answer1 = 0;
     String int1=answer+a+b;
     String int2=answer+b+a;
     int c = Integer.parseInt(int1);
     int d = Integer.parseInt(int2);
        
         if(c>d) {
        	 answer1=c;
         }else if(d>c) {
        	 answer1=d;
         }else{
             answer1=c;
         }
            return answer1;
    
    }
}