package basic.inspection;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ViewResult {
    public static void main(String[] args) {
        List<Result> resultList = new ArrayList<>(Arrays.asList(
                new Result("202010110910", "山田  太郎",
                        "2021-10-19T13:45:30", 36.4, 85,
                        122, 84),
                new Result("202101041223", "田巻日津世",
                        "2021-10-30T09:30:10", 36.5, 65,
                        118, 80))
        );

        System.out.println("     ID         名前          検査日時        体温  脈拍  血圧（上） 血圧（下） 平均血圧");
        for(Result result:resultList) {
            System.out.println(result);
        }
    }
}
