import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {

        // 1. min, max로 2가 나오는 첫번째, 마지막 index 찾기
        // 2. min = arr.length인 경우 -1 리턴
        // 3. Arrays.copyOfRange() 이용
        
        int min = arr.length; // 첫 번째 2
        int max = 0; // 마지막 2
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 2 && i < min){
                min = i;
            }else if(arr[i] == 2 && i > min){
                max = i;
            }
        }
        
        ArrayList<Integer> ar = new ArrayList<>();
        
        if(min == arr.length){ // 2가 없는 경우
            ar.add(-1);
        }else if(min > max){
            ar.add(arr[min]);
        }else{
                for(int i=min; i<=max; i++){
                ar.add(arr[i]);
            }
        }

        
        int[] answer = new int[ar.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = ar.get(i);
        }
        
        
        return answer;
    }
}