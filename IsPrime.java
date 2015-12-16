import java.util.Scanner;
public class IsPrime{
   public static void main(String args[]){
      int y;
      Scanner console = new Scanner(System.in);
      System.out.println("dammi un numero intero");
      y = console.nextInt();
      FactorGenerator numero = new FactorGenerator(y);
      int k = numero.nextFactor();
      boolean x = numero.hasMoreFactor();
      if (x == true) System.out.println("Non e' primo");
      else System.out.println("E' primo");
}
}
