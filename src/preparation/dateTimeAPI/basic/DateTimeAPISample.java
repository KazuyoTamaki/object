package preparation.dateTimeAPI.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

//Java8以降
class DateTimeAPISample {
    public static void main(String[] args) {
        System.out.println("================== API使用日時処理 ==================");
        //宣言
        LocalDate date1 = LocalDate.now();
        LocalTime time1 = LocalTime.of(23,59,31,123456);
        LocalDateTime dateTime1 = LocalDateTime.parse("2009-08-27T02:25:30.123456");

        //初期値表示
        System.out.println("---------- 初期値の表示 ----------");
        System.out.println("--- LocalDate ---");
        System.out.println(date1);
        System.out.println("--- LocalTime ---");
        System.out.println(time1);
        System.out.println("--- LocalDateTime ---");
        System.out.println(dateTime1);

        //個別取得
        System.out.println("---------- 個別表示 ----------");
        System.out.println("--- LocalDate ---");
        System.out.println("LocalDate Year  : " + date1.getYear());
        System.out.println("LocalDate Month : " + date1.getMonth());
        System.out.println("--- LocalTime ---");
        System.out.println("LocalTime Hour   : " + time1.getHour());
        System.out.println("LocalTime Minute : " + time1.getMinute());
        System.out.println("LocalTime Second : " + time1.getSecond());
        System.out.println("--- LocalDateTime ---");
        System.out.println("LocalDateTime Month : " + dateTime1.getMonthValue());
        System.out.println("LocalDateTime Second : " + dateTime1.getSecond());

        //計算
        System.out.println("---------- 加算減算 ----------");
        System.out.println("LocalDate Normal     : " + date1);
        System.out.println("LocalDate plusDay20  : " + date1.plusDays(20));
        System.out.println("LocalDate minusYear3 : " + date1.minusYears(3));

        System.out.println("-- 秒 --");
        System.out.println("LocalTime Nanosecond Normal      : " + time1);
        System.out.println("LocalTime plusNanoSecond 50,000  : " + time1.plusNanos(50_000));
        System.out.println("LocalTime plusNanoSecond 20,000  : " + time1.minusNanos(20_000));

        System.out.println("======================= 完了 =======================");
    }
}
