package training.extend.pets;

class Bird extends Pet{
    String bird2 = "文鳥とふくろう";
    public Bird(String name) {
        super(name);
    }

    JavaSparrow javaSparrow = new JavaSparrow(name);

    @Override
    public String toString() {
        return String.format("%s %s",name,javaSparrow);
    }
}
