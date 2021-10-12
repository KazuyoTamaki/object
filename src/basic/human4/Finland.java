package basic.human4;

class Finland extends Human{
    private String name;

    public Finland(String name) {
        this.name = name;
    }

    @Override
    public String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Hei, nimeni on %s.",SayHello());
    }
}
