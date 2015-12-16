import java.util.Scanner;
public class FactorGeneratorTester{
   public static void main(String args[]){
      int y;
      Scanner console = new Scanner(System.in);
      System.out.println("dammi un numero intero");
      y = console.nextInt();
      FactorGenerator numero = new FactorGenerator(y);
      boolean check = true;
      System.out.println("I fattori primi sono:");
          while (check) {
             System.out.println(numero.nextFactor());
             check = numero.hasMoreFactor();
             }
}
}
