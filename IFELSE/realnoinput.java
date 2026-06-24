// take real no. input and check input and check if it is an integer or not
package IFELSE;

import java.util.Scanner;

public class realnoinput {
     public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter no ; ");
        double n = sb.nextDouble();
        int x = (int)n;

        if(n - x == 0) System.out.println(" is an integer");
        else System.out.println("not a integer");
    
}
}