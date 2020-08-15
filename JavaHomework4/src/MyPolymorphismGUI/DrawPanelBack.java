package MyPolymorphismGUI;

//public class DrawPanelBack {
//}

//import java.awt.Color;
//import java.awt.Graphics;
//import javax.swing.JPanel;
//
//public class DrawPanel extends JPanel {
//    private MyLine[] lines;
//    private MyCircle[] circles;
//    private MyRectangle[] rectangles;
//    private int type;
//    private static final int NONE = 0;
//    private static final int LINE = 1;
//    private static final int CIRCLE = 2;
//    private static final int RECTANGLE = 3;
//    private static final int NULL = 4;
//    private static final int NOTARRAY = 5;
//
//    public DrawPanel() {
//        this.setBackground(Color.BLACK);
//        this.type = 0;
//    }
//
//    public DrawPanel(MyLine[] lines) {
//        this.setBackground(Color.WHITE);
//        if (lines == null) {
//            this.type = 4;
//        } else if (!lines.getClass().isArray()) {
//            this.type = 5;
//        } else {
//            this.lines = lines;
//            this.type = 1;
//        }
//
//    }
//
//    public DrawPanel(MyCircle[] circles) {
//        this.setBackground(Color.WHITE);
//        if (circles == null) {
//            this.type = 4;
//        } else if (!circles.getClass().isArray()) {
//            this.type = 5;
//        } else {
//            this.circles = circles;
//            this.type = 2;
//        }
//
//    }
//
//    public DrawPanel(MyRectangle[] rectangles) {
//        this.setBackground(Color.WHITE);
//        if (rectangles == null) {
//            this.type = 4;
//        } else if (!rectangles.getClass().isArray()) {
//            this.type = 5;
//        } else {
//            this.rectangles = rectangles;
//            this.type = 3;
//        }
//
//    }
//
//
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        int var3;
//        int var4;
//        switch(this.type) {
//            case 1:
//                MyLine[] var9;
//                var4 = (var9 = this.lines).length;
//
//                for(var3 = 0; var3 < var4; ++var3) {
//                    MyLine line = var9[var3];
//                    line.draw(g);
//                }
//
//                return;
//            case 2:
//                MyCircle[] var8;
//                var4 = (var8 = this.circles).length;
//
//                for(var3 = 0; var3 < var4; ++var3) {
//                    MyCircle circle = var8[var3];
//                    circle.draw(g);
//                }
//
//                return;
//            case 3:
//                MyRectangle[] var5;
//                var4 = (var5 = this.rectangles).length;
//
//                for(var3 = 0; var3 < var4; ++var3) {
//                    MyRectangle rectangle = var5[var3];
//                    rectangle.draw(g);
//                }
//
//                return;
//            case 4:
//                g.drawString("在DrawPanel的构造函数中，你传递的引用参数是NULL！", 50, 50);
//                break;
//            case 5:
//                g.drawString("在DrawPanel的构造函数中，你传递的引用参数必须是某个形状的数组类型！", 50, 50);
//        }
//
//    }
//
//}

