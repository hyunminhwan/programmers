import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        int num = 0;
		String[] str=myStr.split("[a-c]");
        List<String> list =new ArrayList<>();
	        for(int i=0;i<str.length;i++){
	            if(!str[i].isEmpty()){
	            	list.add(str[i]);
	            }
	        }
            if(list.isEmpty()){
            list.add("EMPTY");
            }
	        String[] answer=list.toArray(new String[0]);
            
        return answer;
    }
}