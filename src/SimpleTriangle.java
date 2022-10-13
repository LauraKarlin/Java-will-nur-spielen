import java.awt.*;

public class SimpleTriangle extends GeometricObject {
    public SimpleTriangle(Vertex pos, double width, Color color) {
        super(pos, width, width / 2 * Math.sqrt(3),color);
    }
    public SimpleTriangle(Vertex pos, double width) {
        super(pos, width, width / 2 * Math.sqrt(3));
    }

    public SimpleTriangle(double x, double y, double width) {
        super(new Vertex(x, y), width, width / 2 * Math.sqrt(3));
    }

    @Override
    public double area() {
        return 0.5 * width * height;
    }

    @Override
    public double circumference() {
        return width * 3; //gleichseitig
    }

    @Override
    public String toString() {
        return "SimpleTriangle: " + super.toString();
    }
}
