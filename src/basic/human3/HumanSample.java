package basic.human3;
//スーパークラス
public class HumanSample {
    public static void main(String[] args) {
        Human[] humans = {
                new Human("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        };

        for (Human human:humans) {
            human.sayHello();
        }
    }
}


/*public class HumanSample {
    public static void main(String[] args) {
        Human tom = new Human("Tom");
        tom.sayHello();

        //Japanese でもOK
        //Japanese hiroshi = new Japanese("ひろし");
        Human hiroshi = new Japanese("ひろし");
        hiroshi.sayHello();

        Human hwang = new Chinese("王");
        hwang.sayHello();

        Human korhonen = new Finland("Korhonen");
        korhonen.sayHello();

        Human johansen = new Norway("Johansen");
        johansen.sayHello();

    }
}
*/