package basic.human5;

class English implements ifHuman {
    private String name;

    public English(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hello,I'm " + name+".");
    }

/*
    @Override
    public String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Hello,I'm %s.",SayHello());
    }
    */
}
