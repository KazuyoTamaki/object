package ex.human5_back;


class Finland extends Human {
    private String name;

    public Finland(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, nimeni on " + name +".");
    }

}
