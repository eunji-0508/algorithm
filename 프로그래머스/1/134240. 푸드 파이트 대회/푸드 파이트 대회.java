class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        int quo = 0;
        // 한 선수 왼 오 / 한 선 수 오 왼 / 중앙 물 승리 / 칼로리 낮은 순, 순서 동일
        for(int i = 1; i <= food.length - 1; i++) {
            quo = food[i] / 2;
                
            for(int j = 1; j <= quo; j++) {
                sb.append(i);
            }
            
        }
            sb.append(0);
            
            int index = sb.indexOf("0");
            
            for(int k = index - 1; k >= 0; k--) {
                sb.append(sb.charAt(k));
            }
        
        return sb.toString();
    }
}