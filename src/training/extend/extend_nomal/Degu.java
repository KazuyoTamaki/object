package training.extend.extend_nomal;

public class Degu extends Pet {
    //コンストラクタ
    public Degu(String classIfication,int classIficationNum) {
        super(classIfication, classIficationNum, classIfication);
        if (classIfication.equals("デグー")) {
            super.classIfication = "デグー";
            switch (classIficationNum) {
                case 1:
                    super.name = "デグー（野生）";
                    break;
                case 2:
                    super.name = "デグー（ブリード）";
                    break;
            }
        }
    }
}
