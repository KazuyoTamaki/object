package basic.human1;

class ReferenceSample {
    public static void main(String[] args) {
        //変数の宣言（インスタンスの作成）
        Human human1 = new Human("Tom",28);
        Human human2 = human1;            //参照型の変数のため、human1が変わるとhuman2も変わる
        Human human3 = new Human(human1); //human1の情報をもとに、新しくhuman3インスタンスを作成する

        System.out.println(human1); //トム
        System.out.println(human2); //トム
        System.out.println(human3); //トム

        human1.setName("Nancy");
        System.out.println(human1); //ナンシー
        System.out.println(human2); //ナンシー（！？）　参照型のため、シャローコピーとなる。
        System.out.println(human3); //トム　コンストラクタのオーバーロードの結果(Human.javaの16行目)
    }
}
