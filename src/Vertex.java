public class Vertex {

    public double x;
    public double y;

    public Vertex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }

    public Vertex skalarMult(double s) {
        return new Vertex(x * s, y * s);
    }

    public void skalarMultMod(double s) {
        x *= s;
        y *= s;
    }

    public Vertex add(Vertex v2) {
        return new Vertex(x + v2.x, y + v2.y);
    }

    public void addMod(Vertex v2) {
        x += v2.getX();
        y += v2.getY();
    }

    public Vertex sub(Vertex v2) {
        return new Vertex(x - v2.x, y - v2.y);
    }

    public void subMod(Vertex v2) {
        x -= v2.getX();
        y -= v2.getY();

    }

    public double distance(Vertex v2) {
        double modX = x - v2.x;
        double modY = y - v2.y;

        return Math.sqrt(modX * modX + modY * modY);
    }

    public Vertex normalized() {
        double mod = length();
        return skalarMult(1 / mod);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object thatObj) {
        if (thatObj instanceof Vertex that) {
            return x == that.x && y == that.y;
        }
        return false;
    }
}
