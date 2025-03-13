class Solution {
    public int[] solution(String myString) {
        String[] parts = myString.split("x", -1);
        int[] answer = new int[parts.length];
        
        for(int i=0; i<answer.length; i++){
            answer[i] = parts[i].length();
        }
        return answer;
    }
}