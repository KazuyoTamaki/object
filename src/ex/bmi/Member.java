package ex.bmi;

import basic.sample.enumsample.Gender;

public class Member {
    private String name;
    private Gender gender;
    private int age;
    private double height;
    private double weight;

    public Member(String name, Gender gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi(){
        return  weight / Math.pow(height,2.00);
    }

    public String getBodyShape(){
        if (getBmi() >= 40) {
            return "肥満(4度)";
        } else if(getBmi() >= 35) {
            return "肥満(3度)";
        } else if(getBmi() >= 30) {
            return "肥満(2度)";
        } else if(getBmi() >= 25) {
            return "肥満(1度)";
        } else if(getBmi() >= 18.5) {
            return "普通     ";
        } else {
            return "低体重   ";
        }
    }

    public double getAppWeight(){
        return Math.pow(height,2.00) * 22.00;
    }

    @Override
    public String toString() {
        return String.format("%s  %s    %d    %.2f      %.1f      %.1f  %s  %.1f",name ,gender.getJpName(),age,height,weight,getBmi(),getBodyShape(),getAppWeight());
    }
}
