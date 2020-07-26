import java.util.Scanner;

public class Complex_Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first complex number:");
        double a1,b1;
        a1 = in.nextDouble();
        b1 = in.nextDouble();
        System.out.println("Enter the second complex number:");
        double a2,b2;
        a2 = in.nextDouble();
        b2 = in.nextDouble();
        in.close();
        Complex_ A = new Complex_(a1,b1);
        Complex_ B = new Complex_(a2,b2);
        System.out.println("| "+A.toString()+" | = "+A.absolute());
        System.out.println("| "+B.toString()+" | = "+B.absolute());
        System.out.println(A.toString()+" + "+B.toString()+" = "+Complex_.addition(A,B).toString());
        System.out.println(A.toString()+" - "+B.toString()+" = "+Complex_.subtraction(A,B).toString());
        System.out.println(A.toString()+" * "+B.toString()+" = "+Complex_.multiplication(A,B).toString());
        System.out.println(A.toString()+" / "+B.toString()+" = "+Complex_.division(A,B).toString());
    }
}
