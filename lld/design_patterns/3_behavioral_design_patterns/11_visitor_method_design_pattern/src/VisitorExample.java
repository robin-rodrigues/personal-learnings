import java.util.ArrayList;
import java.util.List;

public class VisitorExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Square());
        shapes.add(new Triangle());

        AreaCalculator areaCalculator = new AreaCalculator();
        for(Shape shape: shapes) {
            shape.accept(areaCalculator);
        }

        System.out.println("Total area: " + areaCalculator.getTotalArea());
    }
}