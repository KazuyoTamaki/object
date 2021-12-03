package lecture.tax;

import java.time.LocalDate;

//税金の区切りとなる日付を宣言
class taxDay {
    //コンストラクタ 税金が変わる日付
    //変更できないようにprivateを使用
    private taxDay(){}

    //定数を宣言(税金が改訂された年)
    //定数のためstaticでインスタンス化しなくても利用可能に
    //finalで固定化
    public static final LocalDate TAX5 = LocalDate.parse("1999-04-01");
    public static final LocalDate TAX8 = LocalDate.parse("2014-04-01");
    public static final LocalDate TAX10 = LocalDate.parse("2019-10-01");
}
