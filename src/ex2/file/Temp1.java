package ex2.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

class Temp1 {
    public static void main(String[] args) {
        //question1();  //作成メソッドの実行 ※staticなのでnew宣言不要
        //question1_2();  //作成メソッドの実行 ※staticなのでnew宣言不要
        //question2();
        //question2_2();
        question3();
    }

    //相対パス指定でtemp.txtを作るプログラム
    public static void question1() {
        String filePath = "./src/ex2/file/";  //path
        String fileName = "temp.txt";        //filename
        if (Files.notExists(Path.of(filePath, fileName))) {
            try {
                Files.createFile(Path.of(filePath, fileName));
            } catch (java.io.IOException e) {
                e.getStackTrace();
            }
        }
    }

     /* public static void question1_2(){
        String filePath = "";  //path
        String fileName = "temp2.txt";        //filename
        if(Files.notExists(Path.of(filePath,fileName))){
            try{
                Files.createFile(Path.of(filePath,fileName));
            }catch(java.io.IOException e){
                e.getStackTrace();
            }
        }
    }*/

    public static void question2() {
        String filePath = "./src/ex2/file/";  //path
        String fileName = "temp.txt";        //filename
        Path path = Path.of(filePath, fileName);
        //System.out.println(path);
        try (BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {
            writer.append("aaaa");
            writer.newLine();
            writer.append("bcd");
            writer.newLine();
            writer.append("1234567890");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public static void question2_2() {
        String filePath = "./src/ex2/file/";  //path
        String fileName = "temp.txt";        //filename
        Path path = Path.of(filePath, fileName);
        if (Files.exists(path)) {
            List<String> list = Arrays.asList("aaa", "bb", "c");
            try {
                Files.write(path, list);
            } catch (java.io.IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void question3(){
        String filePath = "./src/ex2/file/";  //path
        String fileName = "temp.txt";        //filename
        Path path = Path.of(filePath, fileName);
        if (Files.notExists(path)) {
            System.out.println("error file not found.");
        }else {
            try {
                Files.lines(path)
                        .forEach(System.out::println);
            }catch (java.io.IOException e){
                e.printStackTrace();
            }
        }
        /*if (Files.exists(path)) {
            try{
                System.out.println(Files.readAllLines(path));
            }catch (IOException e){
                e.printStackTrace();
            }
        }*/
    }
}
