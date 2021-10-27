package training.grammar;

class DoWhile2 {
    public static void main(String[] args) {
        //使用する配列と、制御変数iの初期化
        int[] array = {1,2,3,5,4};
        int i = 0;

        System.out.println("================処理開始================");
        //ループ開始
        do{
            System.out.println("================処理================");
            //最初は処理を行い、制御変数iをインクリメント
            System.out.println(String.format("%d回目、配列array[%d] = %d",i,i,array[i]));
            i++;
            //array[i]の中身が正の数の間行う処理のため、
            //配列の欄外に出ないように中断条件を設置、break命令で脱出
            System.out.println(String.format("--------配列欄外チェック--------"));
            if(i>=array.length) {
                System.out.println("  処理終了");
                break;//変数iが配列の大きさを越えたら中断
            }
            else System.out.println("  処理継続");
            //ループする条件を記載(;)をぬかさないように注意
        }while(array[i] >= 0);
        System.out.println("================終了================");
    }



    /*
    //whileの場合
    public static void main(String[] args) {
        int[] array = {1,2,3,5,4};
        int i = 0;
        while (array[i]>=0) {
            System.out.println(array[i]);
            i++;
            if(i>=array.length) break;//変数iが配列の大きさを越えたら中断
        }
    }*/

}
