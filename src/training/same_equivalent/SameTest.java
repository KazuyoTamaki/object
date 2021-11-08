package training.same_equivalent;

class SameTest {
    private String name;
    private int jap,eng,math;

    public SameTest(String name, int jap, int eng, int math) {
        this.name = name;
        this.jap = jap;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getJap() {
        return jap;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int sum(){
        return jap + eng + math;

    }

    @Override
    public String toString() {
        return "SameTest{" +
                "name='" + name + '\'' +
                ", jap=" + jap +
                ", eng=" + eng +
                ", math=" + math +
                '}';
    }
}
