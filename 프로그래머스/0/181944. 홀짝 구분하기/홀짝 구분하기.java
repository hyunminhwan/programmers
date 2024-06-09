import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //if문으로 홀짝 구별 출력
        if(n%2==0)
            System.out.println(n +" is even");
        else if(n%2==1)
            System.out.println(n +" is odd");
     
    }
}