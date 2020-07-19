import java.util.Scanner;

public class RandomWalkers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入行走次数n，行走个体数trails
        int n,trials;
        n = in.nextInt();
        trials = in.nextInt();
        int[][] poss = new int[trials][2];
        int[] dis2s = new int[trials];
        double sum=0,avg;

        //双重循环进行实验
        for(int i=0;i<trials;++i) {
            for (int j = 0; j < n; ++j) {
                poss[i] = RandomWalker.Walking(poss[i]);
                System.out.println("("+poss[i][0]+","+poss[i][1]+")");
            }
            System.out.println("Rabbit"+(i+1)+"'s Distance2: "+RandomWalker.Distance2(poss[i]));
            dis2s[i] = RandomWalker.Distance2(poss[i]);
        }
        //遍历计算距离平方平均值
        for(int x:dis2s) sum += x;
        System.out.println("The sum dis2: "+sum);
        avg = sum/trials;
        System.out.println("The avg dis2: "+avg);
    }
}
