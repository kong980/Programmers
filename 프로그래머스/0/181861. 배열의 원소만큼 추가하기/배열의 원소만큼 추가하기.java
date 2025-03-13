import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                num.add(arr[i]);
            }
        }
        int[] answer = new int[num.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = num.get(i);
        }
        return answer;
    }
}