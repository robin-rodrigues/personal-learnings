import client.ShapeClient;
import shape.Circle;
import shape.Shape;

public class PrototypeMethodExample {
    public static void main(String[] args) {
        Shape circlePrototype = new Circle("red");

        ShapeClient client = new ShapeClient(circlePrototype);

        Shape redCircle = client.createShape();

        redCircle.draw();
    }
}