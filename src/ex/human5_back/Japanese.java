package ex.human5_back;

class Japanese extends Human {
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }

}