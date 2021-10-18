package ex.human5_back;


class Chinese extends Human {
    private String name;

    public Chinese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("你好，我叫" + name +  "。");
    }

}
