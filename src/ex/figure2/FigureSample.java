package ex.figure2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FigureSample {
    public static void main(String[] args) {

        //配列をArrayListに書き換え
        List<Figure>figures = new ArrayList<>();

        //一つずつ追加 figures
        figures.add(new Rectangle(10 , 20));
        figures.add(new Circle(10));
        figures.add(new Triangle(20,10));

        //まとめて追加 figures2
        List<Figure>figures2 = new ArrayList<>(
                Arrays.asList(
                (new Rectangle(10,20)),
                (new Circle(10)),
                (new Triangle(20,10))
                )
        );
        System.out.println("==========全だし=============================================================================================");
        System.out.println("------------1------------------------------------------------------------------------------------------------");
        System.out.println(figures);
        System.out.println("------------2------------------------------------------------------------------------------------------------");
        System.out.println(figures2);

        System.out.println("\n=================通常出力=================");
        System.out.println("----------------パターン1----------------");
        for( Figure figure : figures ){
            System.out.println(figure);
        }

        System.out.println("\n----------------パターン2----------------");
        for( Figure figure : figures2 ){
            System.out.println(figure);
      }
        System.out.println("\n=================おしまい=================");
    }
}

