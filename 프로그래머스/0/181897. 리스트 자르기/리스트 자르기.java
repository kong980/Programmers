import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> ar = new ArrayList<>();
        if(n == 1){
            for(int i=0; i<=slicer[1]; i++){
                ar.add(num_list[i]);
            }
        }else if(n == 2){
            for(int i=slicer[0]; i<num_list.length; i++){
                ar.add(num_list[i]);
            }
        }else if(n == 3){
            for(int i=slicer[0]; i<=slicer[1]; i++){
                ar.add(num_list[i]);
            }
        }else{
            for(int i=slicer[0]; i<=slicer[1]; i+=slicer[2]){
                ar.add(num_list[i]);
            }
        }
        
        int[] answer = new int[ar.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = ar.get(i);
        }
        return answer;
    }
}