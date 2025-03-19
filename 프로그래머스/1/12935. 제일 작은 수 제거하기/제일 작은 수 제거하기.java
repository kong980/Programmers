import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[(arr.length == 1 ? 1 : (arr.length - 1))];
        
        if(answer.length == 1){
            answer[0] = -1;
        }else{
            int min = arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                }
            }
            
            ArrayList<Integer> ar = new ArrayList<Integer>();
            for(int i : arr){
                ar.add(i);
            }
            
            ar.remove(ar.indexOf(min));
            
            
            for(int i=0; i<answer.length; i++){
                answer[i] = ar.get(i);
            }
        }
        
        return answer;
    }
}