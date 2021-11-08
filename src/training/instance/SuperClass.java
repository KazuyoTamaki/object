package training.instance;

class SuperClass {
    protected String name;
    protected int age,jap,math;

    public SuperClass(String name, int age, int jap, int math) {
        this.name = name;
        this.age = age;
        this.jap = jap;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getJap() {
        return jap;
    }

    public int getMath() {
        return math;
    }

    public void instanceTest(Object obj){
        if (obj instanceof SuperClass) {
            System.out.println("オブジェクトはSuperClassのインスタンスです");
        }
        // ChildClassのインスタンスか判定する
        if (obj instanceof SubClass) {
            System.out.println("オブジェクトはSubClassのインスタンスです");
        }
    }


    @Override
    public String toString() {
        return "SuperClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", jap=" + jap +
                ", math=" + math +
                '}';
    }
}
