package training.map.application.test;
//GenderがすでにあるためTestをつけました
enum GenderTest {
    //定数宣言
    MEN("男"),
    WOMEN("女"),
    OTHER("その他");

    //変数宣言
    private String jpGender;

    //コンストラクタ
    GenderTest(String jpGender) {
        this.jpGender = jpGender;
    }

    //ゲッター
    public String getJpGender() {
        return jpGender;
    }
}
