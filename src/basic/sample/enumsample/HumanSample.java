package basic.sample.enumsample;

public class HumanSample {
    public static void main(String[] args) {
        Human human = new Human("Tom",Gender.MEN,28);
        System.out.println(human);
        System.out.println(Gender.MEN.name());
    }

}
