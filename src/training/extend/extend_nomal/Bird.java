package training.extend.extend_nomal;

class Bird extends Pet{

    //コンストラクタ
    public Bird(String classIfication,int classIficationNum){
        super(classIfication,classIficationNum,classIfication);
        if (classIfication.equals("鳥")) {
            super.classIfication = "鳥";
            switch (classIficationNum) {
                case 1:
                    super.name = "フクロウ";
                    break;
                case 2:
                    super.name = "文鳥";
                    break;
            }
        }


    }

}
