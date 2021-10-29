package training.extend.extend_nomal;

class Pet {
    protected String name;
    protected int classIficationNum;
    protected String classIfication;

    public Pet(String name, int classIficationNum, String classIfication) {
        this.name = name;
        this.classIficationNum = classIficationNum;
        this.classIfication = classIfication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassIfication() {
        return classIfication;
    }

    public void setClassIfication(String classIfication) {
        this.classIfication = classIfication;
    }

    public void returnPets(){
        System.out.println(String.format("分類：%s 種類：%s",classIfication,name));
    }
}
