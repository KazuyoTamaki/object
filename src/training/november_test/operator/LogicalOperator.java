package training.november_test.operator;

//論理演算子
class LogicalOperator {
    public static void main(String[] args) {
        boolean booleanA = true;
        boolean booleanB = false;

        System.out.println("====================== 論理演算子 ======================");
        System.out.println("========================= 出力 =========================");
        System.out.println(String.format("booleanA = %b , booleanB = %b",booleanA,booleanB));
        System.out.println("========================= 結果 =========================");
        System.out.println("  booleanA && booleanB  = " + (booleanA && booleanB));
        System.out.println("  booleanA || booleanB  = " + (booleanA || booleanB));
        System.out.println("!(booleanA || booleanB) = " + !(booleanA || booleanB));
        System.out.println("!(booleanA && booleanB) = " + !(booleanA && booleanB));
        System.out.println("========================= 完了 =========================");

    }
}
