package basic.human5;
//インターフェース版
class HumanSample {
    public static void main(String[] args) {
        ifHuman[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        };

        for (ifHuman human:humans) {
            human.sayHello();
        }
    }
}

