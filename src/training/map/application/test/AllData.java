package training.map.application.test;

class AllData {
    private String name;
    private GenderTest gender;
    private int Japan,English,Math,science,social;

    public AllData(String name, GenderTest gender, int japan, int english, int math, int science, int social) {
        this.name = name;
        this.Japan = japan;
        this.English = english;
        this.Math = math;
        this.science = science;
        this.social = social;
    }

    public String getName() {
        return name;
    }

    public int getJapan() {
        return Japan;
    }

    public int getEnglish() {
        return English;
    }

    public int getMath() {
        return Math;
    }

    public int getScience() {
        return science;
    }

    public int getSocial() {
        return social;
    }
}
