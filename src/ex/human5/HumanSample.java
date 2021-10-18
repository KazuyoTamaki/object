package ex.human5;

import basic.human5.ifHuman;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//インターフェース版
class HumanSample {
    public static void main(String[] args) {
        List<ifHuman> humans = new ArrayList<>(Arrays.asList(
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        ));

        for (ifHuman human:humans) {
            human.sayHello();
        }
    }
}

