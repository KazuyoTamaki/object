package ex.human5_back;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//配列をArrayListに変更
class HumanSample {
    public static void main(String[] args) {
        List<Human>humans = new ArrayList<>();
        humans.addAll(Arrays.asList(
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
                )
        );

        /*
        ifHuman[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        };
        */

        for (Human human:humans) {
            human.sayHello();
        }
    }
}

