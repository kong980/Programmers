class Solution {
    public int solution(String s) {
        int answer = 0;
        
        String[] ar = s.split(" ");
        for(int i=0; i<ar.length; i++){
            if(ar[i].equals("Z")){
                answer -= Integer.parseInt(ar[i-1]);
            }else{
                answer += Integer.parseInt(ar[i]);
            }
        }
        return answer;
    }
}