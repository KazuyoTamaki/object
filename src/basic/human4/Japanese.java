package basic.human4;

class Japanese extends Human {
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("私の名前は%sです。",SayHello());
    }
}
