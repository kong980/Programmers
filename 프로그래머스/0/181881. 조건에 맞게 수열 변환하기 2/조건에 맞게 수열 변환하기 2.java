import java.util.ArrayList;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        ArrayList<Integer> ar = new ArrayList<>();
        
        while(true){
            ar.clear();
        for(int i=0; i<arr.length; i++){
            ar.add(arr[i]);
            
            if(arr[i] >= 50 && (arr[i] % 2 == 0)){
                arr[i] /= 2;
            }else if(arr[i] < 50 && (arr[i] % 2 == 1)){
                arr[i] = (arr[i]*2) + 1;
            }
        }
            int cnt = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == ar.get(i)){
                    cnt++;
                }
            }
            if(cnt == arr.length){
                break;
            }
            answer++;
    }
       
        return answer;
    }
}