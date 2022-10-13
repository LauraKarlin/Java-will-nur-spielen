import java.awt.*;

public class SimplePaintableRectangle extends SimpleOval implements Paintable{
    public SimplePaintableRectangle(double x, double y, double width, double height,Color color) {
        super(x, y, width, height,color);
    }
    public SimplePaintableRectangle(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void paintTo(Graphics g) {
        g.fillRect((int) pos.x, (int) pos.y, (int) width, (int) height);
        g.setColor(color);
    }
}
