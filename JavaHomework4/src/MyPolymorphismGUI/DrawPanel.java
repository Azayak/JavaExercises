package MyPolymorphismGUI;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {


    private MyGraphic[] myGraphics;

    private int type;
    private static final int NONE = 0;
    private static final int NULL = 1;
    private static final int NOTARRAY = 2;

    public DrawPanel() {
        this.setBackground(Color.BLACK);
        this.type = 0;
    }

    public DrawPanel(MyGraphic[] myGraphics){
        this.setBackground(Color.WHITE);
        if (myGraphics == null) {
            this.type = NULL;
        } else if (!myGraphics.getClass().isArray()) {
            this.type = NOTARRAY;
        } else {
            this.myGraphics = myGraphics;
        }

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(MyGraphic myGraphic:myGraphics){
            myGraphic.draw(g);
        }


//        int var3;
//        int var4;
//
//        switch(this.type) {
//            case NULL:
//                g.drawString("在DrawPanel的构造函数中，你传递的引用参数是NULL！", 50, 50);
//                break;
//            case NOTARRAY:
//                g.drawString("在DrawPanel的构造函数中，你传递的引用参数必须是某个形状的数组类型！", 50, 50);
//            default:
//                MyGraphic[] myGraphics_;
//                var4 = (myGraphics_ = this.myGraphics).length;
//
//                for(var3 = 0; var3 < var4; ++var3){
//                    MyGraphic graphic = myGraphics_[var3];
//                    graphic.draw(g);
//                }
//
//                return;
//
//        }


    }

}
