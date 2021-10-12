package basic.figure3;

// , 区切りで複数の抽象メソッドを記入OK
class Rectangle implements ifGetArea {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }


    @Override
    public String toString() {
        //https://docs.oracle.com/javase/jp/11/docs/api/java.base/java/lang/String.html#format(java.lang.String,java.lang.Object...)
        //https://java-code.jp/173
        return String.format("長方形 高さ:%.2f 幅:%.2f 面積:%.2f",
                height,width,getArea());
    }

    @Override
    public double getArea() {
        return height * width;
    }
}
