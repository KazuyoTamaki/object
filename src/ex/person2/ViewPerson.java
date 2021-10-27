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

        int sum = 0 , sumMan = 0 , sumWoman = 0;
        int cntMan = 0 , cntWoman = 0;
        double avr = 0.00 , avrMan = 0.00 , avrWoman = 0.00;

        for(Map.Entry entry : areaMap.entrySet()) {
            sum = 0 ;
            sumMan = 0 ;
            sumWoman = 0;
            avr = 0.00;
            avrMan = 0.00 ;
            avrWoman = 0.00;
            cntMan = 0;
            cntWoman = 0;

            for (Person person : (List<Person>) entry.getValue()) {
                sum += person.getAge();
                if(person.getGender().equals(Gender.MEN)){
                    sumMan += person.getAge();
                    cntMan ++;
                }else if(person.getGender().equals(Gender.WOMEN)){
                    sumWoman += person.getAge();
                    cntWoman++;
                }
                //System.out.println(person);
            }
            avr = (double) sum / ((List<?>) entry.getValue()).size();
            avrMan = (double) sumMan / cntMan;
            avrWoman = (double) sumWoman / cntWoman;
            System.out.println(String.format("==================%s============================================",((BirthPlace)entry.getKey()).getName()));
            System.out.println(String.format("全体平均年齢 : %.1f  男性平均年齢 : %.1f  女性平均年齢 : %.1f", avr,avrMan ,avrWoman));
            System.out.println(String.format("(内訳… 男性合計: %d 歳 男性人数 %d 人 女性合計 %d 歳 女性人数 %d 人)",sumMan,cntMan,sumWoman,cntWoman));
            System.out.println("--------------------------------------------------------------------");
            //System.out.println();
        }


    }



}
