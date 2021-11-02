package training.set;

import java.util.*;

class SetSample {
    public static void main(String[] args) {
        //宣言
        Set<Integer> hashset1 = new HashSet<>();
        Set<String> hashset2 = new HashSet<>();
        Set<Integer> hashset3 = new HashSet<>(Arrays.asList(10,20,25,0,3,30,40,60,100,1,10,30,100,0,1,5));
        Set<SetTest> hashset4 = new HashSet<>();
        //hashset1:シンプルな整数型、2:文字列型、3:整数型（初期値入力）、4:オブジェクト

        //追加
        hashset1.add(10); //1件ずつ
        hashset1.addAll(Arrays.asList(10,20,30,40,50,30,40,60,100,1,10,30,100)); //まとめて
        hashset2.addAll(Arrays.asList("こんにちは","おはようございます","こんばんは","こんにちは","おはようございます"));
        hashset4.addAll(Arrays.asList(
                new SetTest(1,5),
                new SetTest(20,30),
                new SetTest(8,12),
                new SetTest(10,3),
                new SetTest(5,6),
                new SetTest(3,10)
        ));

        //原則ほぼListと同じ操作のため、内容はほぼ一緒
        //横のセット表示
        System.out.println("\n==================================横表示==================================");
        System.out.println("---------------------------------HashSet1--------------------------------");
        System.out.println(hashset1);
        System.out.println("---------------------------------HashSet2--------------------------------");
        System.out.println(hashset2);
        System.out.println("---------------------------------HashSet3--------------------------------");
        System.out.println(hashset3);
        System.out.println("================================横表示完了================================\n");

        System.out.println("==============================HashSet4縦表示==============================");
        for(SetTest set4 : hashset4){
            System.out.println(String.format("%d + %d = %d",set4.num1,set4.num2,set4.sumTest()));
            System.out.println(String.format("%d / %d = %.2f",set4.num1,set4.num2,set4.modTest()));
            set4.stringTest();
            System.out.println("--------------------");
        }
        System.out.println("============================HashSet4縦表示完了============================\n");

        //ArrayListをHashSetに変換
        System.out.println("============================ListからSetへ============================");
        List<Integer>list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,25,0,3,30,40,60,100,1,10,30,100,0,1,5));
        System.out.println("-------------------------------List表示------------------------------");
        System.out.println(list1);
        //代入
        Set<Integer> list6 = new HashSet<>(list1);
        System.out.println("---------------------------代入後Set表示-----------------------------");
        System.out.println(list6);
        System.out.println("===============================変換完了==============================\n");

        //上書きは基本的になし（番地指定のないデータの集まりのため）
        //値の削除
        System.out.println("===============================削除処理==============================");
        System.out.println("----------単独削除 削除前----------");
        System.out.println(hashset1);
        //削除 値：10
        hashset1.remove(10);
        System.out.println("----------単独削除 削除後----------");
        System.out.println(hashset1);
        System.out.println("--------複数削除 削除前(指定)--------");
        //削除 値：40,60
        hashset1.removeAll(Arrays.asList(40,60));
        System.out.println("----------複数削除 削除後----------");
        System.out.println(hashset1);
        //以外削除
        System.out.println("----------複数削除 削除前(以外)----------");
        System.out.println(hashset2);
        hashset2.retainAll(Arrays.asList("おはようございます","こんばんは"));
        System.out.println("----------複数削除 削除後----------");
        System.out.println(hashset2);
        //すべてクリア
        System.out.println("----------全削除 削除前----------");
        System.out.println(hashset3);
        hashset3.clear();
        System.out.println("----------全削除 削除後----------");
        System.out.println(hashset3);
        //オブジェクトは値でないので消せない（メモリアドレス指定なら可能？）
        //hashset3.remove(SetTest);
        System.out.println("----------全削除(obj) 削除前----------");
        for(SetTest set:hashset4){
            System.out.println(String.format("num1 = %d, num2 = %d",set.num1,set.num2));
        }
        hashset4.clear();
        System.out.println("----------全削除 削除後----------");
        for(SetTest set:hashset4){
            System.out.println(String.format("num1 = %d, num2 = %d",set.num1,set.num2));
        }
        System.out.println("===============================削除完了==============================\n");
        System.out.println("===============================その他==============================");
        System.out.println("----------要素数取得----------");
        System.out.println(hashset1.size());
        System.out.println("----------検索（有無）----------");
        System.out.println(hashset2.contains("こんにちは"));
        System.out.println(hashset2.contains("おはようございます"));
        System.out.println(hashset2.containsAll(Arrays.asList("おはようございます", "こんばんは")));
        System.out.println("----------要素の有無----------");
        System.out.println(hashset1.isEmpty());
        System.out.println(hashset4.isEmpty());
        //toArrayは調べておく
        System.out.println("===============================その他完了==============================");
    }

}
