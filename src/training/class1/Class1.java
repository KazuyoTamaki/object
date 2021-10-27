package training.class1;

class Class1 {
    public static void main(String[] args) {
        //変数宣言
        int num = 5;
        //インスタンス作成
        Sum1 sum1 = new Sum1(num);
        //メソッド（Sum1のSum1を実行）→インスタンス名がsum1の元のクラスと型はSum1(引数）※コンストラクタの引数があるため
        //引数はクラスのトップに記載する必要はないが、コンストラクタ (初期値設定)では引数ありとなる。
        //numはsum1の中にある変数なので、numの宣言はパッケージプライベート以上のアクセス修飾子が必要
        //そして、sum1の中の変数の指定は、sum1.XXX(変数名)となる。
        //よって、Sum1()もsum1.Sum1()という書き方になる。
        System.out.println(String.format("入力値 num = %d  中の数値 %d 計算後 sum1 = %d ",num,sum1.num,sum1.Sum1sum()));
    }
}
