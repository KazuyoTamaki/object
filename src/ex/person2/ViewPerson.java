package ex.person2;

import basic.sample.enumsample.Gender;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ViewPerson {
    public static void main(String[] args) {
        Map<BirthPlace,List<Person>> areaMap = new HashMap<>();
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("A",BirthPlace.HOKKAIDO, Gender.MEN,18));
        personList.add(new Person("B",BirthPlace.HOKKAIDO, Gender.MEN,22));
        personList.add(new Person("C",BirthPlace.HOKKAIDO, Gender.WOMEN,30));

        personList.add(new Person("D",BirthPlace.TOKYO, Gender.MEN,15));
        personList.add(new Person("E",BirthPlace.TOKYO, Gender.WOMEN,22));
        personList.add(new Person("F",BirthPlace.TOKYO, Gender.MEN,20));

        personList.add(new Person("G",BirthPlace.OSAKA, Gender.WOMEN,54));
        personList.add(new Person("H",BirthPlace.OSAKA, Gender.MEN,24));
        personList.add(new Person("I",BirthPlace.OSAKA, Gender.MEN,32));

        personList.add(new Person("J",BirthPlace.FUKUOKA, Gender.MEN,8));
        personList.add(new Person("K",BirthPlace.FUKUOKA, Gender.WOMEN,15));
        personList.add(new Person("L",BirthPlace.FUKUOKA, Gender.WOMEN,18));


        for(Person person : personList){
            if(!(areaMap.containsKey(person.getBirthplace())) ){
                List<Person> list = new ArrayList();
                list.add(person);
                areaMap.put(person.getBirthplace(), list);
            }
            else{
                areaMap.get(person.getBirthplace()).add(person);
            }
        }

        int sum = 0;
        double avr = 0.00;

        for(Map.Entry entry : areaMap.entrySet()) {
            for (Person person : (List<Person>) entry.getValue()) {
                sum += person.getAge();
                //System.out.println(person);
            }
            avr = sum/ ((List<?>) entry.getValue()).size();
            System.out.println(((BirthPlace)entry.getKey()).getName() + " : " + avr + "歳");
            //System.out.println();
            sum = 0;
            avr = 0.00;
        }


    }



}
