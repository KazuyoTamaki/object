package training.extend.extend_abstract;

class PetSample2 {
    public static void main(String[] args) {
        System.out.println("\n---------------抽象クラス---------------\n");
        //インスタンスを作成
        //今回は配列宣言
        Pet[] pets ={
                new Dog("犬",2),
                new Dog("犬",1),
                new Cat("猫",1),
                new Cat("猫",2)
        };

        //いつもの宣言はこちら
        /*
        Pet pet1 = new Dog("犬",2);
        Pet pet2 = new Dog("犬",1);
        Pet pet3 = new Cat("猫",1);
        Pet pet4 = new Cat("猫",2);
        */

        //表示
        System.out.println("================表示開始================");
        //拡張Forで記載
        //pets[]の0～最終項目のオブジェクトを1つずつpetに代入し、それぞれreturnPetsを実行
        for(Pet pet:pets){
            pet.returnPets();
            //戻り値がある場合は、printlnやString.formatに代入でもOK
        }
        //いつもの表現はこちら
        /*
        pet1.returnPets();
        pet2.returnPets();
        pet3.returnPets();
        pet4.returnPets();
        */

        System.out.println("================表示終了================");

        //Petは抽象です。インスタンスにできませんのエラー
        //Pet pet10 = new Pet();

    }
}
