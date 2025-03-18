import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = -1;
        double sqrt = Math.sqrt(n);
        
        if((Math.pow((int)sqrt, 2)) == n){
            answer = (long)Math.pow((sqrt+1), 2);
        }
        
        return answer;
    }
}