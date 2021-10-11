package figure1;

class FigureSample {
    public static void main(String[] args) {
        //インスタンス生成、出力
        Rectangle r1 = new Rectangle(10 , 20);
        System.out.println(r1);

        Circle c1 = new Circle(10);
        System.out.println(c1);

        Triangle t1 = new Triangle(20,10);
        System.out.println(t1);

    }
}

