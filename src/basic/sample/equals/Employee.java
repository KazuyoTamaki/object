package basic.sample.equals;

import java.util.Objects;

//従業員
class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {  //オブジェクト「o」を宣言（equalsのオーバーライド）
        if (this == o) return true; //これ（this）がoと同じか？
        if (o == null || getClass() != o.getClass()) return false; //引数が空欄か、クラス名(getClass...Employee」と)がが異なったらfalse
        Employee employee = (Employee) o; //キャスト
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
