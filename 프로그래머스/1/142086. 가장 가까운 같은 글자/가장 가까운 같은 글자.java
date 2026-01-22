import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] alphabet = new int[26];

        Arrays.fill(alphabet, -1);

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (alphabet[index] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - alphabet[index];
            }

            alphabet[index] = i;
        }

        return answer;
    }
}