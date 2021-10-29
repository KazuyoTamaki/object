package training.extend.extend_abstract;

class Cat extends Pet{
    private String classIfication;
    private int classIficationNum;
    private String name;

    //コンストラクタ

    public Cat(String classIfication, int classIficationNum) {
        this.classIfication = classIfication;
        this.classIficationNum = classIficationNum;
    }

    @Override
    void returnPets() {
        if (classIfication.equals("猫")) {
            classIfication = "猫";
            switch (classIficationNum) {
                case 1:
                    name = "白猫";
                    break;
                case 2:
                    name = "トラ猫";
                    break;
            }
        }
        System.out.println(String.format("分類: %s  種類: %s",classIfication,name));
    }

    //抽象クラスで強制されたので書いておく
    @Override
    void testPets() {

    }
}
