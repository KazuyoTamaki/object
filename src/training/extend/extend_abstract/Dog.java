package training.extend.extend_abstract;

class Dog extends Pet {
    private String classIfication;
    private int classIficationNum;
    private String name;

    //コンストラクタ
    public Dog(String classIfication, int classIficationNum) {
        this.classIfication = classIfication;
        this.classIficationNum = classIficationNum;
    }

    @Override
    void returnPets() {
        if (classIfication.equals("犬")) {
            classIfication = "犬";
            switch (classIficationNum) {
                case 1:
                    name = "柴犬";
                    break;
                case 2:
                    name = "ポメラニアン";
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
