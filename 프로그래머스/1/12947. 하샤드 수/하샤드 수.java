class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        
        char[] arr = Integer.toString(x).toCharArray();
        int[] ar = new int[arr.length];
        
        int cnt = 0;
        
        for(int i=0; i<ar.length; i++){
            ar[i] = arr[i] - 48;
            cnt += ar[i];
        }
        
        if(x % cnt == 0){
            answer = true;
        }
        return answer;
    }
}