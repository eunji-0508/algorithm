class Solution {
    public int solution(int[][] sizes) {
        int maxWidth = 0;
        int maxHeight = 0;

        for (int[] card : sizes) {
            int w = Math.max(card[0], card[1]);  // 긴 쪽을 가로
            int h = Math.min(card[0], card[1]);  // 짧은 쪽을 세로

            maxWidth = Math.max(maxWidth, w);
            maxHeight = Math.max(maxHeight, h);
        }

        return maxWidth * maxHeight;
    }
}
