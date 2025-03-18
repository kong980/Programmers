import java.util.ArrayList;

class Solution {
    public int[] solution(long n) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(n>0){
            arr.add((int)(n%10));
            n = n/10;
        }
        
        int[] answer = new int[arr.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = arr.get(i);
        }
        return answer;
    }
}