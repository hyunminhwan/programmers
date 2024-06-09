class Solution {
    public int solution(int n, String control) {
        int answer = 0;
        char [] x = control.toCharArray();
        for(int i=0;i<x.length;i++){
        switch(x[i]){
            case 'w' :
                n+=1;
                break;
            case 's' :
                n-=1;
                break;
            case 'd' :
                n+=10;
                break;
            case 'a' :
                n-=10;
                break;
        }
        }
        return n;
    }
}