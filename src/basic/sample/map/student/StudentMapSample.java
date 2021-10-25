package basic.sample.map.student;

import basic.sample.enumsample.Gender;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentMapSample {


    public static void main(String[] args) {
        int sum=0;
        //マップ作製（40クラス）
        Map<String, List<Student>> studentGroupMap = new HashMap<>(40);
        //学生リスト
        List<Student> studentList = new ArrayList<>(100);
        studentList.add(new Student("1-1","田巻 あんず", Gender.WOMEN,85,60,70));
        studentList.add(new Student("1-1","札幌 太郎", Gender.MEN,100,95,100));
        studentList.add(new Student("1-1","屯田 花子", Gender.WOMEN,60,100,65));

        studentList.add(new Student("1-2","北海 秀男", Gender.MEN,70,90,50));
        studentList.add(new Student("1-2","厚木 太郎", Gender.MEN,50,45,30));
        studentList.add(new Student("1-2","東京 花子", Gender.WOMEN,80,90,80));

        studentList.add(new Student("1-3","沖縄 次郎", Gender.MEN,58,55,95));
        studentList.add(new Student("1-3","愛知 桜子", Gender.WOMEN,90,85,90));
        studentList.add(new Student("1-3","人生 幸子", Gender.WOMEN,75,70,60));

        studentList.add(new Student("1-4","人生 幸男", Gender.MEN,87,92,98));
        studentList.add(new Student("1-4","関東 花子", Gender.WOMEN,45,80,75));
        studentList.add(new Student("1-4","十勝 太郎", Gender.MEN,40,68,80));

        studentList.add(new Student("1-5","北風 太郎", Gender.MEN,84,34,90));
        studentList.add(new Student("1-5","花田 勝", Gender.MEN,45,53,22));
        studentList.add(new Student("1-5","田巻 茶太郎", Gender.MEN,90,75,80));

        //Student型のstudentにStudentListを1項目ごとに入れていく作業 StudentListが終わったら自動終了
        for(Student student:studentList){
            //studentGroupMapのキーにstudentのグループ(先頭項目)があるか？
            if(studentGroupMap.containsKey(student.getGroup())){
                studentGroupMap.get(student.getGroup()).add(student);
            }else{
                List<Student> list = new ArrayList<>();
                list.add(student);
                studentGroupMap.put(student.getGroup(), list);
            }
        }
        System.out.println(studentGroupMap);

        for (Map.Entry entry : studentGroupMap.entrySet()) {
            double sumJap = 0,sumMath = 0,sumEng = 0;
            for (Student student:(List<Student>)entry.getValue()) {
                sumJap += student.getJap();
                sumMath += student.getMath();
                sumEng += student.getEng();
            }
            double aveJap = sumJap /((List<?>) entry.getValue()).size();
            double aveMath = sumMath /((List<?>) entry.getValue()).size();
            double aveEng = sumEng / ((List<?>) entry.getValue()).size();

            System.out.println(String.format("%s %.2f %.2f %.2f",entry.getKey(),aveJap,aveMath,aveEng));
        }

        /*
        for(Map.Entry entry:studentGroupMap.entrySet()){
                        //System.out.println(entry.getValue());
            for (int i = 0; i <3; i++) {
                //System.out.println(studentList.get(i).getJap());
                sum += studentList.get(i).getJap();
            }
            System.out.println(String.format("%.1f", sum / 3.0));
               // System.out.println(studentList.get(1).getJap());
                //System.out.println(studentList.get(2).getJap());

        }*/

    }

}
