package preparation.dateCalendar.change;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//文字列を日付に変換
//エラーも吐くようにする
class StringToDateSample {
    public static void main(String[] args) {

        //フォーマット宣言 ミリ秒まで、タイムゾーンも表示
        System.out.println("== 文字列表記の日付を日付型に変換 ==");
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy年MM月dd日hh時mm分ss.S秒");

        //例外も含めた変換処理
        System.out.println("=============== 開始 ================");
        System.out.println("試行 : 2017年1月12日01時30分10.123秒");
        try{
            System.out.println("==== 処理成功 ====");
            Date date1 = dateFormat1.parse("2017年1月12日01時30分10.123秒");
            System.out.println(date1);   //ミリ秒のみ削られている
        }catch(ParseException e){
            System.out.println("==== 処理失敗 ====");
            System.out.println("== パースエラー ==");
        }
        finally {
            System.out.println("=============== 終了 ================");
        }
    }

}
