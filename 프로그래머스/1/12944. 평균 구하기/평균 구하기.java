class Solution {
    public double solution(int[] arr) {
        double len = arr.length;
        double answer = 0;
        for(double array : arr) {
            answer += array;
        }
        answer = answer / len;
        return answer;
    }
}