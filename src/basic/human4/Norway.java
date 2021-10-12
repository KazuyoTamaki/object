package basic.human4;

class Norway extends Human {
    private String name;

    public Norway(String name) {
        this.name = name;
    }

    @Override
    public String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Hei, jeg heter %s",SayHello());
    }
}
