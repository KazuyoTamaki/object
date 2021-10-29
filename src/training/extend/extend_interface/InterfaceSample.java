package training.extend.extend_interface;

public class InterfaceSample {
    public static void main(String[] args) {

        Player[] player = {
                new Player(1),
                new Player(2),
                new Player(3),
                new Player(100)
        };

        for(Player player1:player){
            System.out.println("===================実行結果===================");
            System.out.println(String.format("機能1: %s  機能2 :%s",player1.playResult_Play(),player1.playResult_Stop()));
        }
    }
}
