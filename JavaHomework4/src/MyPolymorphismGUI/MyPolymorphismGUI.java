package MyPolymorphismGUI;

//public class MyPolymorphismGUI {
//}

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyPolymorphismGUI {
    public static void main(String[] args) {
//        DrawPanel panel = new DrawPanel(generateLines());
//        DrawPanel panel = new DrawPanel(generateCircles());
        DrawPanel panel = new DrawPanel(generateRectangles());
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);
    }



    public static MyLine[] generateLines(){
        Random randomNmuber = new Random();
        MyLine[] lines;
        lines = new MyLine[5+randomNmuber.nextInt(5)];
        for(int count=0;count<lines.length;count++){
            int x1 = randomNmuber.nextInt(300);
            int y1 = randomNmuber.nextInt(300);
            int x2 = randomNmuber.nextInt(300);
            int y2 = randomNmuber.nextInt(300);

            Color color = new Color(
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256)
            );
            lines[count] = new MyLine(x1,y1,x2,y2,color);
        }
        return lines;
    }

    public static MyCircle[] generateCircles(){
        Random randomNmuber = new Random();
        MyCircle[] Circles;
        Circles = new MyCircle[5+randomNmuber.nextInt(5)];
        for(int count=0;count<Circles.length;count++){
            int x = randomNmuber.nextInt(300);
            int y = randomNmuber.nextInt(300);
            int r = randomNmuber.nextInt(300);

            Color color = new Color(
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256)
            );
            Circles[count] = new MyCircle(x,y,r,color);
        }
        return Circles;
    }

    public static MyRectangle[] generateRectangles(){
        Random randomNmuber = new Random();
        MyRectangle[] Rectangles;
        Rectangles = new MyRectangle[5+randomNmuber.nextInt(5)];
        for(int count=0;count<Rectangles.length;count++){
            int x = randomNmuber.nextInt(300);
            int y = randomNmuber.nextInt(300);
            int width = randomNmuber.nextInt(300);
            int height = randomNmuber.nextInt(300);

            Color color = new Color(
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256),
                    randomNmuber.nextInt(256)
            );
            Rectangles[count] = new MyRectangle(x,y,width,height,color);
        }
        return Rectangles;
    }
}
