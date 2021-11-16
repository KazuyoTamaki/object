package preparation.dateCalendar.basic;

import java.util.Date;

//Java7まで UNIX時間(1970/1/1)
class DateSample {
    public static void main(String[] args) {

        System.out.println("====================== 日付① ======================");
        Date date1 = new Date();
        System.out.println("------------ 現在時刻表示 ------------");
        System.out.println(date1);

        System.out.println("====================== 日付② ======================");
        Date date2 = new Date(2000000000);
        System.out.println("------------ UNIX時間からのミリ秒後指定 ------------");
        System.out.println(date2); //Sat Jan 24 12:33:20 JST 1970

        System.out.println("====================== 日付③ ======================");
        Date date3 = new Date(-2000000000);
        System.out.println("------------ UNIX時間からのミリ秒後指定 ------------");
        System.out.println(date3); //Tue Dec 09 05:26:40 JST 1969
        System.out.println("======================= 完了 =======================");
    }
}
