package preparation.dateCalendar.change;

import java.util.Calendar;
import java.util.Date;

//DateとCalendarの変換
class ChangeDateCalendar {
    public static void main(String[] args) {
        System.out.println("========================== 相互変換 ==========================");
        System.out.println("------ Calender ⇒ Date ------");
        //宣言
        Calendar calendar1 = Calendar.getInstance();
        System.out.println("--- Instance ---");
        System.out.println(calendar1.getTime());
        //変換
        System.out.println("--- Change ---");
        Date date1 = calendar1.getTime();
        System.out.println(date1);

        //宣言
        Calendar calendar2 = Calendar.getInstance();
        System.out.println("--- Instance ---");
        System.out.println(calendar2.getTime());
        //変換
        System.out.println("--- Change ---");
        Date date2 = new Date(calendar2.getTimeInMillis());
        System.out.println(date2);

        System.out.println("------------------------------");

        System.out.println("------ Date ⇒ Calender ------");
        //宣言
        System.out.println("--- Instance ---");
        Date date3 = new Date();
        System.out.println(date3);
        //宣言、変換
        System.out.println("--- Change ---");
        Calendar calendar3 = Calendar.getInstance();
        calendar3.setTime(date3);
        System.out.println(date3);

        System.out.println("------------------------------");
        System.out.println("============================ 完了 ============================");
    }
}
