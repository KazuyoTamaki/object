package training.november_test.arrangement;

class Arrangement {
    public static void main(String[] args) {
        int[] arg1 = {1,2,3,4,5};
        int[] arg2 = new int[10];
        String[] str1 = {"おはようございます","こんにちは","こんばんは","あけましておめでとうございます","お世話になっております"};

        System.out.println("========================= 配列 =========================");
        System.out.println("================ 拡張For文は番地取得不可 ===============");
        System.out.println("========================= 出力 =========================");
        System.out.println("------- arg1 -------");
        System.out.println("----- For文 -----");
        for (int i = 0; i < 5; i++) {
            System.out.println("arg1[" + i + "] = " + arg1[i]);
        }

        System.out.println("----- For-each文 -----");
        for(int i : arg1){
            System.out.println("arg1[] = " + i);
        }

        System.out.println("------- arg2 -------");
        System.out.println("----- For文 -----");
        for (int i = 0; i < 10; i++) {
            System.out.println("arg2[" + i + "] = " + arg2[i]);
        }
        System.out.println("========================= 出力(str1) =========================");
        System.out.println("----- For文 -----");
        for (int i = 0; i < 5; i++) {
            System.out.println("str1[" + i + "] = " + str1[i]);
        }

        System.out.println("----- For-each文 -----");
        for(String i : str1){
            System.out.println("str1[] = " + i);
        }
        System.out.println("========================= 入力(arg2) =========================");
        arg2[0] = 10;
        for (int i = 0; i < 10; i++) {
            arg2[i] =arg2[0] + i;
        }
        System.out.println("----- 入力完了 -----");

        System.out.println("========================= 出力(arg2) =========================");
        System.out.println("----- For文 -----");
        for (int i = 0; i < 10; i++) {
            System.out.println("arg2[" + i + "] = " + arg2[i] );
        }
        System.out.println("----- For-each文 -----");
        for(int i : arg2){
            System.out.println("arg2[] = " + i);
        }
        System.out.println("============================= 完了 ===========================");
    }
}
