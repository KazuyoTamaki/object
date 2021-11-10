package training.november_test.operator;

//条件演算子
class ConditionsOperator {
    public static void main(String[] args) {
        int num1 = 10;
        int result1 = num1 > 0? 1:0;
        int result2 = num1 > 100? 1:0;

        System.out.println("====================== 条件演算子 ======================");
        System.out.println("========================= 出力 =========================");
        System.out.println("num1 = " + num1);
        System.out.println("========================= 結果 =========================");
        System.out.println("num1 > 0 ?   = "  + result1);
        System.out.println("num1 > 100 ? = "  + result2);
        System.out.println("Yes:1 , No:0");
        System.out.println("========================= 完了 =========================");
    }
}
