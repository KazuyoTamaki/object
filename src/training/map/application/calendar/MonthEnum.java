package training.map.application.calendar;

enum MonthEnum {
    JANUARY("睦月"),
    FEBRUARY("如月"),
    MARCH("弥生"),
    APRIL("卯月"),
    MAY("皐月"),
    JUNE("水無月"),
    JULY("文月"),
    AUGUST("葉月"),
    SEPTEMBER("長月"),
    OCTOBER("神無月"),
    NOVEMBER("霜月"),
    DECEMBER("師走");

    private String jpMonthName;

    MonthEnum(String jpMonthName) {
        this.jpMonthName = jpMonthName;
    }

    public String getJpMonthName() {
        return jpMonthName;
    }
}
