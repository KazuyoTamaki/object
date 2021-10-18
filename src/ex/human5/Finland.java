package ex.human5;

import basic.human5.ifHuman;

class Finland implements ifHuman {
    private String name;

    public Finland(String name) {
        this.name = name;
    }

    @Override
    public void sayHello() {
        System.out.println("Hei, nimeni on " + name +".");
    }

}
