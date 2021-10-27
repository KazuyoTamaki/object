package training.extend.pets;

class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("指定: %s",name);
    }
}
