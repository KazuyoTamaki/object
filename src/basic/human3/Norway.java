package basic.human3;

class Norway extends Human {
    public Norway(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, jeg heter " + name + "." );
    }
}
