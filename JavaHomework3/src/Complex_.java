public class Complex_ {
    private double a;
    private double b;

    //构造函数1
    public Complex_(){
//        this.a = 0;
//        this.b = 0;
        new Complex_(0,0);
    }

    //构造函数2
    public Complex_(double a){
//        this.a = a;
//        this.b = 0;
        new Complex_(a,0);
    }

    //构造函数3
    public Complex_(double a,double b){
        this.a = a;
        this.b = b;
    }

    //获取实部值
    public double getRealPart(){
        return this.a;
    }

    //获取虚部值
    public double getImaginaryPart(){
        return this.b;
    }

    //重写toString方法
    @Override
    public String toString(){
        return a+" + "+b+"i";
    }

    //返回改复数的模
    public double absolute(){
        return Math.sqrt(this.a*this.a + this.b*this.b);
    }

    //复数的加法运算
    public static Complex_ addition(Complex_ A,Complex_ B){
        return new Complex_(A.a+B.a,A.b+B.b);
    }

    //复数的减法运算
    public static Complex_ subtraction(Complex_ A,Complex_ B){
        return new Complex_(A.a-B.a,A.b-B.b);
    }

    //复数的乘法运算
    public static Complex_ multiplication(Complex_ A,Complex_ B){
        double a = A.a*B.a - A.b*B.b;
        double b = A.b*B.a + A.a*B.b;
        return new Complex_(a,b);
    }


    //复数的除法运算
    public static Complex_ division(Complex_ A,Complex_ B){
        if(B.a!=0|B.b!=0) {
            double a = (A.a * B.a + A.b * B.b) / (B.a*B.a + B.b*B.b);
            double b = (A.b * B.a - A.a * B.b) / (B.a*B.a + B.b*B.b);
            return new Complex_(a, b);
        }
        else return new Complex_(0,0);
    }


    //测试
    public static void main(String[] args) {
        Complex_ A = new Complex_(5,5);
        Complex_ B = new Complex_(5,5);
//        Complex_ C = Complex_.addition(A,B);
        Complex_ C = Complex_.multiplication(A,B);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());

    }
}
