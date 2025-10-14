import java.io.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String thrid = "";
        
        while(n > 0) {
            thrid = (n % 3) + thrid;
            n = (n / 3);
        }
        
        String reverse = "";
        
        for(int i = thrid.length() - 1; i >= 0; i--) {
            reverse = reverse + thrid.charAt(i);
        }
        
        for(int i = 0; i <= reverse.length() - 1; i++) {
            int num = reverse.charAt(i) -'0';
            answer = (answer * 3) + num;
        }
        
        return answer;
    }
}