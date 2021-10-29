package training.extend.extend_nomal;

public class Cat extends Pet {
    //コンストラクタ
    public Cat(String classIfication,int classIficationNum) {
        super(classIfication, classIficationNum, classIfication);
        if (classIfication.equals("猫")) {
            super.classIfication = "猫";
            switch (classIficationNum) {
                case 1:
                    super.name = "イエネコ（和猫）";
                    break;
                case 2:
                    super.name = "イエネコ（洋猫）";
                    break;
            }
        }
    }
}
