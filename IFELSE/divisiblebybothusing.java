/*take postive integer input and print 
________if no. is /5
________if no. is /3 
________if no. is /5 or 3
________if no. is !/5 or 3(not divisible by)
*/
package IFELSE;

import java.util.Scanner;

public class divisiblebybothusing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter no.");
        int n = sc.nextInt();
        
        if (n%5==0 && n%3==0) { 
            System.out.println("divisible by both");
        }
         else if (n%5==0) System.out.println("divide by 5 only");
         else if (n%3==0)System.out.println("divisible by 3");
         else System.out.println("not divisible by 3 and 4");


    }
    
}
