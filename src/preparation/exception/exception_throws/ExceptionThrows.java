package preparation.exception.exception_throws;

//スロー
class ExceptionThrows {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("==================== 開始 ====================");
        try {
            ThrowsTest throwsTest = new ThrowsTest();
            throwsTest.sample();
        }catch (Exception e){
            System.out.println("------------------- catch -------------------");
            System.out.println("e.getCause() : " + e.getCause());     //null
            System.out.println("e.getMessage() : " + e.getMessage()); //null
            e.printStackTrace();
        } finally {
            System.out.println("==================== 終了 ====================\n");
        }


        System.out.println("==================== 開始 ====================");
        try {
            ThrowsTest throwsTest = new ThrowsTest();
            System.out.println("sample2(return Exception) 実行");
            Exception exception = throwsTest.sample2();
            System.out.println(exception); //java.lang.Exceptionが返ってきた
        }catch (Exception e){
            System.out.println("------------------- catch -------------------");
            System.out.println("e.getCause() : " + e.getCause());
            System.out.println("e.getMessage() : " + e.getMessage());
        } finally {
            System.out.println("==================== 終了 ====================");
        }
        System.out.println("\n==================== 完了 ====================");
    }
}
