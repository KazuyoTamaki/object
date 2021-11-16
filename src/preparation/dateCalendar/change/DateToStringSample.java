package preparation.dateCalendar.change;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//日付を好みのフォーマットで表示
class DateToStringSample {
    public static void main(String[] args) {
        System.out.println("============ フォーマットで表示 ============");
        System.out.println("yyyy年MM月dd日 hh時 mm分");
        Date date1 = new Date();
        DateFormat format1 = new SimpleDateFormat("yyyy年 MM月 dd日 hh時 mm分");
        System.out.println(format1.format(date1));
        System.out.println();

        System.out.println("Format 2 : yy年MM月dd日 hh時 mm分 ss.S秒 z");
        DateFormat format2 = new SimpleDateFormat("yy年 MM月 dd日 hh時 mm分 ss.S秒 z");
        System.out.println(format2.format(date1));
        System.out.println("=================== 完了 ===================");
        System.out.println();

    }
}
