package training.compare.sort2;

//参考
/* https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/Integer.html#compareTo(java.lang.Integer) */

class CompareData implements Comparable<CompareData> {
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

    //sort1と違う点
    public int compareTo(CompareData o) {
        return getTotal() - o.getTotal();//sum()が自身の合計点、o.sum()が比較対象の合計点
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

