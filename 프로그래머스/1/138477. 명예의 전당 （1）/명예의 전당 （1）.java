import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> answer = new ArrayList<>();
        int[] result = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            answer.add(score[i]);
            Collections.sort(answer);

            if (answer.size() > k) {
                answer.remove(0);
            }

            result[i] = answer.get(0);
        }

        return result;
    }
}