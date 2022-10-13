import java.awt.*;

public class SimpleRectangle extends GeometricObject {
    public SimpleRectangle(Vertex pos, double width, double height, Color color) {
        super(pos, width, height,color);
    }
    public SimpleRectangle(Vertex pos, double width, double height) {
        super(pos, width, height);
    }

    public SimpleRectangle(double x, double y, double width, double height) {
        super(new Vertex(x, y), width, height);
    }
}