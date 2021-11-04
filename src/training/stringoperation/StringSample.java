package training.stringoperation;

public class StringSample {
    public static void main(String[] args) {
        //文字列の理解を深める
        String str1 = "abc";
        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);

        //表示
        System.out.println("==========================文字列表示==========================");
        System.out.println(String.format("str1   = %s ",str1));
        System.out.println(String.format("data[] = %s ",data));
        System.out.println(String.format("str3   = %s ",str2));
        //文字列7の塊が同じか比較
        System.out.println("==========================等価性比較==========================");
        System.out.println(String.format("str1 = data[] は %b です",str1.equals(data)));
        System.out.println(String.format("str1 = str2   は %b です",str1.equals(str2)));

        //文字列結合
        System.out.println("==========================文字列結合==========================");
        System.out.println(String.format("str1 \"+\" str2 = %s",str1+str2));
        //StringBuilderを使った文字列結合
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);
        System.out.println("StringBuilder str1,str2 = " + builder.toString());
        //concatメソッド使用
        System.out.println(String.format("concat str1,str2 = %s",str1.concat(str2)));
        System.out.println("==========================結合比較==========================");
        System.out.println("+とBuilder比較 : " + (str1+str2).equals(builder.toString()));
        System.out.println("+とconcat比較  : " + (str1+str2).equals(str1.concat(str2)));
        System.out.println("Builderとconcat比較 : " + builder.toString().equals(str1.concat(str2)));
        System.out.println("======================.toSting無で比較======================");
        System.out.println("+とBuilder比較 : " + (str1+str2).equals(builder));
        System.out.println("Builderとconcat比較 : " + builder.equals(str1.concat(str2)));

        System.out.println();

        //ここから分割
        String str5 = "abc def ghi jkl";
        String str6 = "abc,def,ghi,jkl";
        String str7 = "abc-def-ghi-jkl";
        System.out.println("==========================文字列表示==========================");
        System.out.println("str5 = " + str5);
        System.out.println("str6 = " + str6);
        System.out.println("str7 = " + str7);

        //分割
        System.out.println("==========================文字列分割==========================");
        String[] str8 = str5.split(" ");
        String[] str9 = str6.split(",");
        String[] str10 = str7.split("-");
        System.out.println("==========================分割後表示==========================");
        System.out.println("------- str8 -------");
        for(String str : str8){
            System.out.println("str8 : " + str);
        }
        System.out.println("------- str9 -------");
        for(String str : str9){
            System.out.println("str9 : " + str);
        }
        System.out.println("------- str10 -------");
        for(String str : str10){
            System.out.println("str10 : " + str);
        }
        System.out.println("--------------------");

        //結合
        System.out.println("==========================文字列結合==========================");
        System.out.println("str8  = " + String.join(" ",str8));
        System.out.println("str9  = " + String.join(",",str9));
        System.out.println("str10 = " + String.join("-",str10));

        //置換
        System.out.println("========================== 置換 ==========================");
        System.out.println("abcをABCに置換" + str5.replace("abc","ABC"));
        System.out.println("defをDEFに置換" + str6.replace("def","DEF"));
        System.out.println("ghiをGHIに置換" + str7.replace("ghi","GHI"));

        //検索
        System.out.println("========================== 検索 ==========================");
        System.out.println("abcを検索 : " + str5.indexOf("abc"));
        System.out.println(",を検索   : " + str6.lastIndexOf(","));
        System.out.println("xyzを検索 : " + str7.indexOf("xyz"));
        System.out.println("abcで始まっているか : " + str5.startsWith("abc"));
        System.out.println("ghiで終わっているか : " + str6.endsWith("ghi"));
        System.out.println("abcで終わっているか : " + str7.endsWith("ghi"));

        //ワイルドカード
        System.out.println("======================== 正規表現 ========================");
        String regex = "[a-z]";
        System.out.println("a-zか : " + str5.matches(regex));
        regex = "[0-9]";
        System.out.println("0-9か : " + str6.matches((regex)));
        System.out.println("========================= 完了 ===========================");
    }
}
