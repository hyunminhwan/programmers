import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        //스캐너로 입력받기
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        //문자열 두개 연결
        System.out.print(str1.concat(str2));
       
    }
}