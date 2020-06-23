package club.banyuan.June22.Practice.Shape;

//面积计算器
public class AreaCalculator {

    public void show(Circle circle) {
        System.out.println(circle.getShapeName() + "面积是" + String.format("%.1f", circle.area()));
        System.out.println(circle.getShapeName() + "周长是" + String.format("%.1f", circle.perimeter()));
    }
    public void show(Rectangle rectangle){
        System.out.println(rectangle.getShapeName() + "面积是" + String.format("%.1f", rectangle.area()));
        System.out.println(rectangle.getShapeName() + "周长是" + String.format("%.1f", rectangle.perimeter()));
    }
}
