class Solution {
    public int countDigits(int num) {
        int n=num;
        int answer=0;
        while(n != 0){
            int digit= n % 10;
            if(num % digit== 0){
                answer++;
            }
            n= n/10;
        }
        return answer;
    }
}