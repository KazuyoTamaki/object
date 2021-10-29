package training.extend.extend_nomal;

class Dog extends Pet{
    //コンストラクタ
    public Dog(String classIfication,int classIficationNum) {
        super(classIfication, classIficationNum, classIfication);
        if (classIfication.equals("犬")) {
            super.classIfication = "犬";
            switch (classIficationNum) {
                case 1:
                    super.name = "柴犬";
                    break;
                case 2:
                    super.name = "ポメラニアン";
                    break;
            }
        }
    }

}
