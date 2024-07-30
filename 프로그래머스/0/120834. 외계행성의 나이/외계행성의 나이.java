class Solution {
    public String solution(int age) {

        StringBuilder sb = new StringBuilder();
        String str = Integer.toString(age);
        char ch;
        for(int i=0;i<str.length();i++){
                ch =(char)((str.charAt(i))+49);
                sb.append(ch);
        }
        return sb.toString();
    }
}