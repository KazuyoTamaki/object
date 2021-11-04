package training.compare.sort1;

class CompareData {
    private String name;
    private int jap,math,eng;

    public CompareData(String name, int jap, int math, int eng) {
        this.name = name;
        this.jap = jap;
        this.math = math;
        this.eng = eng;
    }

    public String getName() {
        return name;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public int getEng() {
        return eng;
    }

    public int getTotal(){
        return jap + math + eng;
    }

    @Override
    public String toString() {
        return  "{" +
                "名前 ='" + name + '\'' +
                ", 国語 =" + jap +
                ", 数学 =" + math +
                ", 英語 =" + eng +
                ", 合計 =" + getTotal()+
                '}';
    }
}

