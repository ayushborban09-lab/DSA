package IFELSE;

import java.util.Scanner;

public class costprice {
     public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter cost price ; ");
        int cp = sb.nextInt();
         System.out.print("Enter selling price ; ");
        int sp = sb.nextInt();

      //   if (sp==cp) System.out.println("no profit");
      //   if (cp<sp) System.out.println("profittt"+(sp-cp));
      //   if(cp>sp) System.out.println("loss"+(cp-sp));
      
      if(cp>sp) System.out.println("loss " + (cp-sp));
      else if (cp<sp) System.out.println("profittt" + (sp-cp));
      else  System.out.println("no profit");

      
         
    
    
      }
}
