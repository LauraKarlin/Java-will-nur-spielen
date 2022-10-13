import util.ShowInFrame;

public class Test {
    public static void main(String[] args) {

        //EXPERIMENTAL!!! NICHT ABGEBEN!!!
        //ShowInFrame.show("AAAAAAAAAAA", new PaintablePanel(new PaintableStar(100,100,12,50,10, Color.BLUE)));

        PaintableImage pi = new PaintableImage("duck.png");
        ShowInFrame.show(new PaintablePanel(pi));
    }
}