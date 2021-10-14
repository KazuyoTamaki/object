package basic.sample;

import java.util.Arrays;

public class ArraysSample {
    //可変長合計
    static int sum(int... array2){
        int sum=0;
        for(int value:array2)sum += value;
        return sum;
    }
    public static void main(String[] args) {
        int[] oldArray = {10,20,30};
        int[] newArray = Arrays.copyOf(oldArray,oldArray.length + 3);
        System.out.println(Arrays.toString(oldArray));
        System.out.println(Arrays.toString(newArray));

        //配列のソート
        System.out.println("======配列ソート======");
        int[] array = {100,20,50,0,40};
        System.out.println("======ソート前======");
        System.out.println(Arrays.toString(array)); //ソート前
        Arrays.sort(array);//自然順ソート
        System.out.println("======ソート後======");
        System.out.println(Arrays.toString(array));//ソート後

        System.out.println("\n");

        //検索(昇順ソート必須）
        int[] array1 = {1,10,5,3,9};
        System.out.println("========探索========");
        System.out.println("======ソート前======");
        System.out.println(Arrays.toString(array1));//ソート前
        System.out.println("=======ソート=======");
        Arrays.sort(array1);//ソート
        System.out.println("======ソート後======");
        System.out.println(Arrays.toString(array1));//ソート後
        System.out.println("========探索========");
        System.out.println("========発見========");
        System.out.println(Arrays.binarySearch(array1, 3));//発見
        System.out.println("=======未探索=======");
        System.out.println(Arrays.binarySearch(array1, -5));//未発見

        System.out.println("\n");
        System.out.println("=======可変長sum=======");
        //可変長sum
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(10, 20));

    }
}

