import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[a-c]");
        
        ArrayList<String> arr = new ArrayList(Arrays.asList(str));
        if(arr.isEmpty()){
            arr.add("EMPTY");
        }
        arr.removeIf(String :: isEmpty);
        
        String[] answer = arr.toArray(new String[0]);
    
        
        return answer;
    }
}