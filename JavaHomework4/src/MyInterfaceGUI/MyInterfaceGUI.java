package MyInterfaceGUI;

//public class MyPolymorphismGUI {
//}

import javafx.scene.shape.Circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MyInterfaceGUI {

    public static final double Pi = 3.1415926;

    public static void main(String[] args) {
        MyGraphic[] myGraphics = new MyGraphic[4];

        MyTime myTime = new MyTime(0,0,0);
        MyCircle myCircle = new MyCircle(200,200,600,Color.RED);
        myGraphics[0] = myCircle;
        myGraphics[1] = getHourLine(myTime);
        myGraphics[2] = getMinuteLine(myTime);
        myGraphics[3] = getSecondLine(myTime);


        DrawPanel panel = new DrawPanel(myGraphics);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(300,300);
        application.setVisible(true);


        Thread t = new Thread(){
          public void run(){
              while(true){
                  try {
                      Thread.sleep(50);
                  } catch (InterruptedException e){
                      System.err.println(e);
                  }

//                  System.out.println(myTime.getHour()+" : "+myTime.getMinute()+" : "+myTime.getSecond());
                  MyCircle myCircle = new MyCircle(200,200,600,Color.RED);
                  myGraphics[0] = myCircle;
                  myGraphics[1] = getHourLine(myTime);
                  myGraphics[2] = getMinuteLine(myTime);
                  myGraphics[3] = getSecondLine(myTime);

                  myTime.incrementSecond();
                  panel.updateUI();
              }
          }
        };
        t.start();



    }

    public static MyLine getHourLine(MyTime myTime){
        double hour = (double) myTime.getHour()%12;
        int x = (int)(280 * Math.cos((hour-3)/12*2*Pi) + 500);
        int y = (int)(280 * Math.sin((hour-3)/12*2*Pi) + 500);
        MyLine myHourLine = new MyLine(500,500,x,y,Color.red);
        return myHourLine;
    }

    public static MyLine getMinuteLine(MyTime myTime){
        double minute = (double) myTime.getMinute();
        int x = (int)(250 * Math.cos((minute-15)/60*2*Pi) + 500);
        int y = (int)(250 * Math.sin((minute-15)/60*2*Pi) + 500);
        MyLine myMinuteLine = new MyLine(500,500,x,y,Color.BLUE);
        return myMinuteLine;
    }

    public static MyLine getSecondLine(MyTime myTime){
        double second = (double) myTime.getSecond();
        int x = (int)(200 * Math.cos((second-15)/60*2*Pi) + 500);
        int y = (int)(200 * Math.sin((second-15)/60*2*Pi) + 500);
        MyLine mySecondLine = new MyLine(500,500,x,y,Color.BLACK);
        return mySecondLine;
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
