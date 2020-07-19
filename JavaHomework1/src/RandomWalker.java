import java.util.Scanner;

public class RandomWalker {
    public static void main(String[] args) {
//        int n = Integer.valueOf(args[0]);
        Scanner in = new Scanner(System.in);
        //读入行走次数n
        int n = in.nextInt();
        if(n<0){
            System.out.println("Please input a positive integer number");
            System.exit(-1);
        }
        int[] pos = {0,0};
        for(int i=0;i<n;++i) {
            System.out.println("("+pos[0]+","+pos[1]+")");
            pos = Walking(pos);
        }
        System.out.println("Distance2: "+Distance2(pos));
    }

    public static int[] Walking(int pos[]){//随机行走函数
        int go = (int)(Math.random()*4);
        if(go==0)
            pos[0] += 1;
        else if(go==1)
            pos[0] -= 1;
        else if(go==2)
            pos[1] += 1;
        else
            pos[1] -= 1;
//        System.out.println("("+pos[0]+","+pos[1]+")");
        return pos;
    }

    public static int Distance2(int pos[]){//欧氏距离平方的计算
        int dis2 = pos[0]*pos[0] + pos[1]*pos[1];
//        System.out.println("Distance2: "+dis2);
        return dis2;
    }
}
