class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[((my_str.length() + n - 1) / n)];
        
        for(int i=0; i<answer.length; i++){
            int start = n * i;
            int end = (start + n) <= my_str.length() ? (start + n) : my_str.length();
            
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}