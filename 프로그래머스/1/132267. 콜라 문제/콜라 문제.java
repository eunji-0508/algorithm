class Solution {
    // 빈 병 두 개, 콜라 한 개
    // 보유 중인 빈 병이 2개 미만이면, 콜라를 받을 수 없음
    // a = 가게에 줄 빈 병, b = 가게에서 주는 콜라, n = 가지고 있는 빈 병의 개수
    // 받을 수 있는 콜라의 개수 = answer
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(n >= a) {
            int count = n / a;
            int cola = count * b;
            
            answer += cola;
            n = (n % a) + cola;
        }
        
        return answer;
    }
}