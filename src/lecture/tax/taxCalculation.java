package lecture.tax;

import java.time.LocalDate;

//日付・金額をもとに支払金額を計算
class taxCalculation {
    LocalDate buyDate;
    double price;

    public taxCalculation() {
        this.buyDate = buyDate;
        this.price = price;
    }

    public double getPrice(LocalDate buyDate, double price) {
        return (int)price * 0.08;
    }
}
