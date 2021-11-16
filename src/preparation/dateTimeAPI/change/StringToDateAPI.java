package preparation.dateTimeAPI.change;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

//文字列から日付や時間に変換
class StringToDateAPI {
    public static void main(String[] args) {
        System.out.println("=== 文字列をデータに変換 ===");
        System.out.println("元データ ; 2020/10/21");
        //文字列をパターンに併せてデータとして取得
        TemporalAccessor parsed1 = DateTimeFormatter.ofPattern("yyyy/MM/dd").parse("2020/10/21");
        //使いづらい型のため、変換
        LocalDate date1 = LocalDate.from(parsed1);
        System.out.println("=== 表示 ===");
        System.out.println(date1);

        System.out.println("=== ISO表記設定 ===");
        System.out.println("内容 : 2021-11-16");
        TemporalAccessor parsed2 = DateTimeFormatter.ISO_LOCAL_DATE.parse("2021-11-16");
        LocalDate date2 = LocalDate.from(parsed2);
        System.out.println(date2);
        System.out.println("------------------");
        System.out.println("内容 : 12:50:30");
        TemporalAccessor parsed3 = DateTimeFormatter.ISO_LOCAL_TIME.parse("12:50:30");
        LocalTime time1 = LocalTime.from(parsed3);
        System.out.println(time1);
        System.out.println("------------------");
        System.out.println("内容 : 2011-12-03T10:15:30");
        TemporalAccessor parsed4 = DateTimeFormatter.ISO_LOCAL_DATE_TIME.parse("2011-12-03T10:15:30");
        LocalDateTime dateTime1 = LocalDateTime.from(parsed4);
        System.out.println(dateTime1);
        System.out.println("=========== 完了 ===========");
    }
}
