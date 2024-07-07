class Solution {
    public String solution(String my_string, String alp) {
        String answer = alp.toLowerCase();
        String upper = alp.toUpperCase();
        System.out.println(answer);
        return my_string=my_string.replaceAll(answer,upper);
    }
}