package training.same_equivalent;

import java.util.Objects;

class EquivalentTest {
    private String name;
    private int jap,eng,math;

    public EquivalentTest(String name, int jap, int eng, int math) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EquivalentTest that = (EquivalentTest) o;
        return jap == that.jap && eng == that.eng && math == that.math && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, jap, eng, math);
    }
}
