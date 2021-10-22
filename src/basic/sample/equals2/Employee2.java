package basic.sample.equals2;

import java.util.Objects;

class Employee2 {
    private int id;
    private String name;

    public Employee2(int id, String name) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee2)) return false;
        Employee2 employee2 = (Employee2) o;
        return id == employee2.id && Objects.equals(name, employee2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
