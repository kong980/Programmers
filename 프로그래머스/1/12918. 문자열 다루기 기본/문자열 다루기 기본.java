class Solution {
    public boolean solution(String s) {
        boolean answer = (s.length() == 4 || s.length() == 6) ? true : false;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > 64){
                answer = false;
            }
        }
        return answer;
    }
}