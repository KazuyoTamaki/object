package basic.human4;

class Chinese extends Human{
    //private String name;

    public Chinese(String name) {
        super(name);
        //this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("你好，我叫" + name +  "。");
    }

    /*    @Override
    public String SayHello() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("你好，我叫%s。",SayHello());
    }
    */
}
