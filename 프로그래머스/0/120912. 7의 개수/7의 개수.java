class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        String[] arr = new String[array.length];
        
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.toString(array[i]);
            for(int j=0; j<arr[i].length(); j++){
                if(arr[i].charAt(j) == '7'){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}