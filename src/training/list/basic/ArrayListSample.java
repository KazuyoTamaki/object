package training.list.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//AllayListの使用テスト
class ArrayListSample {
    public static void main(String[] args) {
        //基本的な宣言のみ(ラッパークラスのみ)
        List<Integer> list1 = new ArrayList<>();
        //基本的な宣言＋初期個数宣言
        List<String> list2 = new ArrayList<>(5);
        //なにか適当な参照型で宣言
        List<Test> list3 = new ArrayList<>();
        //なにか適当な参照型で宣言＋初期値宣言
        List<Test> list4 = new ArrayList<>(Arrays.asList(
                new Test(1,2),
                new Test(0,5),
                new Test(10,4)
        ));

        //空を出力(空っぽなので何も出ない)
        System.out.println("=========================list2出力(出ない)========================");
        for(String list:list2){
            System.out.println(list);
        }
        //空の段階ではコンパイルエラー
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(list2[i]);
        }*/
        System.out.println("================================終了===============================\n\n");

        //List1の中身追加（1つずつ）
        list1.add(0,10);
        list1.add(1,12);
        list1.add(2,3);

        //list2の中身追加
        list2.addAll(Arrays.asList("あいうえお","かきくけこ","さしすせそ","たちつてと","なにぬねの"));

        //List3の宣言
        list3.add(0,new Test(1,5));
        list3.add(1,new Test(10,3));
        list3.add(2,new Test(5,4));
        list3.add(3,new Test(3,6));

        //初期値確認
        System.out.println("=============================list1出力=============================");
        for(Integer list:list1){
            System.out.println(list);
        }
        System.out.println("=============================list2出力=============================");
        for(String list:list2){
            System.out.println(list);
        }
        System.out.println("=============================list3出力=============================");
        System.out.println("============================オブジェクト===========================");
        for(Test list:list3){
            System.out.println(list);
        }
        System.out.println("=============================list4出力=============================");
        System.out.println("============================オブジェクト===========================");
        for(Test list:list4){
            System.out.println(list);
        }
        System.out.println("\n=============================list3出力=============================");
        System.out.println("==============================演算結果=============================");
        for(Test list:list3){
            System.out.println(String.format("%d + %d = %d",list.num1,list.num2,list.TestSum()));
        }
        System.out.println("=============================list4出力=============================");
        System.out.println("==============================演算結果=============================");
        for(Test list:list4){
           list.TestMultiplication();
        }
        System.out.println("============================初期値終了=============================\n");

        //値の更新
        System.out.println("=============================list2更新=============================");
        list2.set(2,"こんにちは");
        list2.set(0,"おはようございます");
        list2.set(4,"あけましておめでとうございます");
        System.out.println("=============================list2出力=============================");
        for(String list:list2){
            System.out.println(list);
        }

        //リスト4（オブジェクト）の更新
        System.out.println("=============================list4更新=============================");
        list4.set(1,new Test(100,30));
        list4.set(2,new Test(50,15));
        System.out.println("=============================list4出力=============================");
        for(Test list:list4){
            list.TestMultiplication();
        }
        System.out.println("============================更新出力完了===========================\n\n");

        //削除
        System.out.println("==============================削除=================================");
        list1.remove(0);
        list2.remove(3);
        list3.remove(2);
        list4.remove(2);
        System.out.println("=============================list1出力=============================");
        for(Integer list:list1){
            System.out.println(list);
        }
        System.out.println("=============================list2出力=============================");
        for(String list:list2){
            System.out.println(list);
        }
        System.out.println("=============================list3出力=============================");
        for(Test list:list3){
            System.out.println(String.format("%d + %d = %d",list.num1,list.num2,list.TestSum()));
        }
        System.out.println("=============================list4出力=============================");
        for(Test list:list4){
            list.TestMultiplication();
        }

        //条件に合致した値のみを削除
        list1.removeAll(Arrays.asList(1,12));
        System.out.println("=============================list1出力=============================");
        for(Integer list:list1){
            System.out.println(list);
        }
        System.out.println("=============================list2出力=============================");
        for(String list:list2){
            System.out.println(list);
        }
        //合致しない行をすべて削除
        System.out.println("\n===================おはようございます以外を削除===================");
        list2.retainAll(Arrays.asList("おはようございます","こんにちは"));
        System.out.println("=============================list2出力=============================");
        for(String list:list2){
            System.out.println(list);
        }

        //全削除
        System.out.println("=============================list3削除=============================");
        list3.clear();
        System.out.println("=============================list3出力=============================");
        for(Test list:list3){
            System.out.println(String.format("%d + %d = %d",list.num1,list.num2,list.TestSum()));
        }
        System.out.println("==========================空のため出力なし==========================\n\n");

        //インデックスを指定して値を取得
        System.out.println("=============================list1値取得===========================");
        System.out.println(list1.get(0));

        //配列のサイズ表示
        System.out.println("\n=============================list4サイズ===========================");
        System.out.println(list4.size());
        System.out.println("=============================list4出力=============================");
        for(Test list:list4){
            list.TestMultiplication();
        }

        //一部取得(0番地から1-1番地まで※1-1は、指定値-1番地までという意味）
        System.out.println("\n=============================list2一部出力=========================");
        System.out.println(list2.subList(0,1));

        //検索
        System.out.println("\n=============================list1が空か=========================");
        System.out.println(list1.isEmpty());
        System.out.println("=============================list1出力=============================");
        for(Integer list:list1){
            System.out.println(list);
        }
        System.out.println("=============================list3が空か=========================");
        System.out.println(list3.isEmpty());
        System.out.println("=============================list3出力=============================");
        for(Test list:list3){
            System.out.println(String.format("%d + %d = %d",list.num1,list.num2,list.TestSum()));
        }

        //検索用リスト新規作成
        List<Integer> list5 = new ArrayList<>();
        list5.addAll(Arrays.asList(10,2,3,5,10,6,8,9,10,50,1,2));

        //内容出力
        System.out.println("=============================list5出力=============================");
        System.out.println(list5);
        System.out.println("=====================list5検索 10の存在有無======================");
        System.out.println(list5.contains(10));
        System.out.println("=====================list5検索 10,1,5の存在有無==================");
        list5.contains(Arrays.asList(10,1,5));
        System.out.println("=====================list5検索 10の前方検索======================");
        System.out.println(list5.indexOf(10));
        System.out.println("=====================list5検索 10の後方検索======================");
        System.out.println(list5.lastIndexOf(10));
        System.out.println("=========================list5 一部抽出==========================");
        System.out.println(list5.subList(3, 7));
        System.out.println("=========================list5 昇順並替==========================");
        Collections.sort(list5,Integer::compareTo);
        System.out.println(list5);
        System.out.println("==============================終了=================================");
    }
}
