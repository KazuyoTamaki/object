package training.same_equivalent;

import java.util.Arrays;
import java.util.List;

class SameSample {
    public static void main(String[] args) {
        //初期値宣言
        String str1 = "あいうえお";
        String str2 = "かきくけこ";
        String str3 = str1;
        int num1 = 1;
        int num2 = 2;
        int num3 = num1;

        System.out.println("================= 同一テスト( == ) =================");
        //出力
        System.out.println("================= 値の表示 =================");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);

        System.out.println("================= 値の比較 =================");
        //文字列
        System.out.println("str1とstr2 は" + str1.equals(str2));
        System.out.println("str1とstr3 は" + str1.equals(str3));
        System.out.println("str2とstr3 は" + str2.equals(str3));

        //単純な文字列の比較
        if(num1 == num2) System.out.println("num1とnum2が一致");
        else System.out.println("num1とnum2が不一致");
        if(num1 == num3) System.out.println("num1とnum3が一致");
        else System.out.println("num1とnum3が不一致");
        if(num2 == num3) System.out.println("num2とnum3が一致");
        else System.out.println("num2とnum3が不一致");


        System.out.println();

        //オブジェクト宣言
        SameTest human1 = new SameTest("山田",100,80,90);
        SameTest human2 = new SameTest("高橋",70,50,45);
        SameTest human3 = human2;
        SameTest human4 = new SameTest("山田",100,80,90);

        System.out.println("================= 値の表示 =================");
        System.out.println(human1.toString());
        System.out.println(human2.toString());
        System.out.println(human3.toString());
        System.out.println(human4.toString());
        System.out.println("human3はhuman2を代入");

        //オブジェクト比較
        System.out.println("================= オブジェクト比較 =================");
        //単純な文字列の比較
        if(human1 == human2) System.out.println("human1とhuman2が一致");
        else System.out.println("human1とhuman2が不一致");
        if(human1 == human3) System.out.println("human1とhuman3が一致");
        else System.out.println("human1とhuman3が不一致");
        if(human2 == human3) System.out.println("human2とhuman3が一致");
        else System.out.println("human2とhuman3が不一致");
        if(human1 == human4) System.out.println("human1とhuman4が一致");
        else System.out.println("human1とhuman4が不一致");

        System.out.println("=========================== 完了 ===========================");

    }
}
