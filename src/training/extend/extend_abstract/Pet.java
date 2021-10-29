package training.extend.extend_abstract;

abstract class Pet {
    //変数の宣言自体はOK
    int a;

    //上書きを強制したいサブクラスのメソッドを記載
    abstract void returnPets();

    //空っぽ、使用しなくてもOKか？
    abstract void testPets();

}
