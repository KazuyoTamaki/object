package preparation.exception_basic;

import java.io.FileNotFoundException;
import java.io.FileReader;

//ファイルを読み込みし、ファイルがないためエラーになる例
//try~catchはセット、finallyは現在なし(try-with-resource)
// https://java-code.jp/144
class ExceptionBasic {
    public static void main(String[] args) {

        //インスタンス化してもクラス名ではないらしい
        SampleClass sampleClass1 = new SampleClass();

        System.out.println("\n--------------- try-with-resourceにてテスト ---------------\n");
        //単体
        System.out.println("==================== ファイル読み込み ====================");
        try {
            FileReader r = new FileReader("sample.txt");
            System.out.println("ファイルを読み込みました");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しませんでした");
            //原因(ファイルがない＝null)
            System.out.println(e.getCause());
            //原因(どの箇所が問題か)
            System.out.println(e.getMessage());
        }
        System.out.println("==================== ファイル読込  完 ====================");

        System.out.println("======================= Class読込 ========================");
        try {
            Class c = Class.forName("sampleClass1");
            System.out.println("クラスを読み込みました");
        } catch (ClassNotFoundException e) {
            System.out.println("クラスが存在しませんでした");
            //原因(ファイルがない＝null)
            System.out.println( "e.getCause() : "+ e.getCause());
            //原因(どの箇所が問題か)
            System.out.println("e.getMessage() :"+ e.getMessage());
        }
        System.out.println("===================== Class読み込み 完 ===================\n");

        //複数条件、前がNGなら後ろはスルーされる
        System.out.println("=================== ファイル読込+Class ===================");
        System.out.println("======================== 複数catch =======================");
        try {
            FileReader read = new FileReader("sample.txt");
            System.out.print("ファイルを読み込みました");
            Class c = Class.forName("sampleClass");
            System.out.println("クラスを読み込みました");
        } catch (FileNotFoundException e) {
            System.out.println("ファイルが存在しませんでした");
            //原因(ファイルがない＝null)
            System.out.println( "e.getCause() : "+ e.getCause());
            //原因(どの箇所が問題か)
            System.out.println("e.getMessage() :"+ e.getMessage());
            System.out.println("クラスはスルーします");
        } catch (ClassNotFoundException e) {
            System.out.println("クラスが存在しませんでした");
        }
        System.out.println("================== ファイル読込+Class 完 =================\n");

        //どちらかエラーなら返すバージョン
        System.out.println("=================== ファイル読込+Class ===================");
        System.out.println("===================== マルチキャッチ =====================");
        try {
            Class c = Class.forName("sampleClass");
            System.out.println("クラスを読み込みました");
            FileReader read = new FileReader("sample.txt");
            System.out.print("ファイルを読み込みました");
        } catch (FileNotFoundException | ClassNotFoundException e) {
            System.out.println("ファイルが存在しませんまたはクラス読み込みに失敗しました。");
            //原因(ファイルがない＝null)
            System.out.println( "e.getCause() : "+ e.getCause());
            //原因(どの箇所が問題か)
            System.out.println("e.getMessage() :"+ e.getMessage());
            //ログ表示(スタックトレース)
            e.printStackTrace();
        }
        System.out.println("================== ファイル読込+Class 完 =================\n\n");
        System.out.println("=========================  ログ  =========================");
        /*
        java.lang.ClassNotFoundException: sampleClass
	    at java.base/jdk.internal.loader.BuiltinClassLoader.loadClass(BuiltinClassLoader.java:582)
	    at java.base/jdk.internal.loader.ClassLoaders$AppClassLoader.loadClass(ClassLoaders.java:178)
	    at java.base/java.lang.ClassLoader.loadClass(ClassLoader.java:521)
	    at java.base/java.lang.Class.forName0(Native Method)
	    at java.base/java.lang.Class.forName(Class.java:315)
	    at preparation.exception_basic.ExceptionBasic.main(ExceptionBasic.java:61)
         */
    }

}
