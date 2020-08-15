package MyInterfaceGUI;


import java.awt.*;

public class MyCircle extends MyGraphic implements MyGraphicMethod{
    public static final double Pi = 3.1415926;
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

    @Override
    public double getArea(){
        return (double)(Pi * r * r);
    }
}
