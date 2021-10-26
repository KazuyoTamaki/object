package basic.sample;
/*
    \w	英単語を構成する文字(a~z,A~Z,_,1~9)
    \W	英単語を構成する文字以外
    \d	半角数字(0~9)
    \D	半角数字以外
    ^pattern	文字列の先頭にpatternがある文字列に一致
    pattern$	文字列の末尾にpatternがある文字列に一致
      *    0回以上の繰り返しにマッチ
      +    1回以上の繰り返しにマッチ
    {n}	   n回の繰り返しにマッチする表現
    {n,}   n回以上の繰り返しにマッチする表現
    {n,m}  n回以上m回以下の繰り返しにマッチする表現
      ?	   0回または1回の出現にマッチする表現
 */

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//正規表現サンプル
class RegexSample {
    public static void main(String[] args) {
        System.out.println("========正規表現========");
        //正規表現の宣言
        //郵便番号 [0-9] = \d でもOK(ただし""の中なので、\がもう一つある)
        String regex = "^[0-9]{3}-[0-9]{4}$";
        String zip1 ="002-0853";   //合っている
        System.out.println(zip1 +"の正規判断");
        System.out.println(zip1.matches(regex));
        String zip2 =  "12-34567";
        System.out.println(zip2 +"の正規判断");
        System.out.println(zip2.matches(regex));

        //Macherを使った正規表現
        System.out.println("\n========Macherを使った正規表現========");
        Pattern pattern = Pattern.compile("^[0-9]{3}-[0-9]{4}$");
        Matcher matcher = pattern.matcher(zip1);

        //List宣言 List.ofはListの初期値と配列数を確定
        List<String> zipList = List.of("002-0853","12-34567");
        for(String zip : zipList){
            System.out.println("\n========正規判定========");
            //判定を行う、宣言済のpatternが主語なのでエラーになりにくい
            matcher = pattern.matcher(zip);
            if(matcher.matches()) {
                System.out.println(zip + " : OK");
            }
            else{
                System.out.println(zip + " : NG");
            }
        }

    }

}
