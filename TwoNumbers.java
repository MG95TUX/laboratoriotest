import java.util.Scanner;
public class TwoNumbers{
   public static void main (String args[])
      {Scanner reader= new Scanner(System.in);
       System.out.println("dammi due numeri separati da un invio");
       double x = reader.nextDouble();
       double y = reader.nextDouble();
       System.out.println(x + y);
       System.out.println(x * y);
       System.out.println( (x + y)/2 );
       if (x>y){
                System.out.println(x + " è il più grande," + y + " è il più piccolo");
                if (x-y<0) System.out.println(x-y*(-1));
                else System.out.println(x-y);
               }
       else if (x<y) {System.out.println(y + " è il più grande," + x + " è il più piccolo");
                      if (y-x<0) System.out.println(y-x*(-1));
                      else System.out.println(y-x);
                      }
       else System.out.println("sono uguali");
      }
}
