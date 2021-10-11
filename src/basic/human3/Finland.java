package basic.human3;

class Finland extends Human {
    public Finland(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, nimeni on" + name + ".");
    }
}
