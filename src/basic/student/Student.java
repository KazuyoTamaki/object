package basic.student;
/* 10~14まで記入（クラスを作り、クラスのpublicを消す)
* フィールドを宣言
* (Fn) + alt + ins ですべての変数を選択し
* コンストラクタ,
* ゲッターセッター
* toStringを作る
* */

class Student {
    //フィールド宣言
    private String name;
    private String gender;
    private int grade;

    public Student(String name, String gender, int grade) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade=" + grade +
                '}';
    }
}