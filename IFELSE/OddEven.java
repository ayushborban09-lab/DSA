package IFELSE;

import java.util.Scanner;

public class OddEven { 
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter no ; ");
        int n = sb.nextInt();
        //only  single output 
        // if (n%2==0 ) 
            // System.out.println(" evne no");  
        
        // else System.out.println("odd no.");
        if (n%2==0) {
            System.out.println("even no ");
            System.out.println("rammmm");
            
        }
        else {
            System.out.println("odd no");
            System.out.println("kala");
        }
    }
    
}
