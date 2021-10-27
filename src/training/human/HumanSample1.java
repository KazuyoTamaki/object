package training.human;

class HumanSample1 {
    public static void main(String[] args) {
        Human1 human1 = new Human1("やまだ",18,"男");
        Human1 human2 = new Human1("たなか",20,"男");
        Human1 human3 = new Human1("たかはし",19,"女");

        System.out.println(String.format("human1の方は お名前:%s 年齢:%d 性別:%s です。",human1.getName(),human1.getAge(),human1.getGender()));
        System.out.println(String.format("human2の方は お名前:%s 年齢:%d 性別:%s です。",human2.getName(),human2.getAge(),human2.getGender()));
        System.out.println(String.format("human3の方は お名前:%s 年齢:%d 性別:%s です。\n",human3.getName(),human3.getAge(),human3.getGender()));

        //toStringの試験
        System.out.println("=================toStringテスト=================");
        System.out.println(human1);
        System.out.println("-------------------------------------------------");
        System.out.println(human2);
        System.out.println("-------------------------------------------------");
        System.out.println(human3);
        System.out.println("-------------------------------------------------");
    }
}
