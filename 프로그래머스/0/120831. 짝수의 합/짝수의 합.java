class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n > 0 && n <= 1000) {
            for(int i = 0; i <= n; i++) {
                if(i % 2 == 0) {
                    answer += i;
                }
            }
        }
        return answer;
    }
}