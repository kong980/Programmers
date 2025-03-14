import java.lang.Math;

class Solution {
    public int[] solution(int[] arr) {
        double size = arr.length;
        
        for(int i=0; i<=10; i++){
            if(arr.length <= Math.pow(2, i)){
                size = Math.pow(2, i);
                break;
            }
        }
        
        int[] answer = new int[(int)size];
        
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}