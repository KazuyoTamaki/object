package preparation.dateTimeAPI.japaneseCalendar;

import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

//和暦
class JapaneseCalendar {
    public static void main(String[] args) {
        System.out.println("================== 和暦表示 ==================");
        System.out.println("===== JapaneseDate.of =====");
        //令和はエラーになる .... Japanese NewEra 2-12-01
        System.out.println("---- 令和 ----");
        JapaneseDate date1 = JapaneseDate.of(2020,12,1);
        System.out.println(date1);

        //昭和
        System.out.println("---- 昭和 ----");
        JapaneseDate date2 = JapaneseDate.of(1980,1,20);
        System.out.println(date2);

        System.out.println("===== DateTimeFormatter.ofPattern =====");
        //平成
        System.out.println("---- 平成 ----");
        JapaneseDate date3 = JapaneseDate.of(2005,7,15);
        System.out.println(DateTimeFormatter.ofPattern("GGGGy年M月d日").format(date3));

        System.out.println("==================== 完了 ====================");
    }
}
