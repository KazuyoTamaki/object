package lecture.exception;

import java.lang.*;

class exceptionTest {
    public static void main(String[] args) {
        int[] numArray = {1,2,3};
        //配列のインデックス外エラーをわざと返すために、0～3番地を指定
        //try～catch構文で記述
        try{  //ここからエラーを起こす可能性がある処理
            for (int i = 0; i < 4; i++) {
                System.out.print(numArray[i] + " ");
            }
        } catch (ArrayIndexOutOfBoundsException e) {     //上のエラーが生まれたら、catch以下の処理を行う
            System.out.println("\nインデックスエラーです。指定を見直してください。");   //ただの開業
            e.printStackTrace();    //エラーのメッセージを返す処理
        }finally {                  //エラーがあってもなくても最後にやる処理
            System.out.println("完了しました。");
        }
    }
}
