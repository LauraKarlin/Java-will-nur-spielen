import java.awt.*;

public class SimpleSizedPanel extends SizedPanel {
    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(50, 60, 45, 80);
        g.fillRect(150, 60, 45, 80);
        g.fillOval(100,200,60,80);
    }

}
