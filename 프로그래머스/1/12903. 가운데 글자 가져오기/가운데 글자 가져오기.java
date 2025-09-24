class Solution {
    public String solution(String s) {
        int len = s.length();
        
        String answer = "";
        
        int begin = len / 2;
        
        if(len % 2 == 0) {
            answer = s.substring(begin - 1, begin + 1);
        } else {
            answer = s.substring(begin, begin + 1);
        }
        
        return answer;
    }
}