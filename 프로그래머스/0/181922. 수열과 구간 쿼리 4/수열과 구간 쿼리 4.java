class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        
        for(int i=0; i<queries.length; i++){
            for(int j=0; j<arr.length; j++){
                if((queries[i][0] <= j) && (j <= queries[i][1]) && (j % queries[i][2] == 0)){
                    answer[j] += 1;
                    
                }
            }
        }
        return answer;
    }
}