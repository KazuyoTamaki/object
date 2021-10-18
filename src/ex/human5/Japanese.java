package ex.human5;

import basic.human5.ifHuman;

class Japanese implements ifHuman {
    private String name;

    public Japanese(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("こんにちは、私の名前は" + name + "です。");
    }

}
