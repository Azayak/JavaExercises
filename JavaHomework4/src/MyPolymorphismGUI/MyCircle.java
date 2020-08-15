package MyPolymorphismGUI;

import java.awt.Color;
import java.awt.Graphics;

public class MyCircle extends MyGraphic{
    private int r;
    private int x;
    private int y;
    private Color color;

    public MyCircle(int x, int y, int r, Color color) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.drawOval(this.x, this.y, this.r, this.r);
    }
}
