package preparation.exception.exception_optional;

import java.util.Optional;

//Optionalクラスでnullを返すか確認
//具体例：スタックを使用
class ExceptionSample<S> {
    public static void main(String[] args) {
        //宣言
        ExceptionOptional exceptionOptional = new ExceptionOptional<>();

        //空のスタックから呼び出し（emptyが返ってくる）
        System.out.println("============= スタックからポップ =============");
        Optional<String> optional = exceptionOptional.pop();
        //optionalがnull以外なら値を返し、そうでなければorElseの()内の値を返す
        String optElement = optional.orElse("empty");
        System.out.println(optElement);

        //スタックにプッシュ
        System.out.println("============= スタックにプッシュ =============");
        System.out.println("プッシュ内容: 「Scala」「あいうえお」「Java」");
        exceptionOptional.push("Scala");
        exceptionOptional.push("あいうえお");
        exceptionOptional.push("Java");

        System.out.println("============= スタックからポップ =============");
        optional = exceptionOptional.pop();
        optElement = optional.orElse("empty"); //処理としては使わないけど表示もできる

        System.out.println("----- pop実行結果検証 -----");
        if (optional.isPresent()) {
            System.out.println("----- 表示 -----");
            System.out.println(optional.get());  //「Java」
        }

        System.out.println("========== スタックからポップ 2回目 ==========");
        optional = exceptionOptional.pop();
        System.out.println("----- 表示 -----");
        optional.ifPresent(System.out::println); //「あいうえお」
        //for-eachだが一つのみ出ることを確認
        //普通のSystem.out.printlnは使えない様子(コンパイルエラーになる)
        optional.ifPresent(System.out::println); //「あいうえお」

        System.out.println("========== スタックからポップ 3回目 ==========");
        optional = exceptionOptional.pop();
        optElement = optional.orElse("empty");
        System.out.println("----- 表示 -----");
        optional.ifPresent(System.out::println); //「Scala」

        System.out.println("========== スタックからポップ 4回目 ==========");
        optional = exceptionOptional.pop();
        optional.ifPresent(System.out::println); //空なので非表示
        System.out.println("----- nullのため非表示 -----\n");
        System.out.println("----- 表示用処理実行後 -----");
        optElement = optional.orElse("empty");
        System.out.println(optElement);
        System.out.println("==================== 完了 ====================");
    }
}
