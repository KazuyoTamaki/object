package lecture.file;

import java.awt.image.DataBufferDouble;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

class fileTest {

    public static void main(String[] args) {
        //ファイル型変数にパスを設定（パスが入るだけ）
        //1はファイルを指定、2はフォルダを指定したとき
        File file1 = new File("C:/test/test.txt");
        File file2 = new File("C:/test/");

        /*
        //ファイル指定時のリスト表示 エラーになるのでコメントアウト
        for(String file : file1.list()){
            System.out.println(file);
        }*/

        //file1 を直接表示（C:\test\test.txtが表示される）
        System.out.println(file1);

        //フォルダ指定時のリスト表示
        //test.txt test2.txt test3.bmp が表示される。
        for(String file : file2.list()){
            System.out.println(file);
        }

        System.out.println();

        //Pathクラスのテスト
        Path path1 = Paths.get("C:/test/test.txt");
        System.out.println(path1); //入力されたパスを出力するだけ

        //テキストファイル読み込み
        System.out.println("\n========== テキストファイル読込 ==========");
        Path path3 = Paths.get("C:/test/test.txt"); //パスの設定
        try(BufferedReader reader = Files.newBufferedReader(path3, StandardCharsets.UTF_8)){  //ストリームでファイルを七衛
            reader.lines()                         //作成処理
                    .forEach(System.out::println); //最終処理 一行ずつ中身を表示
        }catch (IOException ex){
            System.err.println(ex);
        }
        System.out.println("================== 完了 ==================");

    }
}
