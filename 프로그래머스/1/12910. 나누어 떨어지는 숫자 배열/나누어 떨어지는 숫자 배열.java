import java.util.Arrays;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        
        Arrays.sort(arr);
        
        int cnt = 0;
        
        for(int i : arr){
            if(i % divisor == 0){
                ar.add(i);
            }
        }
        
        if(ar.isEmpty()){
            ar.add(-1);
        }
        
        int[] answer = new int[ar.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = ar.get(i);
        }
        return answer;
    }
}