package lecture.exception;

import java.io.IOException;

//例外処理（スロー)
class throwsException {
    //メソッドを呼び出す
    public static void main(String[] args) {//例外をスローされるので、try～catch記述が必要
        try{                                //readFile()を呼ぶメソッドには必須(逆強制)
            readFile("/text.txt"); //メソッドreadFile()を実行※エラー行
        }catch(IOException e){              //エラーが返ってきたらこれ以下を実行
            System.out.println("ファイルの読み込みに失敗しました"); //メッセージ
            e.printStackTrace();            //ログ出力
        }
    }

    //エラーを返すだけのメソッド
    static void readFile(String filepath)throws IOException{
        throw new IOException(); //とりあえずIOエラーを作成して返す。本来は読み込む
    }                            //上がエラー行になる
}


