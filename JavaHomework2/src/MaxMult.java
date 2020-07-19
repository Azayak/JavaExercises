import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxMult {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        //读入数字字符串
        int n = in.nextInt();
        int length = s.length();
        int[] array = new int[length];
        long[] res = new long[length-n];

        //将数字字符串中数字存储在int数组中
        for(int i=0;i<length;i++){
            array[i] = Integer.valueOf(s.charAt(i)-'0');
//            System.out.println(array[i]);
        }
        long temp;
        long max = 0;

        //计算k乘积
        for(int i=0;i<length-n;i++) {
            temp = 1;
            for (int j = 1; j <= n; j++) {
                temp = temp * array[i + j];
            }
            res[i] = temp;
            if(res[i]>max) max = res[i];
        }
        System.out.println(max);
    }
}
