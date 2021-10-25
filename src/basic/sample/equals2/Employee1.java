package basic.sample.equals2;

import java.util.Objects;

class Employee1 {
    private int id;
    private String name;

    public Employee1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {  //o:比較するオブジェクト
        if (this == o) return true;    //同じオブジェクトならTrue
        if (o == null || getClass() != o.getClass()) return false; //オブジェクトが空かクラス（大元）が違う→サブクラスNG設定 False
        Employee1 employee1 = (Employee1) o;        //同じオブジェクトキャストしてみる（ここができなければ問題なので）
        return id == employee1.id && Objects.equals(name, employee1.name); //キャスト結果が同じならOK（ここでは論理演算子でOK)
        //idはintegerのため「==」、nameはStringなので「equals」で比較
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
