package ex.item;

import java.util.HashMap;
import java.util.Map;

class ItemSearch {

    public static void main(String[] args) {
        Map<Integer, Item> itemMap = new HashMap<>();
        itemMap.put(1, new Item(1, "消しゴム", 100));
        itemMap.put(2, new Item(2, "ボールペン", 120));
        itemMap.put(3, new Item(3, "コンパス", 400));
        itemMap.put(4, new Item(4, "定規", 200));
        itemMap.put(5, new Item(5, "ノート", 140));
        itemMap.put(6, new Item(6, "付箋", 480));
        itemMap.put(7, new Item(7, "えんぴつ", 500));

        /*  下とイコールの処理
        for (Map.Entry entry : itemMap.entrySet()) {
            System.out.println(entry.getValue());
        }

        for(Item items : itemMap.values()){
            System.out.println(items);
        }*/

        itemMap.values().forEach(System.out::println);

        System.out.println("");

        int searchNo = 1;
        for (int i = 0; i < 2; i++) {
        System.out.println("商品ID" + searchNo + "による検索");
        if (itemMap.containsKey(searchNo)) {            //containsKeyで有無を確認
            System.out.println(itemMap.get(searchNo));//あれば表示
        } else {
                System.out.println("該当商品はありません。");//なかったら
        }
        System.out.println();
        searchNo = 10;
        }
    }
}

