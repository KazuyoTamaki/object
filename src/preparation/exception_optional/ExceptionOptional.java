package preparation.exception_optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Optionalクラス使用のスタック
/* **** 総称型について(授業で省略のためメモ) ****
 * Eってなに？⇒仮の型宣言、<E>と記述する。<　>は総称型のこと。
 * 使うときにEが具体例に書き換える（使用する型を一応限定できるらしい）
 * おそらくクラス宣言、変数宣言時に必須？（new ArrayList<>() は <>なので）
 * **** スタックについて(机上知識のみのためメモ) ****
 * FILO(FirstInLastOut)形式のデータ格納ができるもの。
 * サイズ指定ないところを見ると可変長で問題なし。
*/

class ExceptionOptional<E> {   //ここに<E>を追加
    private List<E> taskList;  //タスクリスト（データを入れる）を作成

    //作成時にリストを作る
    public ExceptionOptional() {
        this.taskList = new ArrayList<>();
    }

    //リストに値を追加し、出来たか出来ないかで審議値を返す。
    public boolean push(E task){
        return this.taskList.add(task);
    }

    //リストから値を返し、そのデータは消す（スタックのため）
    public Optional<E> pop(){          //戻り値は型が決まっていないOptional型オブジェクト、引数なし
        if(this.taskList.isEmpty()) {  //リストが空のとき（初期やデータをポップし空の時）はisEmptyを使う
            return Optional.empty();   //値を持たないOptionalオブジェクトを返す。
        }
        //リストが空でないとき、値を持つOptional型オブジェクトを返す。
        return Optional.of((this.taskList.remove(this.taskList.size() -1)));
        //なおスタックのためtaskListの最後の番地を指定し、削除(remove～)を記載
        //消しつつ値も返せる様子（前半で返し、後半で削除の命令）
    }

}
