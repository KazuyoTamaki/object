package preparation.exception.exception_throws;

class ThrowsTest {

    public ThrowsTest() {
    }

    //ただ例外をスローするだけ
    public void sample() throws Exception {
        System.out.println("-------- throwsTest.sample()実行開始 --------");
        throw new Exception();
    }

    //例外をリターンするだけ
    public Exception sample2(){
        return new Exception();
    }
}
