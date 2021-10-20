package basic.sample;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String[] args) {
        //Mapの初期宣言
        Map<String, String> map = new HashMap<>(32);
        //要素の追加 ※順不同
        System.out.println("=======================データ入力=======================");
        map.put("apple","りんご");
        map.put("pineapple","パイナップル");
        map.put("orange","オレンジ");
        System.out.println("===========================表示=========================");
        //表示
        System.out.println(map);
        System.out.println("===========================個別=========================");
        //要素の取得
        System.out.println(map.get("apple")); //りんごのみ
        System.out.println(map.get("Grape")); //ぶどう（見つからない）
        System.out.println("===========================キー=========================");
        //キー一覧
        System.out.println(map.keySet());
        System.out.println("============================値==========================");
        //値一覧
        System.out.println(map.values());

        //キーと値を取得
        //Map.Entry型の変数が必要
        System.out.println("===========================表示=========================");
        for(Map.Entry entry:map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("===========================削除=========================");
        //要素の削除
        System.out.println(map.remove("orange"));//データが戻ってくる
        System.out.println("===========================更新=========================");
        //要素の変更（更新）
        //System.out.println(map.put("apple", "リンゴ"));//戻り値は前の値
        System.out.println("前の値:" + map.put("apple", "リンゴ") + " 変更後:" + map.get("apple"));//戻り値は前の値
        System.out.println("==========================再表示========================");
        //再表示
        System.out.println(map);
        System.out.println("===========================検索=========================");
        //キーによる検索（あり）
        String searchWord = "apple";                //検索ワードを入力
        if(map.containsKey(searchWord)){            //containsKeyで有無を確認
            System.out.println(map.get(searchWord));//あれば表示
        }else{
            System.out.println(searchWord + "は見つかりません。");//なかったら
        }
        System.out.println("===========================検索=========================");
        //キーによる検索（なし）
        searchWord = "orange";                //検索ワードを入力
        if(map.containsKey(searchWord)){            //containsKeyで有無を確認
            System.out.println(map.get(searchWord));//あれば表示
        }else{
            System.out.println(searchWord + "は見つかりません。");//なかったら
        }
        System.out.println("===========================終了=========================");

    }
}
