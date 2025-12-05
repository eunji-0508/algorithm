class Solution {
    public String solution(String s, int n) {
        // 아스키코드 A 65
        // 아스키코드 a 97
        String answer = "";
        
        for(int i = 0; i < s.length(); i++) {
            char alpha = s.charAt(i);
            
            if(alpha == ' ') {
                answer += ' ';
                continue;
            }
            
            if(alpha >= 'a' && alpha <= 'z') {
                answer += (char)((alpha - 'a' + n) % 26 + 'a'); 
            } else {
                answer += (char)((alpha - 'A' + n) % 26 + 'A');
            }
        }
        
        return answer;
    }
}