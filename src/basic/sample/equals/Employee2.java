package basic.sample.equals;

import java.util.Objects;

//従業員
class Employee2 {
    private int id;
    private String name;

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {  //オブジェクト「o」を宣言（equalsのオーバーライド）
        if (this == o) return true; //これ（this）がoと同じか？
        //引数が空欄か、クラス名(getClass...Employeeとオブジェクト型のクラス名)がが異なったらfalse
        if (o == null || getClass() != o.getClass()) return false;
        Employee2 employee = (Employee2) o; //キャスト
        return id == employee.id && Objects.equals(name, employee.name); //変数なので==と、オブジェクトの比較（Object.equals)
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

}
