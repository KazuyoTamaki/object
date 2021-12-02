package training.person3;

class Person {
    private String name;
    private String gender;
    private int age;
    private String Birthplace;

    public Person(String name, String gender, int age, String birthplace) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.Birthplace = birthplace;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getBirthplace() {
        return Birthplace;
    }
}
