package training.november_test.operator;

//関係演算子
class RelationshipOperator {
    public static void main(String[] args) {
        int num1 = 3 , num2 = 100, num3 = 50 , num99 = 3;
        double num4 = 0.1, num5 = 0.7 , num6 = 100.5;
        char char1 = 'a', char2 = 'A', char3 = 'Z';

        System.out.println("====================== 関係演算子 ======================");
        System.out.println("========================= 出力 =========================");
        System.out.println(String.format("num1 = %d , num2 = %d , num3 = %d , num99 = %d",num1,num2,num3,num99));
        System.out.println(String.format("num4 = %.1f , num5 = %.1f , num6 = %.1f",num4,num5,num6));
        System.out.println(String.format("char1 = %c , char2 = %c ,char3 = %c",char1,char2,char3));
        System.out.println("======================= 大小比較 =======================");
        System.out.println("num1 > num2 = " + (num1 > num2));
        System.out.println("num1 < num2 = " + (num1 < num2));
        System.out.println("num2 >= num3 = " + (num2 >= num3));
        System.out.println("num1 == num99 = " + (num1 == num99));
        System.out.println("num2 == num99 = " + (num1 == num99));
        System.out.println("num2 != num99 = " + (num1 != num99));
        System.out.println("num2 <= num99 = " + (num1 <= num99));
        System.out.println("========================= 実数 =========================");
        System.out.println("num4 < num5 = " + (num4 < num5));
        System.out.println("num4 < num6 = " + (num4 < num6));
        System.out.println("num5 > num6 = " + (num5 > num6));
        System.out.println("========================= 文字 =========================");
        System.out.println("char1 > char2 = " + (char1 > char2));
        System.out.println("char3 > char1 = " + (char3 > char1));
        System.out.println("char3 < char1 = " + (char2 < char3));
        System.out.println("========================= 完了 =========================");

    }
}
