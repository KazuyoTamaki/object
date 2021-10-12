package basic.human4;

class HumanSample {
    public static void main(String[] args) {
        Human[] humans = {
                new English("Tom"),
                new Japanese("ひろし"),
                new Chinese("王"),
                new Finland("Korhonen"),
                new Norway("Johansen")
        };

        for (Human human : humans) {
            System.out.println(human);
        }
    }
}

