


package MyInterfaceGUI;


import java.awt.*;

public class MyLine extends MyGraphic implements MyGraphicMethodNoArea{
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private Color color;

    public MyLine(int x1, int y1, int x2, int y2, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }

}
