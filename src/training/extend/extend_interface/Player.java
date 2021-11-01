package training.extend.extend_interface;

//インターフェース読み込み
class Player implements InterfacePlayer ,InterfaceHighSpeed {
    private int playFunction;
    private int getPlayFunction2;
    private String playResult1;
    private String playResult2;
    private  String playResult3;

    //コンストラクタ
    public Player(int playFunction, int getPlayFunction2) {
        this.playFunction = playFunction;
        this.getPlayFunction2 = getPlayFunction2;
    }

    //InterfacePlayer の指定メソッドをオーバーライド 1
    @Override
    public String playResult_Play() {
        if (playFunction == 1) playResult1 = "再生";
        else if (playFunction == 2) playResult1 = "ステップ再生";
        else if (playFunction == 3) playResult1 = "二倍速";
        else playResult1="その機能はありません";
        return playResult1;
    }

    //InterfacePlayer の指定メソッドをオーバーライド 2
    @Override
    public String playResult_Stop() {
        if (playFunction == 1) playResult2 = "停止";
        else if (playFunction == 2) playResult2 = "一時停止";
        else if (playFunction == 3) playResult2 = "スキップ";
        else playResult2="その機能はありません";
        return playResult2;
    }

    //InterfaceHighSpeed の指定メソッドをオーバーライド
    //試しにswitch文を使用
    @Override
    public String playHighSpeed() {
        switch ( getPlayFunction2){
            case 1:
                playResult3 = "等速";
                break;
            case 2:
                playResult3 = "二倍速";
                break;
            case 3:
                playResult3 = "三倍速";
                break;
            default:
                playResult3 = "その機能はありません";
        }
        return playResult3;
    }
}
