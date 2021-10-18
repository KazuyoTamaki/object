package ex.human5;

import basic.human5.ifHuman;

class Norway implements ifHuman {
    private String name;

    public Norway(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, jeg heter " + name + ".");
    }

}
