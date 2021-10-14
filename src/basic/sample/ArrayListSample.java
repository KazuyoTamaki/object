package basic.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListSample {
    public static void main(String[] args) {
        //宣言と初期化
        List<Integer> list = new ArrayList<>();
        System.out.println(list);  //[] toString不要

        //初期化
        list.addAll(Arrays.asList(20,10,40,30,50));

        //表示
        System.out.println(list);  //[20, 10, 40, 30, 50]

        //要素の追加
        list.add(60);
        System.out.println(list);
        list.add(2,70);
        System.out.println(list);

        //要素の上書き
        list.set(0,80);
        System.out.println(list);

        //要素の削除
        list.remove(2);
        System.out.println(list);

        list.removeAll(Arrays.asList(30,60));
        System.out.println(list); //[80, 10, 40, 50]

        //インデックスを指定して要素を取得
        System.out.println(list.get(3)); //50

        //サイズ
        System.out.println(list.size()); //4

        //一部の要素の取得
        System.out.println(list.subList(1,3)); //[10, 40]

        //要素の消去
        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());//true

        System.out.println("初期化中");
        //初期化
        list.addAll(Arrays.asList(20,10,40,30,50,30));
        System.out.println(list);

        //検索
        System.out.println("=========検索=========");
        System.out.println(list.contains(50)); //true
        System.out.println(list.contains(3)); //false
        System.out.println("----------検索2---------");
        System.out.println(list.containsAll(Arrays.asList(10,20)));

        //検索3
        System.out.println("----------検索3---------");
        int num = 30;
        if(list.contains(num)){
            System.out.println("検索値: "+ num );
            System.out.println("--------前から検索-------");
            System.out.println(list.indexOf((num)));
            System.out.println("--------後ろから検索-----");
            System.out.println(list.lastIndexOf((num)));
        }//この後答えをgetに使うと値がとれる

        System.out.println("=========並べ替え==========");
        System.out.println("------------昇順-----------");
        list.sort(Comparator.naturalOrder());
        System.out.println(list);
        System.out.println("------------降順-----------");
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
    }
}
