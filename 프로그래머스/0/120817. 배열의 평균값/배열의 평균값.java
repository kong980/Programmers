class Solution {
    public double solution(int[] numbers) {
        int cnt = 0;
        
        for(int i: numbers){
            cnt += i;    
        }
        double answer = (double)cnt / numbers.length;
        return answer;
    }
}