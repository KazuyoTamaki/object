package training.extend.extend_interface;

public class InterfaceSample {
    public static void main(String[] args) {
        //インスタンス作成（配列方式）
        Player[] player = {
                new Player(1,2),
                new Player(2,3),
                new Player(3,2),
                new Player(100,0)
        };

        //拡張For文で結果表示
        for(Player player1:player){
            System.out.println("======================================実行結果======================================");
            System.out.println(String.format("機能1: %s  機能2 :%s 機能3: %s",player1.playResult_Play(),player1.playResult_Stop(),player1.playHighSpeed()));
        }
        System.out.println("====================================================================================");
    }
}
