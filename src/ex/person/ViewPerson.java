package ex.person;

import basic.sample.enumsample.Gender;
import basic.sample.equals.EqualsSample;

import javax.swing.plaf.ComponentInputMapUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Filter;

class ViewPerson {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>(Arrays.asList(
                new Person("しむら", Gender.MEN,28),
                new Person("すどう",Gender.WOMEN,34),
                new Person("そのだ",Gender.WOMEN,21),
                new Person("さの",Gender.MEN,42),
                new Person("せがわ",Gender.WOMEN,55)
        ));

        //課題1
        System.out.println("課題1");
        personList.forEach(System.out::println);
        /*
        for(Person list:personList){
            System.out.println(list);
        }*/

        //課題2
        personList.sort(Comparator.comparing(Person::getAge,Comparator.reverseOrder()));
        //上と同じ
        /*Comparator<Person> ageReverseOrder = Comparator.comparing(Person::getAge,Comparator.reverseOrder());
        personList.sort(ageReverseOrder);
        */
        //表示
        System.out.println("\n課題2");
        personList.forEach(System.out::println);

        //課題3 Gender.MEN.name()
        System.out.println("\n課題3");
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person : personList){
            if(person.getGender().equals(Gender.MEN)){ //personListをpersonに一行ずつ代入して、その中から性別をもってきてequalsで比較
            //if(person.getGender().getJpName().equals("男")){  //
                System.out.println(person);
            }
        }

        //課題4と5のための準備
        List<Person> personManList = new ArrayList<>();
        List<Person> personWomanList = new ArrayList<>();

        int man_Count = 0, woman_Count = 0;
        int man_Sum = 0, woman_Sum = 0;
        int man_Max = 0 , woman_Max = 0;
        for(Person person : personList){
            if (person.getGender().equals(Gender.MEN)){
                personManList.add(person);               //男性のArrayListに投入　ストレートに引数指定してOK
                man_Sum += person.getAge();              //合計にその人の年齢を加算
                man_Count++;                             //人数を加算
                if(man_Max < person.getAge()) {          //最大値を比較する処理
                    man_Max = person.getAge();           //最大値を更新したらその人の年齢と交換
                }
            }                                             //getName()などするとgenderがエラーになる
            else if(person.getGender().equals(Gender.WOMEN)){
                personWomanList.add(person);              //女性のArrayListに投入
                woman_Sum += person.getAge();             //残りは男性と同じ処理
                woman_Count++;
                if(woman_Max < person.getAge()){
                    woman_Max = person.getAge();
                }
            }
        }

        //課題4
        System.out.println("\n課題4");
        System.out.println(String.format("男性の平均年齢 : %.1f",(double)man_Sum / man_Count));
        System.out.println(String.format("女性の平均年齢 : %.1f",(double)woman_Sum / woman_Count));

        //課題5
        System.out.println("\n課題5");
        System.out.println(String.format("男性の最高年齢 : %d",man_Max));
        System.out.println(String.format("女性の最高年齢 : %d",woman_Max));

    }
}
