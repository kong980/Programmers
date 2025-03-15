class Solution {
    public String solution(int n) {
        String answer = "";
        String st = "수박";
        for(int i=0; i<n; i++){
            answer += st.charAt(i%2);
        }
        return answer;
    }
}