package training.compare.sort2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CompareTest {
    public static void main(String[] args) {
        //オブジェクトの中身を並べ替え(データはsort1と同じ)
        List<CompareData> cmp = new ArrayList<>(Arrays.asList(
                new CompareData("山田",50,80,100),
                new CompareData("高橋",80,70,60),
                new CompareData("鈴木",30,95,40)
        ));

        System.out.println("============================ 一覧表示 ============================");
        //一覧表示
          cmp.forEach(System.out::println);
        System.out.println("-------------------------------------------------------------\n");

        //合計
        //昇順
        System.out.println("========================== 合計並べ替え ==========================");
        System.out.println("-------------------- 昇順 ------------------------------");
        cmp.sort(Comparator.naturalOrder());
        cmp.forEach(System.out::println);
        System.out.println("-------------------- 降順 ------------------------------");
        cmp.sort(Comparator.reverseOrder());
        cmp.forEach(System.out::println);
        System.out.println("============================== 終了 ==============================");
    }

}
