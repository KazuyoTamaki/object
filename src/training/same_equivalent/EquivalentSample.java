package training.same_equivalent;

class EquivalentSample {
    public static void main(String[] args) {
        //初期値宣言
            String str1 = "あいうえお";
            String str2 = "かきくけこ";
            String str3 = str1;
            String str4 = "かきくけこ";

            System.out.println("================= 同一テスト( == ) =================");
            //出力
            System.out.println("================= 値の表示 =================");
            System.out.println("str1 = " + str1);
            System.out.println("str2 = " + str2);
            System.out.println("str3 = " + str3);
            System.out.println("str4 = " + str4);

            System.out.println("================= 値の比較 =================");
            //文字列
            System.out.println("str1とstr2 は" + str1.equals(str2));
            System.out.println("str1とstr3 は" + str1.equals(str3));
            System.out.println("str2とstr3 は" + str2.equals(str3));
            System.out.println("str2とstr4 は" + str2.equals(str4));
            System.out.println();

            //オブジェクト宣言
            EquivalentTest human1 = new EquivalentTest("山田",100,80,90);
            EquivalentTest human2 = new EquivalentTest("高橋",70,50,45);
            EquivalentTest human3 = human2;
            EquivalentTest human4 = new EquivalentTest("山田",100,80,90);

            System.out.println("================= 値の表示 =================");
            System.out.println("human1 : " + human1.toString());
            System.out.println("human2 : " + human2.toString());
            System.out.println("human3 : " + human3.toString());
            System.out.println("human4 : " + human4.toString());
            System.out.println("human3はhuman2を代入human4はhuman2と同じ引数");

            //オブジェクト比較
            System.out.println("================= オブジェクト比較 =================");
            //単純な文字列の比較
        System.out.println("human1とhuman2 : " + human1.equals(human2));
        System.out.println("human1とhuman3 : " + human1.equals(human3));
        System.out.println("human1とhuman4 : " + human1.equals(human4));
        System.out.println("human2とhuman3 : " + human2.equals(human3));
        System.out.println("human2とhuman4 : " + human2.equals(human4));
        System.out.println("human3とhuman4 : " + human3.equals(human4));

            System.out.println("=========================== 完了 ===========================");

        }

}
