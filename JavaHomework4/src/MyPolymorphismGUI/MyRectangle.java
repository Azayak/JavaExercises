package MyPolymorphismGUI;

import java.awt.Color;
import java.awt.Graphics;

public class MyRectangle extends MyGraphic{
    private int x;
    private int y;
    private int width;
    private int height;
    private Color color;

    public MyRectangle(int x, int y, int width, int height, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.drawRect(this.x, this.y, this.width, this.height);
    }
}
