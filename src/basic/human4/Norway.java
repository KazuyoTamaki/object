package basic.human4;

class Norway extends Human {
    //private String name;

    public Norway(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, jeg heter " + name + ".");
    }

}
