class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = 1; // 1순위로 초기화
            for(int j=0; j<answer.length; j++){
                if(emergency[i] < emergency[j]){ // 각 원소와 비교
                    answer[i]++;
                }
            }
        }
        return answer;
    }
}