package ex.bmi;

import basic.sample.enumsample.Gender;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ViewMember {
    public static void main(String[] args) {
        List<Member> memberList = new ArrayList<>(Arrays.asList(
                new Member("田巻 あんず", Gender.WOMEN, 22,1.55,45.00),
                new Member("田巻 実治  ",Gender.MEN,71,1.62,45.00),
                new Member("田巻 眞智子", Gender.WOMEN,69,1.50,55.00),
                new Member("田巻 日津世", Gender.WOMEN,34,1.55,85.00),
                new Member("田巻 太郎  ", Gender.MEN,45,1.60,70.00),
                new Member("田巻 花子  ", Gender.WOMEN,50,1.53,72.00)
        ));

        System.out.println("    名前    性別  年齢  身長(m)   体重(kg)   BMI   判定     適正体重(kg)");
        for(Member member:memberList){
            System.out.println(member);
        }
    }
}
