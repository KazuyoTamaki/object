package basic.human4;

class Finland extends Human{
    //private String name;

    public Finland(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, nimeni on " + name +".");
    }

}