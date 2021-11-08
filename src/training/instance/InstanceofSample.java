package training.instance;

class InstanceofSample {

    public static void main(String[] args) {
        SuperClass person1 = new SubClass("山田", 18, 100, 90);
        SuperClass person2 = new SubClass("田中", 20, 98, 95);

        //表示
        System.out.println("=============================== 表示 ===============================");
        System.out.println("person1 : " + person1.toString());
        System.out.println("person2 : " + person2.toString());
        System.out.println();

        System.out.println("=============================== 結果 ===============================");
        person1.instanceTest(person1);
        person2.instanceTest(person2);

        System.out.println("=============================== 終了 ===============================");
    }
}
