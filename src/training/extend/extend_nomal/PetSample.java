package training.extend.extend_nomal;

class PetSample {
    public static void main(String[] args) {

        //サブクラスのオブジェクトから二つずつ違う値を設定し、合計8種のインスタンスを作成
        Pet pet1 = new Bird("鳥",1);
        Pet pet2 = new Bird("鳥",2);
        Pet pet3 = new Cat("猫",1);
        Pet pet4 = new Cat("猫",2);
        Pet pet5 = new Degu("デグー",1);
        Pet pet6 = new Degu("デグー",2);
        Pet pet7 = new Dog("犬",1);
        Pet pet8 = new Dog("犬",2);
        Dog pet9 = new Dog("犬",2);

        //スーパークラスの出力を実行
        System.out.println(String.format("==========================%s==========================",pet1.getClassIfication()));
        pet1.returnPets();
        pet2.returnPets();
        System.out.println(String.format("==========================%s==========================",pet3.getClassIfication()));
        pet3.returnPets();
        pet4.returnPets();
        System.out.println(String.format("========================%s========================",pet5.getClassIfication()));
        pet5.returnPets();
        pet6.returnPets();
        System.out.println(String.format("==========================%s==========================",pet7.getClassIfication()));
        pet7.returnPets();
        pet8.returnPets();
        System.out.println("======================================================");

        //ダイレクトに値を指定 スーパークラスのゲッターから
        System.out.println("\n========================個別出力======================");
        System.out.println(pet1.getClassIfication());
        System.out.println(pet1.getName());

        System.out.println("========================個別出力2=====================");
        System.out.println(pet2.getClassIfication());
        System.out.println(pet2.getName());

        System.out.println("========================個別出力3=====================");
        System.out.println(pet3.getClassIfication());
        System.out.println(pet3.getName());

        System.out.println("========================個別出力4=====================");
        System.out.println(pet4.getClassIfication());
        System.out.println(pet4.getName());

        System.out.println("========================個別出力5=====================");
        System.out.println(pet5.getClassIfication());
        System.out.println(pet5.getName());

        System.out.println("========================個別出力6=====================");
        System.out.println(pet6.getClassIfication());
        System.out.println(pet6.getName());

        System.out.println("========================個別出力7=====================");
        System.out.println(pet7.getClassIfication());
        System.out.println(pet7.getName());

        System.out.println("========================個別出力8=====================");
        System.out.println(pet8.getClassIfication());
        System.out.println(pet8.getName());
        System.out.println("======================================================");

        //ゲッターでスーパークラスから値取得
        System.out.println(pet9.getClassIfication());
        //スーパークラスから通常値取得
        pet9.returnPets();
        //実装したサブクラスの値を持ってくる
        System.out.println(pet9.name);

    }
}
