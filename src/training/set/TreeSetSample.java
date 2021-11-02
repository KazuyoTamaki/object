package training.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        Set <Integer> set1 = new TreeSet<>();
        set1.addAll(Arrays.asList(10,5,1,0,30,100,-2,5,10,60,80));
        System.out.println(set1);
        Set <Character> set2 = new TreeSet<>();
        set2.addAll(Arrays.asList('z','Y','x','a','A','b','A','B','Z','x'));
        System.out.println(set2);
    }
}
