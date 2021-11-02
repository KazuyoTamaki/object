package training.set;

class SetTest {
    int num1,num2;

    public SetTest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumTest(){
        return num1 + num2;
    }

    public double modTest(){
        return (double) num1 /(double) num2;
    }

    public void stringTest(){
        System.out.println("num1 = " + num1 + "  num2 = " +num2);
    }
}
