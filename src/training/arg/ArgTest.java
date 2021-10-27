package training.arg;

public class ArgTest {
    public static void main(String[] args) {
        int a = 100;
        int[] arg = {1,2,9,8,7};
        String str1 = "あいうえお";

        System.out.println("======================================================元の出力======================================================");
        System.out.println(String.format("a = %d , arg[] = %d,%d,%d,%d,%d str1 = %s\n",a,arg[0],arg[1],arg[2],arg[3],arg[4],str1));
        int b = a;
        int[] arg2 = arg;
        String str2 = str1;
        System.out.println("======================================================代入後======================================================");
        System.out.println(String.format("b = %d , arg2[] = %d,%d,%d,%d,%d str2 = %s\n",b,arg2[0],arg2[1],arg2[2],arg2[3],arg2[4],str2));
        System.out.println("=====================================================変更内容=====================================================");
        System.out.println(String.format("a = %d , arg[0] = %d str = %s\n",a,arg[0],str1));
        a = 50;
        arg[0] = 100;
        str1 = "いいいいい";
        System.out.println("======================================================変更後======================================================");
        System.out.println(String.format("a = %d , arg[] = %d,%d,%d,%d,%d str1 = %s",a,arg[0],arg[1],arg[2],arg[3],arg[4],str1));
        System.out.println(String.format("b = %d , arg2[] = %d,%d,%d,%d,%d str2 = %s\n",b,arg2[0],arg2[1],arg2[2],arg2[3],arg2[4],str2));
        System.out.println("=======================================================終了=======================================================");

    }
}
