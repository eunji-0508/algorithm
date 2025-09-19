class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int [] arr = new int [signs.length];
        for(int i = 0; i < signs.length; i++) {
            if(signs[i]) {
                arr[i] = absolutes[i];
            } else {
                 arr[i] = -(absolutes[i]);
            }
        }
        
        int answer = 0;
        
        for(int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}