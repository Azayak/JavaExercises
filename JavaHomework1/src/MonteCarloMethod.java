import java.util.Scanner;

public class MonteCarloMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入投掷次数
        int n = in.nextInt();
        int[] res = new int[n];
        int[] sum = new int[2];
        for(int i=0;i<n;++i){
            res[i] = shootRes(shoot());
            sum[res[i]%2]++;
        }
        double GAILV = (double)sum[1]/(double)n;
        System.out.println("落点为奇数的概率为:"+GAILV);
    }
    public static double[] shoot(){//随机进行投掷
        double[] pos = new double[2];
        pos[0] = Math.random()*2-1;
        pos[1] = Math.random()*2-1;
//        System.out.println("("+pos[0]+","+pos[1]+")");
        return pos;
    }
    public static int shootRes(double pos[]){//判断投掷结果所在的区域编号
        if(pos[0]<-1||pos[0]>1||pos[1]<-1||pos[1]>1) return -1;
        else if(pos[0]<0) return 1;
        else if(pos[1]<0) return 4;
        else if(pos[0]+pos[1]<1) return 3;
        else return 2;
    }
}
