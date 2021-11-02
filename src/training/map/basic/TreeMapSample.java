package training.map.basic;

import java.util.Map;
import java.util.TreeMap;

class TreeMapSample {
    public static void main(String[] args) {
        //線gね
        Map <Integer,String> map1 = new TreeMap<>();
        //入力 キーと値をわざと逆にしてみる
        map1.put(100,"a");
        map1.put(1,"c");
        map1.put(5,"z");

        //キー順か、値順かを確認表示
        System.out.println(map1.entrySet().toString());
    }
}
