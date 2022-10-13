import javax.swing.*;
import java.awt.*;

public class PaintableImage extends JPanel implements Paintable {
    MyImage mi;

    public PaintableImage(MyImage mi) {
        this.mi = mi;
    }

    public PaintableImage(String name) {
        this.mi = new MyImage(name);
    }

    @Override
    public void paintTo(Graphics g) {
        g.drawImage(mi.get(),0,0,this);
    }
}
