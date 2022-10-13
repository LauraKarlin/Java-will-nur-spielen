import java.awt.*;

//EXPERIMENTAL!!! NICHT ABGEBEN!!!
public class PaintableStar implements Paintable {
    double x, y;
    public int radInner, radOuter, zacken;
    public Color color;

    public PaintableStar(double x, double y, int radInner, int radOuter, int zacken, Color color) {
        this.x = x;
        this.y = y;
        this.radInner = radInner;
        this.radOuter = radOuter;
        this.zacken = zacken;
        this.color = color;
    }

    public PaintableStar(Vertex pos, int radInner, int radOuter, int zacken, Color color) {
        this(pos.x, pos.y, radInner, radOuter, zacken, color);
    }

    @Override
    public void paintTo(Graphics g) {
        double[] xpoly = {x,x+radInner,x+radOuter,x+radInner,x,x-radInner,x-radOuter,x-radInner};
        double[] ypoly = {y-radOuter,y-radInner,y,y+radInner,y+radOuter,y+radInner,y,y-radInner};
        final int[] xp = new int[xpoly.length];
        final int[] yp = new int[ypoly.length];
        for (int i = 0; i < xpoly.length;i++) xp[i]= (int) xpoly[i];
        for (int i = 0; i < ypoly.length;i++) yp[i]= (int) ypoly[i];
        System.out.println(xpoly.length+" "+ypoly.length);
        Polygon p = new Polygon(xp, yp, xp.length);
        g.setColor(color);
        g.fillPolygon(p);
        System.out.println(p.getBounds());
    }
}
