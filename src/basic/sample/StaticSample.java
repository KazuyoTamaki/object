package basic.sample;

class StaticSample {
    //staticメソッドのサンプル
    /**
     * 足し算をするメソッド add
     * @param x ひとつめの整数
     * @param y 二つ目の整数
     * @return 合計
     */
    //function型(引数と戻り値がある)
    static int add(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(StaticSample.add(10,20)); //staticなのでnewがいらない
        int ans = add(100,50);
        System.out.println(ans);
    }
}
