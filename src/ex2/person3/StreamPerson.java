package ex2.person3;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StreamPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(15);
        personList.add(new Person("A", BirthPlace.HOKKAIDO, Gender.MEN,18));
        personList.add(new Person("B", BirthPlace.HOKKAIDO, Gender.MEN,22));
        personList.add(new Person("C", BirthPlace.HOKKAIDO, Gender.WOMEN,30));

        personList.add(new Person("D", BirthPlace.TOKYO, Gender.MEN,15));
        personList.add(new Person("E", BirthPlace.TOKYO, Gender.WOMEN,22));
        personList.add(new Person("F", BirthPlace.TOKYO, Gender.MEN,20));

        personList.add(new Person("G", BirthPlace.OSAKA, Gender.WOMEN,54));
        personList.add(new Person("H", BirthPlace.OSAKA, Gender.MEN,24));
        personList.add(new Person("I", BirthPlace.OSAKA, Gender.MEN,32));

        personList.add(new Person("J", BirthPlace.FUKUOKA, Gender.MEN,8));
        personList.add(new Person("K", BirthPlace.FUKUOKA, Gender.WOMEN,15));
        personList.add(new Person("L", BirthPlace.FUKUOKA, Gender.WOMEN,18));

        //年齢20以上の名前表示
        System.out.println("練習1");
        personList.stream()                                       //生成(stream生成)
                .filter(p -> p.getAge() >= 20)                    //中間操作(条件設定)
                .forEach(p -> System.out.println(p.getName()));   //終端操作(出力)

        //年齢20未満の名前表示
        personList.stream()
                .filter(p -> p.getAge() < 20)
                .forEach(System.out::println);         //すべてのデータを書き出し

        //課題1
        System.out.println("課題1");
        personList.stream()
                .forEach(System.out::println);

        System.out.println();

        System.out.println("課題2");
        personList.stream()
                .map(Person::getName)
                .forEach(System.out::println);

        System.out.println();

        System.out.println("課題3-1");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN) )
                .forEach(p -> System.out.println(p.getName()));

        System.out.println();

        System.out.println("課題3-2");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.WOMEN) )
                .forEach(p -> System.out.println(p.getName()));

        System.out.println();


        System.out.println("課題4-1");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge,Comparator.reverseOrder()))
                .forEach(System.out::println);

        System.out.println();


        System.out.println("課題4-1");
        personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("課題5");
        personList.stream()
                .filter(p -> p.getGender().equals(Gender.MEN))
                .sorted(Comparator.comparing(Person::getName))
                .forEach(System.out::println);
    }
}
