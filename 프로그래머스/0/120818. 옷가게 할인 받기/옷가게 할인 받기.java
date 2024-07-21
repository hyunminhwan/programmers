
class Solution {
    public int solution(int price) {
        int answer =0;
        double dob = price;
        if(price<300000 && price>=100000){
           dob =price-(price*0.05);
        }else if(price>=300000 && price<500000){
           dob =price-(price*0.1);
            
        }else if(price>=500000){
            dob =price-(price*0.2);
        }
        
        return answer=(int)dob;
    }
}