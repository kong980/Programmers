import java.util.ArrayList;

class Solution {
    public String[] solution(String[] str_list) {
        
        ArrayList <String> ar = new ArrayList<String>();
        
        for(int i=0; i<str_list.length; i++){
            if(str_list[i].equals("r")){
                for(int j=(i+1); j<str_list.length; j++){
                    ar.add(str_list[j]);
                }
                break;
            }else if(str_list[i].equals("l")){
                for(int j=0; j<i; j++){
                    ar.add(str_list[j]);
                }
                break;
            }
        }
        String[] answer = new String[ar.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = ar.get(i);
        }
        return answer;
    }
}