public class NextDayCalculator {

    public static final String SLASH = "/";
    public static final int firstDayOfMonth = 1;
    public static final int firstMonthOfYear = 1;
    public static final int lastMonthOfYear = 12;

    public static String getNextDay(int day, int month, int year) {
        int outPutDay;
        int outPutMonth;
        int outPutYear;
        int lastDayOfMonth = 0;
        lastDayOfMonth = getLastDayOfMonth(month, lastDayOfMonth,year);
        if (day== lastDayOfMonth){
            if (month == lastMonthOfYear){
                outPutDay = firstDayOfMonth;
                outPutMonth = firstMonthOfYear;
                outPutYear = year++;
            } else {
                outPutDay = firstDayOfMonth;
                outPutMonth = ++month;
                outPutYear = year;
            }
        } else {
            outPutDay = ++day;
            outPutMonth = month;
            outPutYear = year;

        }
        String result = outPutDay + SLASH + outPutMonth + SLASH + outPutYear;
        return result;
    }

    private static int getLastDayOfMonth(int month, int lastDayOfMonth,int year) {
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                lastDayOfMonth = 31;
                break;
            case 2:
                boolean isLeapYear = isLeapYear(year);
                if (isLeapYear){
                    lastDayOfMonth = 29;
                    return lastDayOfMonth;
                } else {
                    lastDayOfMonth =28;
                    return lastDayOfMonth;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                lastDayOfMonth = 30;
                break;
        }
        return lastDayOfMonth;
    }

    private static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0)
                    isLeapYear = true;
            } else {
                isLeapYear= true;
            }
        }
        return isLeapYear;
    }
}
