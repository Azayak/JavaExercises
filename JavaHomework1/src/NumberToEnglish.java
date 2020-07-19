import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberToEnglish {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long input = in.nextLong();
        boolean flag = input >= 0;
        //读入long数字，使用List进行分割
        List<Integer> list = new ArrayList<Integer>();
        int length;
        String s1,s2,s3;
        String zeroFlag;
        input = input >= 0 ? input : -input;
        zeroFlag = flag?"":"negative ";
        //记录正负号并取绝对值

        //分割处理
        while (input > 0) {
            list.add((int) input % 1000);
            input = input/1000;
        }
        length = list.size();
        if(length>3){
            //数字过大超出限制
            System.out.println("Too long to translate");
            System.exit(-1);
        }
        //为零时直接输出zero
        else if(length==0){
            System.out.println("zero");
        }
        //只有第一段
        else if(length==1){
            s1 = Below1000(list.get(0));
            System.out.println(zeroFlag+s1);
        }
        //两端
        else if(length==2){
            s2 = Below1000(list.get(1));
            if(list.get(0)>0) {
                s1 = Below1000(list.get(0));
                System.out.println(zeroFlag+s2+" thousand "+s1);
            }
            else{
                s1 = "";
                System.out.println(zeroFlag+s2+" thousand");
            }
        }
        //三段
        else if(length==3){
            s3 = Below1000(list.get(2));
            if(list.get(1)>0) {
                s2 = Below1000(list.get(1));
                if(list.get(0)>0) {
                    s1 = Below1000(list.get(0));
                    System.out.println(zeroFlag+s3+" million "+s2+" thousand "+s1);
                }
                else{
                    s1 = "";
                    System.out.println(zeroFlag+s3+" million "+s2+" thousand");
                }
            }
            else{
                s2 = "";
                if(list.get(0)>0) {
                    s1 = Below1000(list.get(0));
                    System.out.println(zeroFlag+s3+" million "+s1);
                }
                else{
                    s1 = "";
                    System.out.println(zeroFlag+s3+" million");
                }
            }
        }
        else{
            System.out.println("unknown error");
            System.exit(-1);
        }
    }


    public static String Below1000(int n){//对1000以下数字进行名称转换
        if(n<100) return Below100(n);//如果数字小于100，直接调用Below100函数得到结果
        int a,b;
        String s1,s2;
        a = n/100;
        b = n%100;
        s1 = Below20(a);
        //根据末尾是否为零分情况处理
        if(b>0)
            s2 = Below100(b);
        else
            s2 = "";
        return s1+" hundred "+s2;
    }

    public static String Below100(int n){//对100以下数字进行名称转换
        if(n<20) return Below20(n);//如果数字小于20，直接调用Below20函数得到结果
        int a,b;
        String s1,s2;
        a = n/10;
        b = n%10;
        switch (a){
            case 2:
                s1 = "twenty";
                break;
            case 3:
                s1 = "thirty";
                break;
            case 4:
                s1 = "forty";
                break;
            case 5:
                s1 = "fifty";
                break;
            case 6:
                s1 = "sixty";
                break;
            case 7:
                s1 = "seventy";
                break;
            case 8:
                s1 = "eighty";
                break;
            case 9:
                s1 = "ninety";
                break;
            default:
                s1 = "error in below100";
        }
        if(b>0)
            s2 = Below20(b);
        else
            s2 = "";

        return  s1+" "+s2;
    }

    public static String Below20(int n){//对20以下数字进行名称转换
        switch (n){
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "error in below20";
        }
    }
}