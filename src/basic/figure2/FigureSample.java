package basic.figure2;

class FigureSample {
    public static void main(String[] args) {
        Figure[] figures = {
                new Rectangle(10 , 20),
                new Circle(10),
                new Triangle(20,10)
        };

        for( Figure figure : figures ){
            System.out.println(figure);
            //System.out.println(figure.getArea());  //これでも面積だけ出すことが可能（ただし桁数などがすごい）
        }

        /*
        //インスタンス生成、出力
        Rectangle r1 = new Rectangle(10 , 20);
        System.out.println(r1);

        Circle c1 = new Circle(10);
        System.out.println(c1);

        Triangle t1 = new Triangle(20,10);
        System.out.println(t1);
        */

    }
}

