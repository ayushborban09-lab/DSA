package basic_class; 
import java.util.Scanner;


public class inputforuser {
    // public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the radius: ");
        // double r = sc.nextDouble();
        
        // double a = 3.14*r*r;
        // System.out.println("area = ");
        // System.out.println(a);
       
        //  System.out.println("enter the number: ");
      // int n = sc.nextInt();
        
       // int  square = n*n;
       // System.out.println("square");
       // System.out.println(square);

    //    take 2-3 no in input
    //    public static void main(String[] args) {
    //      Scanner ayush = new Scanner(System.in);
    //      int a = ayush.nextInt();
    //      int b = ayush.nextInt();
    //      int c = ayush.nextInt();

    //      System.out.println( a+b+c);
    //    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter price");
        double p =sc.nextInt();
        System.out.println("enter rate");
        double r = sc.nextInt();
        System.out.println("enter time");
        double t = sc.nextInt();
        double si = r*p*t/100;
        System.out.println(si);

    }
     
      




    }
    

