import java.util.Scanner;

public class Calendar {

    private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static final int[] LEAP_MAX_DAYS = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean checkLeafYear(int year){
        if(year%4 == 0 && year%100 != 0){
            return true;
        }else if(year%100 == 0 && year%400 == 0){
            return true;
        }else{
            return false;
        }
    }

    public static int getMaxDaysOfMonth(boolean leafYear, int month) {
        if (leafYear){
            return LEAP_MAX_DAYS[month-1];
        } else {return MAX_DAYS[month-1];}
    }

    public static int getWeekDayNum(int year, int month) {
        // 1970년 1월 1일이 목요일인 것을 이용해 출력해야하는 달의 1일 요일 알아내기
        int syear = 1970;
        int leafYearCounter = 0;
        int normalYearCounter = 0;
        // 1970년 ~ year 까지 평년 @년, 윤년 @년 알아내기
        for(int y=syear; y<year; y++){
            if (checkLeafYear(y)) {
                leafYearCounter += 1;
            }else {normalYearCounter+=1;}
        }
        int totalDays = 0;
        totalDays = leafYearCounter*366 + normalYearCounter*365;

        if(checkLeafYear(year)){
            //표시해야하는 년도가 윤년일 경우
            for(int lm=1;lm<month;lm++){
                totalDays += getMaxDaysOfMonth(true,lm);
            }
        } else {
            //표시해야하는 년도가 평년일 경우
            for(int nm=1; nm<month; nm++){
                totalDays += getMaxDaysOfMonth(false, nm);
            }
        }

        if (totalDays%7 == 0){return 4;}
        else if (totalDays%7 == 1) {return 5;}
        else if (totalDays%7 == 2) {return 6;}
        else if (totalDays%7 == 3) {return 0;}
        else if (totalDays%7 == 4) {return 1;}
        else if (totalDays%7 == 5) {return 2;}
        else if (totalDays%7 == 6) {return 3;}
        else{ return 0; }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("년도를 입력해주세요. (프로그램 종료는 -1 입력)");
            System.out.print("YEAR> ");
            int year = scanner.nextInt();
            if (year == -1) {
                System.out.println("프로그램 종료");
                break;
            }

            System.out.println("월을 입력해주세요. (프로그램 종료는 -1 입력)");
            System.out.print("MONTH> ");
            int month = scanner.nextInt();
            if (month == -1) {
                System.out.println("프로그램 종료");
                break;
            }
            if (month > 12 || 0>=month) {
                continue;
            }

            boolean isLeafYear = checkLeafYear(year);
            int maxDays = getMaxDaysOfMonth(isLeafYear, month);
            int weekdayNum = getWeekDayNum(year, month);
            System.out.println(String.format("    <<%4d년%3d월>>", year, month));
            System.out.println(" SU MO TU WE TH FR SA");
            System.out.println("---------------------");
            for (int w=0; w<weekdayNum; w++){
                System.out.print("   ");
            }
            if(weekdayNum == 0){
                for(int i=1; i<=maxDays; i++){
                    System.out.print(String.format("%3d",i));
                    if(i%7==0){
                        System.out.println();
                    }
                }
            } else {
                for (int i = 1; i <= maxDays; i++) {
                    System.out.print(String.format("%3d", i));
                    if (i % 7 == (7 - weekdayNum)) {
                        System.out.println();
                    }
                }
            }
            System.out.println();
        }
    }
}