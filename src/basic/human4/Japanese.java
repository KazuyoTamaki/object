package basic.human4;

class Japanese extends Human {
    //private String name;

    public Japanese(String name) {
        super(name);
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }

}