package preparation.exception_basic;

import java.io.FileNotFoundException;
import java.io.FileReader;

//ファイルを読み込みし、ファイルがないためエラーになる例
//try~catchはセット、finallyは現在なし
class ExceptionBasic {
    public static void main(String[] args) {
        //単体
        System.out.println("==================== ファイル読み込み ====================");
        try {
            FileReader r = new FileReader("sample.txt");
            System.out.println("ファイルを読み込みました");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しませんでした");
        }
        System.out.println("==================== ファイル読込  完 ====================");

        System.out.println("======================= Class読込 ========================");
        try {
            Class c = Class.forName("sampleClass");
            System.out.println("クラスを読み込みました");
        } catch (ClassNotFoundException e) {
            System.out.println("クラスが存在しませんでした");
        }
        System.out.println("===================== Class読み込み 完 ===================");

        //複数条件、前がNGなら後ろはスルーされる
        System.out.println("=================== ファイル読込+Class ===================");
        try {
            FileReader read = new FileReader("sample.txt");
            System.out.print("ファイルを読み込みました");
            Class c = Class.forName("sampleClass");
            System.out.println("クラスを読み込みました");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しませんでした");
            System.out.println("クラスはスルーします");
        } catch (ClassNotFoundException e) {
            System.out.println("クラスが存在しませんでした");
        }
        System.out.println("================== ファイル読込+Class 完 =================");
    }

}
