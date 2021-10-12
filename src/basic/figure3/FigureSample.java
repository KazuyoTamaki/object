package basic.figure3;
//インターフェース版
class FigureSample {
    public static void main(String[] args) {
        ifGetArea[] figures = {
                new Rectangle(10 , 20),
                new Circle(10),
                new Triangle(20,10)
        };

        for(ifGetArea figure : figures){
            System.out.println(figure);
        }
    }
}

