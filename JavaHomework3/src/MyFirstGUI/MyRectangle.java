package MyFirstGUI;

import java.awt.*;

public class MyRectangle {
    int x;
    int y;
    int width;
    int height;
    Color color;

    public MyRectangle(int x,int y,int width,int height,Color color){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }


    public void draw(Graphics g){
        g.setColor(this.color);
        g.drawRect(x,y,width,height);
    }
}