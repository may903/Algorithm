class Solution {
    public int solution(int price) {
        int answer = 0;
        if (500000 <= price){
            price*=0.8;
        }else if (300000 <= price){
            price*=0.9;
        }else if (100000 <= price){
            price*=0.95;
        }
        return (int) price;
    }
}