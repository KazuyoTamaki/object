package training.november_test;

class Continue {
    public static void main(String[] args) {
        //iが3の倍数ならスルーし、他はprintlnで表示する
        System.out.println("=========== 処理を開始します ===========");
        for (int i = 1; i < 10; i++){
            if (i % 3 == 0){
                System.out.println("=== i = " + i +" のためcontinue処理を実行します ===");
                continue;   //continueはprintlnをスルーしてforの最初に戻る命令
            }
            System.out.println("i = " + i);
        }
        System.out.println("==================== End ====================\n");

        //iが7の倍数ならスルーし、他はprintlnで表示する
        System.out.println("=========== 処理を開始します ===========");
        int i = 1;
        while(i <= 15){
            if (i % 7 == 0){
                System.out.println("=== i = " + i +" のためcontinue処理を実行します ===");
                i = i + 1;
                continue;   //continueはprintlnをスルーしてforの最初に戻る命令
            }
            System.out.println("i = " + i);
            i = i + 1;
        }
        System.out.println("==================== End ====================\n");

        //iが6の倍数ならスルーし、他はprintlnで表示する
        System.out.println("=========== 処理を開始します ===========");
        i=1;
        do{
            if (i % 6 == 0){
                System.out.println("=== i = " + i +" のためcontinue処理を実行します ===");
                i = i + 1;
                continue;   //continueはprintlnをスルーしてforの最初に戻る命令
            }
            System.out.println("i = " + i);
            i = i + 1;
        }while(i <= 15);
        System.out.println("==================== End ====================\n");

    }
}
