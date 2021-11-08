package training.exception;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class FileReader {

    static void read() {
        String dir = "D:\\workspace";
        String filename = "test2.txt";
        // 存在しないファイルを読みに行って例外(IOException)が発生
        try {
            List<String> line = Files.readAllLines(Paths.get(dir, filename),
                    Charset.forName("SHIFT_JIS"));
        } catch (IOException e) {
            //エラーの原因　null
            System.out.println("======= e.getCause() =======");
            System.out.println(e.getCause());
            //エラーのメッセージ　D:\workspace\test2.txt
            System.out.println("======= e.getMessage() =======");
            System.out.println(e.getMessage());
            //
            System.out.println("======= e.printStackTrace() =======");
            e.printStackTrace();
            //e.getStackTrace()は一行ずつ読みだす必要あり。e.printStackTrace()はprintなので全部出力
            /*System.out.println("======= e.getStackTrace() =======");
            for(Object obj:e.getStackTrace()){
                System.out.println(obj);
            }*/
        }
    }
}


