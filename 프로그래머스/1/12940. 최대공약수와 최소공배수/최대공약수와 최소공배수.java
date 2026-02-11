class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int min = 1;
        
        for(int i=2; i<= n; i++){
            if((n % i == 0) && (m % i == 0)){
                min = i;
            }
        }
        
         answer[0] = min;
        answer[1] = ((n * m) / min);
        return answer;
    }
}