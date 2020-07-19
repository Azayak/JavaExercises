import java.util.Scanner;

public class RunLengthEncoding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //读入字符串s
        String s = in.nextLine();
        String en = encode(s);
        System.out.println("en: "+en);
        String de = decode(en);
        System.out.println("de: "+de);
    }


    //压缩函数
    public static String encode(String s){
        StringBuffer bff = new StringBuffer();
        int length = s.length();
        int i = 1;
        int count = 1;
        char ptr;
        ptr = s.charAt(0);
        while (i < length) {
            ptr = s.charAt(i);
            if (ptr < 'A' || ptr > 'z'||(ptr>'Z'&&ptr<'a')) {
                //错误输入
                System.out.println("Error input");
                System.exit(-1);
            }
            if(ptr==s.charAt(i-1)){
                count++;
                i++;
            }
            if (ptr != s.charAt(i - 1)) {
                if(count>1){
                    bff.append(count);
                }
                bff.append(s.charAt(i-1));
                count = 1;
                i++;
            }
        }
        if(count>1){
            bff.append(count);
        }
        bff.append(s.charAt(length-1));
        String res = bff.toString();
        return res;
    }

    //解压函数
    public static String decode(String s){
        StringBuffer bff = new StringBuffer();
        StringBuffer num = new StringBuffer();
        int number;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num.append(s.charAt(i));
//                System.out.println(num.toString());
            }
            else{
                if(num.length()>0){
                    number = Integer.valueOf(num.toString());
//                    System.out.println("number "+i+": "+number);
                    for(int j=0;j<number;j++){
                        bff.append(s.charAt(i));

                    }
                    num.delete(0,num.length());
                }
                else{
                    bff.append(s.charAt(i));
//                    System.out.println(s.charAt(i));
                }
            }
        }
        String res = bff.toString();
        return res;
    }

}
