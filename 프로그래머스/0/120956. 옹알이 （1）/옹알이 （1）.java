class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str ={"aya","woo","ye","ma"};
        int index=0;
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<str.length;j++){
                babbling[i]=babbling[i].replace(str[j]," ").trim();
            }
            if(babbling[i].equals("")){
                answer++;
            }
        }
        return answer;
    }
}