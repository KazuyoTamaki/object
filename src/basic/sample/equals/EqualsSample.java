package basic.sample.equals;

public class EqualsSample {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Tom");
        Employee employee2 = employee1;
        Employee employee3 = new Employee(2,"John");
        Employee employee4 = new Employee(1,"Tom");
        Employee2_back employee21Back = new Employee2_back(1,"Tom");

        //比較
        System.out.println("従業員1と2の比較:" + employee1.equals(employee2));//1のコピー（参照先）が同じ
        System.out.println("同じオブジェクトなのでTrue");
        System.out.println("従業員1と3の比較:" + employee1.equals(employee3));//同じクラスのインスタンスだが引数が異なる
        System.out.println("同じクラスのインスタンスだが、引数が異なるためFalse");
        System.out.println("従業員1と4の比較:" + employee1.equals(employee4));//同じクラスのインスタンスで引数が同じ
        System.out.println("同じクラスのインスタンスで、引数も同じなためTrue");
        System.out.println("従業員1と21の比較:" + employee1.equals(employee21Back));//オブジェクトが違うため
        System.out.println("そもそも形成したオブジェクトが異なるためFalse");
    }
}
