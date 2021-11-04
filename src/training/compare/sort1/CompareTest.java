package training.compare.sort1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class CompareTest {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(
                1,50,3,7,90,800,0,43,650,1000,2
                );
        List<String> list2 = Arrays.asList(
          "ん","あ", "か", "を","ば","い"
        );

        //表示
        System.out.println("============ List表示 ============");
        System.out.println("------ list1 ------");
        list1.forEach(System.out::println);
        System.out.println("------ list2 ------");
        list2.forEach(System.out::println);
        System.out.println();

        //並べ替え
        System.out.println("============ 並べ替え ============");
        System.out.println("------ list1 ------");
        System.out.println("----- 昇順 -----");
        list1.sort(Comparator.naturalOrder());
        list1.forEach(System.out::println);
        System.out.println("----- 降順 -----");
        list1.sort(Comparator.reverseOrder());
        list1.forEach(System.out::println);
        //list2
        System.out.println("------ list2 ------");
        System.out.println("----- 昇順 -----");
        list2.sort(Comparator.naturalOrder());
        list2.forEach(System.out::println);
        System.out.println("----- 降順 -----");
        list2.sort(Comparator.reverseOrder());
        list2.forEach(System.out::println);
        System.out.println("==================================\n");

        //オブジェクトの中身を並べ替え
        List<CompareData> cmp = new ArrayList<>(Arrays.asList(
                new CompareData("山田",50,80,100),
                new CompareData("高橋",80,70,60),
                new CompareData("鈴木",30,95,40)
        ));

        //オブジェクト内のデータを並べ替え
        System.out.println("======================== 並べ替え ========================");
        System.out.println("------------------ 国語 ------------------");
        System.out.println("----------------- 昇順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getJap));
        cmp.forEach(System.out::println);
        System.out.println("------------------ 数学 ------------------");;
        System.out.println("----------------- 昇順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getMath));
        cmp.forEach(System.out::println);
        System.out.println("------------------ 英語 ------------------");
        System.out.println("----------------- 昇順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getEng));
        cmp.forEach(System.out::println);
        System.out.println();

        //降順
        System.out.println("------------------ 国語 ------------------");
        System.out.println("----------------- 降順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getJap,Comparator.reverseOrder()));
        cmp.forEach(System.out::println);
        System.out.println("------------------ 数学 ------------------");
        System.out.println("----------------- 降順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getMath,Comparator.reverseOrder()));
        cmp.forEach(System.out::println);
        System.out.println("------------------ 英語 ------------------");
        System.out.println("----------------- 降順 -----------------");
        cmp.sort(Comparator.comparing(CompareData::getEng,Comparator.reverseOrder()));
        cmp.forEach(System.out::println);
        System.out.println();

        //合計順
        System.out.println("=====================合計=======================");
        cmp.sort(Comparator.comparing(CompareData::getTotal,Comparator.reverseOrder()));
        cmp.forEach(System.out::println);
        System.out.println("================================================");

    }

}
