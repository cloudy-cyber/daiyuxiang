package club.banyuan.June22.Practice.Shape;

public class Main {

    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        areaCalculator.show(new Circle(20));
        areaCalculator.show(new Rectangle(20, 15));
    }
}
