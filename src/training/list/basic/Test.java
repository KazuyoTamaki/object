package training.list.basic;

class Test {
    int num1,num2;

    //コンストラクタ
    public Test(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int TestSum(){
        return num1 + num2 ;
    }

    public void TestMultiplication(){
        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
    }

}
