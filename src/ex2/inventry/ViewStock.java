package ex2.inventry;

import java.util.*;

//初期定義と基本的に金額を引き出すクラス
class ViewStock {
    public static void main(String[] args) {
        List<PersonalComputer> pcList = new ArrayList<>();

        pcList.addAll(Arrays.asList(
                new PersonalComputer("やまだ", 1, 1, 40_000, Constants.BIT_64, Constants.WINDOWS_10),
                new PersonalComputer("いけだ", 2, 1, 90_000, Constants.BIT_64, Constants.WINDOWS_10),
                new PersonalComputer("いのうえ", 3, 1, 80_000, Constants.BIT_64, Constants.WINDOWS_10),
                new PersonalComputer("たむら", 4, 2, 120_000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("わだ", 5, 2, 30_000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("くどう", 6, 2, 150_000, Constants.BIT_64, Constants.WINDOWS_10),
                new PersonalComputer("さらど", 7, 3, 40_000, Constants.BIT_32, Constants.WINDOWS_10),
                new PersonalComputer("あいざわ", 8, 3, 70_000, Constants.BIT_32, Constants.WINDOWS_10)
        ));


        //倉庫No:Int 価格:Int
        Map<Integer, ArrayList<Integer>> storagePriceMap = new HashMap<>();

        //リスト内 ここは上の初期化で実行されてるので、おそらくは実行されない。
        for (PersonalComputer p : pcList) {
            int storageNo = p.getStorageNo(); //何度も使用するため変数に格納する
            if (!storagePriceMap.containsValue(storageNo)) {          //storagePriceMapにstorageNoがない場合
                storagePriceMap.put(storageNo, new ArrayList<>());  //新しい倉庫Noをつくる
            }                                                       //万が一一致したら上書きを行うため、念のためチェック
            //storagePriceMap.put(storageNo,);//価格を追加
            storagePriceMap.get(storageNo).add(p.getPrice());
        }

        //デバッグ
        System.out.println("StoragePriceMapの中身確認");
        for (Map.Entry entry : storagePriceMap.entrySet()) {
            System.out.print("倉庫番号 " + entry.getKey() + ":");
            System.out.print(entry.getValue() + "\n");
        }

    }
}
