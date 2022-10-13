import java.awt.*;

public class GeometricObject {
    public Vertex pos;
    public double width;
    public double height;
    public Color color;

    public GeometricObject(Vertex pos, double width, double height,Color color) {
        this.pos = pos;
        this.width = width;
        this.height = height;
        this.color=color;

        if (width < 0) {
            this.width = -width;
        }
        if (height < 0) {
            this.height = -height;
        }
        if (pos.x < 0) {
            this.pos.x = -pos.x;
        }
        if (pos.y < 0) {
            this.pos.y = -pos.y;
        }
    }

    public GeometricObject(Vertex pos, double width, double height) {
        this(pos, width, height, new Color(150, 0, 128));
    }

    public GeometricObject(double x, double y, double width, double height) {
        this(new Vertex(x, y), width, height);
    }

    public GeometricObject(double width, double height) {
        this(0, 0, width, height);
    }

    public GeometricObject(double length) {
        this(0, 0, length, length);
    }

    public GeometricObject() {
        this(0, 0, 10, 10);
    }

    public double circumference() {
        return (width + height) * 2;
    }

    public double area() {
        return width * height;
    }

    public boolean contains(Vertex v) {
        return v.x >= pos.x && v.x <= pos.x + width
                && v.y >= pos.y && v.y <= pos.y + height;
    }

    public boolean isLargerThan(GeometricObject g1) {
        return area() > g1.area();
    }


    public void moveTo(Vertex v1) {
        this.pos = v1;
    }

    public void moveTo(double x, double y) {
        moveTo(new Vertex(x, y));
    }

    public void move(Vertex v1) {
        moveTo(this.pos.add(v1));
    }

    public Vertex getPos() {
        return pos;
    }

    public void setPos(Vertex pos) {
        this.pos = pos;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (thatObject instanceof GeometricObject that) {
            return that.width == this.width && this.height == that.height && this.pos.equals(that.pos);
        }
        return false;
    }

    @Override
    public String toString() {
        return "width=" + width + " height=" + height + " pos=" + pos;
    }
}
