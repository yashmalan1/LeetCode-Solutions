class Solution {
    public int dayOfYear(String date) {
        // Year, Month, Day parsing with correct substrings
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));

        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            daysInMonth[1] = 29; 
        }
        int dayCount = 0;
        for (int i = 0; i < month - 1; i++) {
            dayCount += daysInMonth[i];
        }
        return dayCount + day;
    }
}