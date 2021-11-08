package training.instance;

class SubClass extends SuperClass{
    //継承
    public SubClass(String name, int age, int jap, int math) {
        super(name, age, jap, math);
    }

    public int getSum(){
        return jap + math;

    }

}
