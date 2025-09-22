class Solution {
    public int solution(int[] numbers) {
        boolean [] existsNum = new boolean [10];
        
        for(int i = 0; i < numbers.length; i++) {
            existsNum[numbers[i]] = true;
        }
        
        int answer = 0;
        
        for(int i = 0; i < existsNum.length; i++) {
            if(existsNum[i] == false) {
                answer += i;
            }
        }
               
        return answer;
    }
}