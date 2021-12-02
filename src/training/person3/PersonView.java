package training.person3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class PersonView {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.addAll(Arrays.asList(
                new Person("田中",Gender2.MEN,18,BirthPlace.Osaka),
                new Person("本田",Gender2.WOMEN,35,BirthPlace.Tokyo),
                new Person("豊田",Gender2.MEN,56,BirthPlace.Aitch),
                new Person("鈴木",Gender2.WOMEN,23,BirthPlace.Hokkaido),

                new Person("高橋",Gender2.WOMEN,23,BirthPlace.Osaka),
                new Person("斉藤",Gender2.MEN,19,BirthPlace.Tokyo),
                new Person("山崎",Gender2.WOMEN,63,BirthPlace.Aitch),
                new Person("伊藤",Gender2.MEN,50,BirthPlace.Hokkaido),

                new Person("大谷",Gender2.MEN,22,BirthPlace.Osaka),
                new Person("新庄",Gender2.WOMEN,40,BirthPlace.Tokyo),
                new Person("西川",Gender2.MEN,38,BirthPlace.Aitch),
                new Person("石井",Gender2.WOMEN,19,BirthPlace.Hokkaido),

                new Person("高橋",Gender2.WOMEN,23,BirthPlace.Osaka),
                new Person("斉藤",Gender2.MEN,19,BirthPlace.Tokyo),
                new Person("山崎",Gender2.WOMEN,63,BirthPlace.Aitch),
                new Person("伊藤",Gender2.MEN,50,BirthPlace.Hokkaido)
        ));

        for (Person person : personList){
            System.out.println(person.getName() + " " + person.getBirthplace());
        }

    }
}
