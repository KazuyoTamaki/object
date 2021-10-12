package basic.human4;
//抽象クラス
class HumanSample {
    public static void main(String[] args) {
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        };

        for (Human human:humans) {
            human.sayHello();
        }
/*
        System.out.println("==========挨拶と名前==========");
        for (Human human : humans) {
            System.out.println(human);
        }

        System.out.println("\n==========名前のみ表示==========");
        for (Human human : humans) {
            System.out.println(human.SayHello());
        }
*/
    }
}

