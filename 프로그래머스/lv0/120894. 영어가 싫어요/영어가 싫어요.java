import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String [] num = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i=0; i<10; i++){
            numbers = numbers.replace(num[i],i+"");
        }
        answer = Long.parseLong(numbers);
        return answer;
    }
}