class Solution {
    public String solution(String phone_number) {
        int len = phone_number.length();
        
        String last = phone_number.substring(len - 4);
        
        String sol = "*".repeat(len - 4) + last;
        
        return sol;
    }
}