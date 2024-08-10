import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int no =numbers[0]*numbers[1];
        int no1 =numbers[numbers.length-1]*numbers[numbers.length-2];
        return no>no1 ? no:no1;
    }
}