package ex2.person3;

import basic.sample.enumsample.Gender;

class Person {
    private String name;
    private BirthPlace birthplace;
    private Gender gender;
    private int age;

    public Person(String name, BirthPlace birthplace, Gender gender, int age) {
        this.name = name;
        this.birthplace = birthplace;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public BirthPlace getBirthplace() {
        return birthplace;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d",getName(),birthplace.getName(),gender.getJpName(),getAge());
    }
}

