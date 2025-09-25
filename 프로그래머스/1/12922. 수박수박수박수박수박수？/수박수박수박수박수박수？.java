class Solution {
    public String solution(int n) {
        String repeatName = "수박";

        int count = n / 2;
        
        String answer = "";
        
        
        if(n % 2 == 0) {
            answer = repeatName.repeat(count);
            return answer;
        }
        
        answer = repeatName.repeat(count);
        answer = answer.concat("수");
        
        return answer;
    }
}