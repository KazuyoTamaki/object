package basic.sample.hashsetsample;

import java.util.*;

//ハッシュサンプル
public class HashSetSample {
    public static void main(String[] args) {
        //宣言
        Set<Integer> integerSet = new HashSet<>();
        //値の追加
        integerSet.add(10);
        integerSet.addAll(Arrays.asList(20,30));
        System.out.println(integerSet); //出力（ランダム）10と20と30

        //削除
        integerSet.remove(20);
        System.out.println(integerSet);//10と30が出る

        //要素数 2こ
        System.out.println(integerSet.size());
        //値があるか true
        System.out.println(integerSet.contains(10));
        //空か false
        System.out.println(integerSet.isEmpty());

        //ArrayListからの変換
        //ArrayList宣言
        List<Integer>integerList = new ArrayList<>(Arrays.asList(3,9,1,6,1,2,9));
        //リスト表示
        System.out.println("ArrayList:" + integerList);
        //ツリーリストへセット
        Set<Integer>integerSet1 = new TreeSet<>(integerList);
        System.out.println("TreeHashList:"+ integerSet1);
        //リンクセット
        Set<Integer>integerSet2 = new LinkedHashSet<>(integerList);
        System.out.println("LinkedHashSet:" + integerSet2);

    }
}
