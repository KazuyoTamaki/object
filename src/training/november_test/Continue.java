package training.november_test;

public class Continue {
    public static void main(String[] args) {
        //iが3の倍数ならスルーし、他はprintlnで表示する
        for (int i = 1; i < 10; i++){
            if (i % 3 == 0){
                continue;   //continueはprintlnをスルーしてforの最初に戻る命令
            }
            System.out.println("i = " + i);
        }
        System.out.println("End");
    }
}
