import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
     ArrayList<Integer> list=new ArrayList<Integer>(); //홀수를 담을 list
        
        for(int i=1; i<=n; i+=2) {                        //1부터 매개변수n까지 2씩 더하면서 
            list.add(i);                                  //list에 추가
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
} 