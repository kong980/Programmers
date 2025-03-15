class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String strk = Integer.toString(k);
        
        // 1. i부터 j까지 for문으로 돌린다.
        // 2. 해당 숫자를 string으로 변환
        // 3. string으로 변환 한 숫자가 k를 포함하면 answer++
        // 4. k가 1일 때 11처럼 1이 연속으로 들어가면 두 번 카운트 해야 함 -> split 사용
        
        for(int l=i; l<=j; l++){
            String num = Integer.toString(l);
            if(num.contains(strk)){
                String[] arr = num.split("");
                for(String s : arr){
                    if(s.equals(strk)){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}