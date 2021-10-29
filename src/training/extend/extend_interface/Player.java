package training.extend.extend_interface;

class Player implements InterfacePlayer {
    private int playFunction;
    private String playResult1;
    private String playResult2;

    public Player(int playFunction) {
        this.playFunction = playFunction;
    }


    @Override
    public String playResult_Play() {
        if (playFunction == 1) playResult1 = "再生";
        else if (playFunction == 2) playResult1 = "ステップ再生";
        else if (playFunction == 3) playResult1 = "二倍速";
        else playResult1="その機能はありません";
        return playResult1;
    }

    @Override
    public String playResult_Stop() {
        if (playFunction == 1) playResult2 = "停止";
        else if (playFunction == 2) playResult2 = "一時停止";
        else if (playFunction == 3) playResult2 = "スキップ";
        else playResult2="その機能はありません";
        return playResult2;
    }
}
