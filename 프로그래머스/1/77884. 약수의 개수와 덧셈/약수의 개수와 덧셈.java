class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++){
            int cnt = 0;
            for(int j=1; j<=i; j++){ // 1부터 자기 자신까지 cnt
                if(i % j == 0){ // 나눴을 때 나머지가 0 인 경우 약수
                    cnt++;
                }
            }
            if(cnt % 2 == 0){
                    answer += i;
                }else{
                    answer -= i;
                }
        }
        return answer;
    }
}