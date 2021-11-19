package preparation.string;

import java.util.Locale;

//文字列操作
class StringSample {
    public static void main(String[] args) {

        //文字列の変換
        System.out.println("============ 文字列の変換 ============");
        String str1 = "HELLO!";
        String str2 = str1.toLowerCase(Locale.ROOT);
        System.out.println(str1);
        System.out.println(str2);

        System.out.println();

        //①文字列結合
        System.out.println("============ 文字列の結合 ============");
        System.out.println("==== String Builder ====");
        StringBuilder builder1 = new StringBuilder();
        builder1.append(str1);
        builder1.append(str2);
        System.out.println(builder1);
        System.out.println("-------------------------");

        //② + 演算子
        System.out.println("==== + 演算子 ====");
        System.out.println(str1 + str2);

        System.out.println("-------------------------");

        //③Stringのconcatメソッド
        System.out.println("==== concat メソッド ====");
        System.out.println(str1.concat(str2));
        System.out.println("-------------------------");

        //④StringBuffer
        System.out.println("==== String Buffer ====");
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1.append(str1);
        stringBuffer1.append(str2);
        System.out.println(stringBuffer1);

        System.out.println("=============== 完了 ===============");
    }
}
