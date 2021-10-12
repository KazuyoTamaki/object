package basic.human5;

class Finland implements ifHuman {
    private String name;

    public Finland(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, nimeni on " + name +".");
    }

}
