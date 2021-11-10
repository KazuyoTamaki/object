package training.november_test.operator;

//代入演算子
class SubstitutionOperator {
    public static void main(String[] args) {
        int num1 = 5 , num2 = 3 , num3 = 10 , num4 = 7;
        double num5 = 100 , num6 = 30, num7 = 8, num8 = 9;
        int num9 = 10,num10 = 3;

        System.out.println("====================== 代入演算子 ======================");
        System.out.println("========================= 出力 =========================");
        System.out.println(String.format("num1 = %d , num2 = %d , num3 = %d , num4 = %d",num1,num2,num3,num4));
        System.out.println(String.format("num5 = %.1f , num6 = %.1f , num7 = %.1f , num8 = %.1f",num5,num6,num7,num8));
        System.out.println(String.format("num9 = %d , num10 = %d",num9,num10));
        System.out.println("========================= 結果 =========================");
        System.out.println("num1 += num2  : " + (num1 += num2));
        System.out.println("num3 -= num4  : " + (num3 -= num4));
        System.out.println("num5 *= num6  : " + (num5 *= num6));
        System.out.println("num7 /= num8  : " + (num7 /= num8));
        System.out.println("num9 /= num10 : " + (num9 %= num10));
        System.out.println("========================= 完了 =========================");
    }
}
