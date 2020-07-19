import java.util.Scanner;

public class UPCCode {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String s = in.next();//读入数字字符串
        int length = s.length();//获取字符串长度
        int sum = 0;
        int pos = 0;
        int[] array = new int[length];
        for(int i=0;i<length;++i){//遍历转换为数组
            array[i] = Integer.valueOf(s.charAt(i)-'0');
//            System.out.println("Array["+i+"]="+array[i]);
        }

        for(int k=0;k<length;++k){//遍历判断是否满足校验位条件
            sum = array[k] + array[1] + array[3] + array[5] + array[7]
                    + array[9]  + 3*(array[0]+ array[2]
                    + array[4]+ array[6]+ array[8]+ array[10]);
            if(sum%10==0){
                pos = k;
                break;
            }
        }
//        System.out.println("pos:"+pos);
//        System.out.println("sum:"+sum);
        //校验位与原数组相连并输出
        String checknum = String.valueOf(array[pos]);
        String res;
        res = s.concat(checknum);
        System.out.println(res);
    }
}
