package preparation.dateTimeAPI.change;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//日付を好きなフォーマットで表示
class DateAPIToString {
    public static void main(String[] args) {
        System.out.println("============ 現在の日表示 ============");
        System.out.println("フォーマット : yyyy/MM/dd");
        LocalDate date1 = LocalDate.now();
        System.out.println(DateTimeFormatter.ofPattern("yyyy/MM/dd").format(date1));

        System.out.println("=========== 現在の時間表示 ===========");
        System.out.println("フォーマット : HH:mm:ss");
        LocalTime time1 = LocalTime.now();
        System.out.println(DateTimeFormatter.ofPattern("HH:mm:ss").format(time1));

        System.out.println("================ 完了 ================");
    }
}
