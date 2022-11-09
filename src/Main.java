import java.util.Scanner;
import java.lang.String;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double a;
        System.out.println("Enter a: ");
        a = sc.nextInt();
        double b;
        System.out.println("Enter b :");
        b = sc.nextInt();
        double c;
        System.out.println("Enter c :");
        c = sc.nextInt();
        float x;
        System.out.println("Enter x (float) : ");
        x = sc.nextFloat();

        float x1 = x;
        double z1 = (a+b) / (2);
        //System.out.println("z1"+z1);
        double z2 = (x * x * x);
        //System.out.println("z2"+z2);
        double z3 = (x * x);
       // System.out.println("z3"+z3);

        double z4 = (a+b) * (a+b);
       // System.out.println("z4"+z4);

        double z5 = (z1*z2) + z4*z3 +a+b+c;
        //System.out.println("z5"+z5);

        //System.out.println("1st: " + (a+b/2));
        //System.out.println("2nd: " + Math.pow(x,3));
        //System.out.println("3rd: " + Math.pow(a+b,2));
       // System.out.println("4th: " + Math.pow(x,2));

       // double ans = (((a+b)/2)*Math.pow(x,3)) + (Math.pow(a+b,2) * Math.pow(x,2)) + a + b + c;
        //System.out.println("ans: " +ans);


        System.out.println("the value of Polynomial is : " + z5);


    }
}