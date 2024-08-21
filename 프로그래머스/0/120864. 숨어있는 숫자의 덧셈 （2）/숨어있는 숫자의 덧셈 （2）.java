class Solution {
    public int solution(String my_string) {
        int answer = 0;
        my_string=my_string.replaceAll("[^0-9]"," ");
        String[] no = my_string.split(" ");
        
        for(int i=0;i<no.length;i++){
            System.out.println(no[i]);
            if(!no[i].equals("")){
            answer +=Integer.parseInt(no[i]);
            }
        }
        return answer;
    }
}