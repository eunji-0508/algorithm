import java.time.*;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        
        DayOfWeek day = date.getDayOfWeek();
        
        String result = day.toString().substring(0, 3);
        
        return result;
    }
}