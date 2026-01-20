import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int num = commands[i][2];
            
            int [] result = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(result);
            
            list.add(result[num-1]);
        }
        
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}