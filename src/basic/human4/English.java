package basic.human4;

class English extends Human{
    private String name;

    public English(String name) {
        this.name = name;
    }


    @Override
    public String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("I'm %s.",SayHello());
    }
}
