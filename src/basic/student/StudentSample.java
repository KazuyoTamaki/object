package basic.student;

import java.util.Scanner;

public class StudentSample {
    public static void main(String[] args) {
        Student student1 = new Student("あいざわ","男",1);
        //クラス　オブジェクト名　= 新規 コンストラクタ ( コンストラクタの引数)
        System.out.println("======================表示==m====================");
        System.out.println("名前は " + student1.getName() + " さんです。");
        System.out.println("性別は " + student1.getGender() + " です。");
        System.out.println("学年は " + student1.getGrade() + "年 です。");

        System.out.println("====================一覧表示====================");
        System.out.println(student1);

        System.out.println("====================書き換え====================");
        student1.setGrade(2);
        System.out.println("学年は " + student1.getGrade() + "年 です。");
    }
}
