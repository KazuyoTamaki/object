package basic.sample;

import java.util.Arrays;

class StringSample {
    public static void main(String[] args) {
        String word1 = "aaa";
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#concat(java.lang.String)
        //文字列結合(2つまで)
        System.out.println("========concatの練習========");
        System.out.println(word1);
        System.out.println("bbb");
        System.out.println("========結合========");
        System.out.println(word1.concat("bbb"));

        //文字列の分割
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#split(java.lang.String,int)
        System.out.println("\n========文字列を分割========");
        String sentence = "1-1,田巻あんず,女,80,70,90";
        String[] data = sentence.split(",",6);
        System.out.println(Arrays.toString(data));

        //
        System.out.println("\n========1項目ごと出力========");
        for(String datas : data){
            System.out.println(datas);
        }

        //文字列結合
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html
        System.out.println("\n========文字列合体========");
        String joinWord = String.join(" ",data);
        System.out.println(joinWord);

        //文字列の置き換え
        //is をat に変更（個数問わず）
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#replace(char,char)
        System.out.println("\n========文字列置き換え========");
        String original = "This is a pen.";
        System.out.println(original);
        String replace = original.replace("is","at");
        System.out.println(replace);

        //文字列検索
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#indexOf(java.lang.String)
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#lastIndexOf(int)
        System.out.println("\n========文字列検索========");
        sentence = "This is a pen.";
        System.out.println(sentence);
        int index = sentence.indexOf("is");
        System.out.println(index);
        System.out.println("※先頭文字が0になるため");
        System.out.println("\n========見つからない場合========");
        index = sentence.indexOf("aaa");
        System.out.println(index); //-1

        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html
        System.out.println("\n========文末検索========");
        System.out.println(sentence.endsWith("."));
    }
}
