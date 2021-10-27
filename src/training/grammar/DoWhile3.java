package training.grammar;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        String str = "";
        //ループ
        do{
            Scanner in = new Scanner(System.in);
            System.out.println("パスワードを入力してください。");
            str = in.nextLine();//キーボード入力
            if(!"abc".equals(str)) System.out.println("誤りです。");
        }while (!"abc".equals(str));
        System.out.println("正解です。処理を終了します。");

        //whileの場合
        /*
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを入力してください");
        String str = in.nextLine();//キーボード入力

        while (!"abc".equals(str)) {
            System.out.println("パスワードが違います");
            str = in.nextLine();
        }
        System.out.println("OK");*/
    }
}
