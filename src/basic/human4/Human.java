package basic.human4;

abstract class Human {
    protected String name;
    public Human(String name) {
        this.name = name;
    }
    public abstract void sayHello();
    //abstract String SayHello();
}
