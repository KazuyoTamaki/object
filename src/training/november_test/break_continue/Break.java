package training.november_test.break_continue;

class Break {
    public static void main(String[] args) {
        //iが5の倍数なら処理を中断、他はprintlnで表示する
        System.out.println("=========== 処理を開始します ===========");
        for (int i = 1; i < 10; i++){
            if (i % 5 == 0){
                System.out.println("=== i = " + i +"のためbreak処理を実行します ===");
                break;   //breakはforないしwhileからぬける
            }
            System.out.println("i = " + i);
        }
        System.out.println("================== End ==================\n");


        //iが8の倍数なら処理を中断、他はprintlnで表示する
        System.out.println("=========== 処理を開始します ===========");
        int i = 1;
        while(i <= 10){
            if(i % 8 == 0 ){
                System.out.println("=== i = " + i +"のためbreak処理を実行します ===");
                break;
            }
            System.out.println("i = " + i);
            i++;
        }
        System.out.println("================== End ==================\n");

        //9の倍数
        System.out.println("=========== 処理を開始します ===========");
        i = 1;
        do{
            if(i % 9 == 0 ){
                System.out.println("=== i = " + i +"のためbreak処理を実行します ===");
                break;
            }
            System.out.println("i = " + i);
            i++;
        }while(i <= 10);
        System.out.println("================== End ==================");
    }
}

