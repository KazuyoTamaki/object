package training.november_test.operator;

//算術演算子
class MathOperator {
    public static void main(String[] args) {
        int a = 10 , b = 3 , c = 2 , d = 10 , e = 0;
        double ab = (double)a / (double)b ;
        double cd =  (double)c / (double)d;
        double ea = (double)e/(double)a;

        System.out.println("============================= 入力 =============================");
        System.out.println(String.format("a = %d , b = %d , c = %d , d = %d , e = %d",a,b,c,d,e));
        System.out.println("=========================== 四則演算 ===========================");
        System.out.println(String.format("a + b = %d , c - d = %d , e * a = %d", a + b , c - d , e * a));
        System.out.println("a % b = " +  a % b + " , d / c = " + d / c);
        System.out.println(String.format("a / b = %.3f , c / d = %.4f ,e / a = %.2f", ab , cd ,ea ));
        System.out.println("=========================== 単項演算 ===========================");
        System.out.println("-a = " + -a );
        System.out.println("b++ = " + b++);
        System.out.println("c-- = " + c-- );
        System.out.println("============================= 完了 =============================");

    }
}
