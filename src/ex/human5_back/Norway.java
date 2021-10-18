package ex.human5_back;

class Norway extends Human {
    private String name;

    public Norway(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, jeg heter " + name + ".");
    }

}
