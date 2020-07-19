public class DateUtil_ {
    public static void main(String[] args) {
//        boolean f = isValidDate(2001,5,0);
//        System.out.println(f);
//        int dayOfWeek = getDayOfWeek(2020,5,23);
//        System.out.println(dayOfWeek);
//        printCalendar(2020,7);
//        printCalendar(2020);
        System.out.println(formatDate(2020,7,19));
    }

    //根据输入年份，判断该年是否为闰年，是返回true，否则返回false
    public static boolean isLeapYear(int year) {
        if(isValidDate(year,1,1)) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } else return false;
                } else return true;
            } else return false;
        }
        else {
            System.out.println("Error Date Format!!");
            return false;
        }
    }

    //根据输入的年月日，判断日期是否合法，合法返回true，非法返回false
    public static boolean isValidDate(int year,int month,int day){
        if(year<1||year>9999) return false;
        if(month<1||month>12) return false;
        if(day<1) return false;
        if(month==1||month==3||month==5||month==7 ||month==8||month==10||month==12) {
            if (day > 31) return false;
        }
        if(month==4||month==6||month==9||month==11){
            if(day>30) return false;
        }
        if(month==2){
            if(isLeapYear(year)){
                if(day>29) return false;
            }
            else {
                if(day>28) return false;
            }
        }
        return true;
    }

    //根据输入的年月日，返回当日的星期数
    public static int getDayOfWeek(int year,int month,int day){
        if(isValidDate(year,month,day)) {
            int yearFirstTwoFlag;
            switch ((year / 100) % 4) {
                case 0:
                    yearFirstTwoFlag = 6;
                    break;
                case 1:
                    yearFirstTwoFlag = 4;
                    break;
                case 2:
                    yearFirstTwoFlag = 2;
                    break;
                default:
                    yearFirstTwoFlag = 0;
                    break;
            }
            int yearLastTwo = year % 100;
            int divideBy4 = yearLastTwo / 4;
            int monthTable;
            switch (month) {
                case 1:
                    if (isLeapYear(year)) monthTable = 6;
                    else monthTable = 0;
                    break;
                case 2:
                    if (isLeapYear(year)) monthTable = 2;
                    else monthTable = 3;
                    break;
                case 3:
                    monthTable = 3;
                    break;
                case 4:
                    monthTable = 6;
                    break;
                case 5:
                    monthTable = 1;
                    break;
                case 6:
                    monthTable = 4;
                    break;
                case 7:
                    monthTable = 6;
                    break;
                case 8:
                    monthTable = 2;
                    break;
                case 9:
                    monthTable = 5;
                    break;
                case 10:
                    monthTable = 0;
                    break;
                case 11:
                    monthTable = 3;
                    break;
                default:
                    monthTable = 5;
                    break;
            }
            int sum = yearFirstTwoFlag + yearLastTwo + divideBy4 + monthTable + day;
            return sum % 7;
        }
        else {
            System.out.println("Error Date Format!!");
            return -1;
        }
    }

    //根据输入年份以及月份，打印出当月日历
    public static void printCalendar(int year,int month){
        if(isValidDate(year,month,1)) {
            System.out.println("  MON  TUE  WED  THU  FRI  SAT  SUN");
            int firstDayOfWeek = getDayOfWeek(year, month, 1);
            int DayOfWeek;
            for (int i = 0; i < (firstDayOfWeek + 6) % 7; i++) {
                System.out.print("     ");
            }
            for (int i = 0; i < getDaysOfMonth(year, month); i++) {
                System.out.printf("%5d", i + 1);
                DayOfWeek = (firstDayOfWeek + i) % 7;
                if (DayOfWeek == 0&&i+1<getDaysOfMonth(year,month)) System.out.println();
            }
        }
        else System.out.println("Error Date Format!!");
    }

    //根据输入年份，输入当年日历
    public static void printCalendar(int year){
        if(isValidDate(year,1,1)){
            String monthName;
            for(int i=1;i<=12;i++){
                switch (i) {
                    case 1:
                        monthName = "Jan";
                        break;
                    case 2:
                        monthName = "Feb";
                        break;
                    case 3:
                        monthName = "Mar";
                        break;
                    case 4:
                        monthName = "Apr";
                        break;
                    case 5:
                        monthName = "May";
                        break;
                    case 6:
                        monthName = "Jun";
                        break;
                    case 7:
                        monthName = "Jul";
                        break;
                    case 8:
                        monthName = "Aug";
                        break;
                    case 9:
                        monthName = "Sep";
                        break;
                    case 10:
                        monthName = "Oct";
                        break;
                    case 11:
                        monthName = "Nov";
                        break;
                    default:
                        monthName = "Dec";
                        break;
                }
                System.out.println();
                System.out.println("****************"+monthName+"****************");
                printCalendar(year,i);
            }
        }
        else {
            System.out.println("Error Date Format!!");
        }
    }

    //根据输入年月日，返回固定格式的String字符串
    public static String formatDate(int year,int month,int day){
        if(isValidDate(year,month,day)){
            int dayOfWeek = getDayOfWeek(year,month,day);
            String weekName,monthName;
            switch (dayOfWeek){
                case 1:
                    weekName = "Monday";
                    break;
                case 2:
                    weekName = "Tuesday";
                    break;
                case 3:
                    weekName = "Wednesday";
                    break;
                case 4:
                    weekName = "Thursday";
                    break;
                case 5:
                    weekName = "Friday";
                    break;
                case 6:
                    weekName = "Saturday";
                    break;
                default:
                    weekName = "Sunday";
                    break;
            }
            switch (month){
                case 1:
                    monthName = "Jan";
                    break;
                case 2:
                    monthName = "Feb";
                    break;
                case 3:
                    monthName = "Mar";
                    break;
                case 4:
                    monthName = "Apr";
                    break;
                case 5:
                    monthName = "May";
                    break;
                case 6:
                    monthName = "Jun";
                    break;
                case 7:
                    monthName = "Jul";
                    break;
                case 8:
                    monthName = "Aug";
                    break;
                case 9:
                    monthName = "Sep";
                    break;
                case 10:
                    monthName = "Oct";
                    break;
                case 11:
                    monthName = "Nov";
                    break;
                default:
                    monthName = "Dec";
                    break;
            }
//            System.out.println(weekName+" "+day+" "+monthName+" "+year);
            String res = weekName+" "+day+" "+monthName+" "+year;
            return res;
        }
        else {
            System.out.println("Error Date Format!!");
            return "Error Date Format!!";
        }
    }

    //根据输入年份以及月份，返回当月的天数；主要用于生成日历
    private static int getDaysOfMonth(int year,int month) {
        if(isValidDate(year,month,1)) {
            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                return 31;
            }
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                return 30;
            }
            if (month == 2) {
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            return -1;
        }
        else return -1;
    }
}
