package training.november_test.print;
//変数宣言など基礎的な内容

class Println {
    public static void main(String[] args) {
        //プリミティブ型宣言
        System.out.println("\n=============プリミティブ型=======================================================================");
        byte numByte1 = 0b10101;
        byte numByte2 = 0B01010;
        short numShort1 = -10;
        short numShort2 = 127;
        int numInt08 = 050;
        int numInt16 = 0xff;
        int numInt1 = -32768;
        int numInt2 = 0;
        int numInt3 = 32767;
        long numLong1 = -10_000_000L;
        long numLong2 = 123_456_789L;
        float numFloat1 = 123_4.567_8f;
        float numFloat2 = -234.567f;
        double numDouble1 = 0.000d;
        double numDouble2 = 98_765.43210d;
        char char1 = 'A';
        char char2 = '\u3044';
        boolean boolean1 = true;
        boolean boolean2 = false;

        //表示
        System.out.println("======================================== 変数表示(println) =======================================");
        //すべて10進表示
        System.out.println(
                " numByte1 : " + numByte1 + ", numByte2 : " + numByte2 + ", numInt08 : "
                + numInt08 + ", numInt16 : " + numInt16 +", numShort1 : " +  numShort1 + ", numShort2 : " + numShort2
        );
        System.out.println(
                " numInt1 : " + numInt1 + ", numInt2 : " + numInt2 + ", numInt3 : " + numInt3
                        + ", numLong1 : " + numLong1 +", numLong2 : " +  numLong2
        );
        System.out.println(
                " numFloat1 : " + numFloat1 + ", numFloat2 : " + numFloat2 + ", numDouble1 : " + numDouble1
                        + ", numDouble2 : " + numDouble2
        );
        System.out.println(
                " char1 : " + char1 + ", char2 : " + char2 + ", boolean1 : " + boolean1
                        + ", boolean2 : " + boolean2
        );
        System.out.println("============================================== 完了 ==============================================");

        System.out.println();

        System.out.println("======================================== 変数表示(S.format) =======================================");
        System.out.println(String.format(" numByte1  : %d , numByte2 : %d", numByte1, numByte2));
        System.out.println("※※※※※※※※※2進表記がありません※※※※※※※※※");
        System.out.println(String.format(" numShort1  : %d , numShort2 : %d", numShort1, numShort2));
        System.out.println(String.format(" numInt08   : %o , numInt16 : %x", numInt08, numInt16));
        System.out.println(String.format(" numLong1   : %d , numLong2 : %d", numLong1, numLong2));
        System.out.println("※※※※※※※※※浮動小数点はすべて「f」※※※※※※※※※");
        System.out.println(String.format(" numFloat1  : %.2f , numFloat2 : %.1f", numFloat1, numFloat2));
        System.out.println(String.format(" numDouble1 : %.1f , numDouble2 : %.3f", numDouble1, numDouble2));
        System.out.println(String.format(" numInt1    : %d , numInt2 : %d , numInt : %d", numInt1, numInt2,numInt3));
        System.out.println(String.format(" char1      : %c , char2 : %c ", char1,char2));
        System.out.println("============================================== 完了 ==============================================");
    }


}
