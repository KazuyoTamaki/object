package training.map.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class MapSample {
    public static void main(String[] args) {
        //宣言
        Map<Integer,String> map1 = new HashMap<>();
        Map<String,Integer> map2 = new HashMap<>();
        Map<Integer,Double> map3 = new HashMap<>();

        map1.put(1,TestEnum.JANUARY.getJpName());
        map1.put(2,TestEnum.FEBRUARY.getJpName());
        map1.put(3,TestEnum.MARCH.getJpName());
        map1.put(4,TestEnum.APRIL.getJpName());
        map1.put(5,TestEnum.MAY.getJpName());
        map1.put(6,TestEnum.JUNE.getJpName());
        map1.put(7,TestEnum.JULY.getJpName());
        map1.put(8,TestEnum.AUGUST.getJpName());
        map1.put(9,TestEnum.SEPTEMBER.getJpName());
        map1.put(10,TestEnum.OCTOBER.getJpName());
        map1.put(11,TestEnum.NOVEMBER.getJpName());
        map1.put(12,TestEnum.DECEMBER.getJpName());

        map2.put("1月",31);
        map2.put("2月",28);
        map2.put("3月",31);
        map2.put("4月",30);
        map2.put("5月",31);
        map2.put("6月",30);
        map2.put("7月",31);
        map2.put("8月",31);
        map2.put("9月",30);
        map2.put("10月",31);
        map2.put("11月",30);
        map2.put("12月",31);

        map3.put(1,0.1);
        map3.put(2,0.2);
        map3.put(3,0.3);
        map3.put(4,0.4);
        map3.put(5,0.5);
        map3.put(6,0.5);
        map3.put(7,0.7);
        map3.put(8,0.1);

        //出力
        System.out.println("=================== 各Map出力 ===================");
        System.out.println("---------- Map1 ----------");
        for(Map.Entry entry: map1.entrySet()){
            System.out.println(String.format("key: %d  value: %s",entry.getKey(),entry.getValue()));
        }
        System.out.println("---------- Map2 ----------");
        for(Map.Entry entry: map2.entrySet()){
            System.out.println(String.format("key: %s  value: %d",entry.getKey(),entry.getValue()));
        }
        System.out.println("----------- Map3 ----------");
        for(Map.Entry entry: map3.entrySet()){
            System.out.println(String.format("key: %d  value: %.2f",entry.getKey(),entry.getValue()));
        }
        System.out.println("================= 各Map出力完了 =================");

        //表示
        System.out.println("=================================================== Map1 横出力 ===================================================");
        System.out.println("------------------------------------------------- キーと値 -------------------------------------------------");
        System.out.println(map1.toString());
        System.out.println(map2.entrySet().toString());
        System.out.println("------------------------------------------------- キーのみ -------------------------------------------------");
        System.out.println(map1.keySet());
        System.out.println("--------------------------------------------------- 値のみ---------------------------------------------------");
        System.out.println(map1.values());
        System.out.println("===================================================================================================================\n");

        //削除
        System.out.println("==================================================== Map3 削除 ====================================================");
        System.out.println("--------------------------- 削除前 ---------------------------");
        System.out.println(map3.toString());
        map3.remove(4);
        System.out.println("--------------------------- 削除後 ---------------------------");
        System.out.println(map3.toString());
        System.out.println("--------------------------- 削除前 ---------------------------");
        System.out.println(map2.toString());
        map2.clear();
        System.out.println("--------------------------- 削除後 ---------------------------");
        System.out.println("===================================================================================================================\n");

        //その他
        System.out.println("==================================================== その他Map処理 ====================================================");
        System.out.println("--------------------------- サイズ ---------------------------");
        System.out.println(String.format("Map1のサイズは %d です。",map1.size()));
        System.out.println(String.format("Map2のサイズは %d です。",map2.size()));
        System.out.println(String.format("Map3のサイズは %d です。",map3.size()));
        System.out.println("--------------------------- 要素の有無(空か) ---------------------------");
        System.out.println(map1.isEmpty());
        System.out.println(map2.isEmpty());
        System.out.println(map3.isEmpty());
        System.out.println("--------------------------- 要素の有無(検索) ---------------------------");
        System.out.println(map1.containsKey(1));
        System.out.println(map2.containsKey(1));
        System.out.println(map3.containsKey(5));
        System.out.println(map1.containsValue("師走"));
        System.out.println(map1.containsValue("新年"));
        System.out.println(map3.containsValue(0.2));
        System.out.println(map3.containsValue(100.0));

    }
}
