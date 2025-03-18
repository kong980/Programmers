import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        while(n > 0){
            arr.add((int)(n % 10));
            n /= 10;
        }
        
        int[] ar = new int[arr.size()];
        for(int i=0; i<ar.length; i++){
            ar[i] = arr.get(i);
        }
        
        Arrays.sort(ar);
        
        for(int i=0; i<ar.length; i++){
            answer += (Math.pow(10,i)) * ar[i];
        }
        
        return answer;
    }
}