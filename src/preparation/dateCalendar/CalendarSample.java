package preparation.dateCalendar;

import java.util.Calendar;

//Java7まで
class CalendarSample {
    public static void main(String[] args) {
        System.out.println("======================== カレンダー ========================");
        //宣言
        Calendar calendar = Calendar.getInstance();
        System.out.println("----------------- 抽象クラス表示 -----------------");
        System.out.println(calendar);
        System.out.println("---------------------------------------------------\n");

        //宣言時の具体値を取得
        System.out.println("------------------ 作成時データ表示 ---------------");
        System.out.println(calendar.getTime());
        System.out.println("---------------------------------------------------\n");

        //セット
        System.out.println("---------------------- 全セット -------------------");
        calendar.set(2021,10,15,23,30,59);
        System.out.println(calendar.getTime());
        System.out.println("---------------------------------------------------\n");

        System.out.println("---------------------- 加算/減算 ------------------");
        System.out.println("---- 日を10日加算 ----");
        calendar.add(Calendar.DAY_OF_YEAR,10);
        System.out.println(calendar.getTime());
        System.out.println("----- 年を3年減算 -----");
        calendar.add(Calendar.YEAR,-3);
        System.out.println(calendar.getTime());
        System.out.println("---------------------------------------------------\n");

        //定数
        System.out.println("---------------------- 定数指定 -------------------");
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.MONTH,Calendar.JANUARY);
        System.out.println(" ---- 実行時の年、日、時刻は同じで月だけ指定 ----");
        System.out.println(calendar2.getTime());
        System.out.println("---------------------------------------------------\n");
        System.out.println("======================== 完了 ======================");
    }
}
