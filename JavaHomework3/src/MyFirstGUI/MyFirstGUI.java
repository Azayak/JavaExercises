package MyFirstGUI;

import homework3.DrawPanel;
import homework3.MyLine;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyFirstGUI {
    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel(generateLines());
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
}
