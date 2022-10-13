import javax.swing.*;
import java.awt.*;

public class SizedPanel extends JPanel {
    int preferredWidth = 400;
    int preferredHeight = 300;

    public SizedPanel(int w, int h) {
        this.preferredWidth = w;
        this.preferredHeight = h;
    }

    public SizedPanel() {
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(preferredWidth, preferredHeight);
    }
}
